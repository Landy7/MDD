package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess

import org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin
import org.xtext.example.mydsl2.group16.greedySnake.InitialFireSpecification
import org.xtext.example.mydsl2.group16.greedySnake.InitialObstacleSpecificatin
import org.xtext.example.mydsl2.group16.greedySnake.InitialFoodSpecificatin
import org.xtext.example.mydsl2.group16.greedySnake.IconTag
import java.util.ArrayList
import org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification

class PlayerSnake extends GeneralGenerator{
	
	new(ModelPreprocessor mpp){
		super (mpp)
	}
	
	def generate(IFileSystemAccess fsa){
		fsa.generateFile('''«generatePlayerSnakeClassFileName()»''',generatePlayerSnake())
	}
	
	def generatePlayerSnake()'''
			package «generateSnakePackage»;
			
			import javax.swing.ImageIcon;
			
			import javax.swing.JLabel;
			import javax.swing.JOptionPane;
			import java.util.LinkedList;
			import java.awt.Image;
			import java.util.Deque;
			import java.util.Iterator;
			
			import «generateGamePackage».*;
			
			public class PlayerSnake {
				private MainWindow GameUI;//母窗体,即游戏主界面
				private Foodset food;
				private Obstacle obstacle;
				/*
				 * 这里说明一下，由于游戏的主界面类时MainWindow，而PlayerSnake类需要和MainWindow交换一些信息，即两个类有通信需求，
				 * 故需要把MainWindow类作为PlayerSnake构造函数的参数以达到能访问其中变量和函数的目的
				 */
				private Thread run;
				private Direction direction = Direction.RIGHT;//蛇当前前进的方向,初始化默认向右移动
				private int speed = 300;//用于描述蛇移动速度的变量，其实是作为蛇刷新线程的时间用的
				«gs.snakes.join("",[fo | generatePlaySnake(fo)])»
				}
				
				//snake move
				«gs.snakes.join("",[o | generateMove(o)])»
				
					
					if(checkDeath(next_coor))//判断下一步是否死亡
					{
						new Music("music//over.wav").start();
						GameUI.setIsrun(false);
						quit();
						
						
						int result=JOptionPane.showConfirmDialog(null, "Game over! Try again?", 
								"Information", JOptionPane.YES_NO_OPTION);
						if(result==JOptionPane.YES_NO_OPTION)
						{
							GameUI.restart();
						}
						else
						{
							GameUI.setPause(true);
						}
					}
					else
					{
						Body next_node = new Body(next_coor,headIcon[headIconTag]);
						body.addFirst(next_node);//添头
						//modify
						//GameUI.map[next_node.coor.y][next_node.coor.x] = 1;//标记为蛇身体节点
						GameUI.setMap(next_node.coor.y, next_node.coor.x, 1);
						next_node.label.setVisible(true);
						GameUI.add(next_node.label);
						
						if(!checkEat(next_coor))//没吃到食物就去尾，否则不用去掉，因为添加的头刚好是吃到一个食物后增长的一节
						{
							Body tail = body.pollLast();//去尾
							//GameUI.map[tail.coor.y][tail.coor.x] = 0;//标记为空闲
							GameUI.setMap(tail.coor.y, tail.coor.x, 0);
							tail.label.setVisible(false);
							GameUI.remove(tail.label);
							//添头去尾实现移动
						}
					}
				}
				
				//if snake died
				«gs.obstacles.join("",[o | CheckDeath(o)])»
				
				«gs.foods.join("",[fd | 
					gs.snakes.join("",[sk | CheckEat(fd,sk)])
				])»
				
				
				public void quit(){
					quit = true;
				}
				
				public void setDirection(Direction direction){
					this.direction = direction;
				}
				
				public Direction getDirection(){
					return direction;
				}
				
				public void setSpeed(int speed){
					this.speed = speed;
				}
				
				public void resetSpeed(){
					this.speed = defaultSpeed;
				}
				
				public void setDefaultSpeed(int speed){
					this.defaultSpeed = speed;
				}
				
				public void setHeadIcon(int tag){
					headIconTag = tag;
				}
				
				public void setBodyIcon(int tag){
					bodyIconTag = tag;
				}
				
				public int getBulletNum(){
					return bulletNumber;
				}
				
				public Coordinate getHeadCoor(){
					return body.getFirst().coor;
				}
				
				public synchronized void goDie(){
					quit();
					for (Iterator<Body> iter = body.iterator(); iter.hasNext();) {
						Body node = iter.next();
						node.label.setVisible(false);
						GameUI.remove(node.label);
					}
				}
				
				public void fire(Coordinate snakehead,Coordinate target,Direction d){
					new Fire(snakehead,target,d);
					bulletNumber--;
					GameUI.getWeaponLabel().setText("" + bulletNumber);//刷新界面上显示的子弹数目
				}
				
				public synchronized void show(){
					for (Iterator<Body> iter = body.iterator(); iter.hasNext();) {
						Body node = iter.next();
						node.label.setBounds(IndexToPixel.getXPixel(node.coor.x), 
								IndexToPixel.getYPixel(node.coor.y), 20, 20);
						node.label.setIcon(bodyIcon[bodyIconTag]);
					}
					Body node = body.getFirst();
					node.label.setIcon(headIcon[headIconTag]);
				}
				
				public void MoveThread(){
					run = new Thread() {
						public void run() {
							while (!quit) 
							{
								try {
									Thread.sleep(speed);
								} catch (InterruptedException e) {
									e.printStackTrace();
									break;
								}
								
								if(!GameUI.getPause() && GameUI.getIsrun())
								{	
									move();
									Write2file.PrintMap(GameUI.getMap(),«'''"'''+gs.map.join("",[m | m.map])+'''"'''»);
									if(quit)
										break;
									show();
								}
							}
							System.out.println("Player thread exit...");
						}
					};
					run.start();
				}
				
				public class Fire extends Thread{
					private Coordinate fireCoor;
					private ImageIcon fireIcon;
					private JLabel fireLabel;
					private Coordinate target;
					private boolean quit = false;
					private Direction moveDirection;
					private Coordinate snakehead;
					//modify---generatefire
					«gs.fire.join("",[o | generateFire(o)])»
					
					    //初始化火焰起始坐标
					    if(moveDirection == Direction.UP)
						{
							fireCoor = new Coordinate(snakehead.x,snakehead.y-1);
							
							
						}
						else if(moveDirection == Direction.DOWN)
						{
							fireCoor = new Coordinate(snakehead.x,snakehead.y+1);
						}
						else if(moveDirection == Direction.LEFT)
						{
							fireCoor = new Coordinate(snakehead.x-1,snakehead.y);
						}
						else if(moveDirection == Direction.RIGHT)
						{
							fireCoor = new Coordinate(snakehead.x+1,snakehead.y);
						}
					    
					    GameUI.add(fireLabel);
					    show();
					    
					    this.start();
					}
					
					public void show(){
						if(fireCoor.x == target.x && fireCoor.y == target.y)
						{
							if(target.x < 0 || target.x > GameUI.getAreaWidth() || target.y < 0 || target.y > GameUI.getAreaHeight()){}//运动到屏幕外不播放音效
							else new Music("music//explode.wav").start();//击中障碍物播放音效
							
							fireLabel.setVisible(false);
							obstacle.removeOne(target);
							
							GameUI.remove(fireLabel);
							quit = true;
						}
						fireLabel.setVisible(false);
						fireLabel.setBounds(IndexToPixel.getXPixel(fireCoor.x), 
								IndexToPixel.getYPixel(fireCoor.y), 20, 20);
						fireLabel.setVisible(true);
					}
					
					public void move(){
						if(moveDirection == Direction.UP)
						{
							fireCoor.y--;
						}
						else if(moveDirection == Direction.DOWN)
						{
							fireCoor.y++;
						}
						else if(moveDirection == Direction.LEFT)
						{
							fireCoor.x--;
						}
						else if(moveDirection == Direction.RIGHT)
						{
							fireCoor.x++;
						}
					}
					
					public void run(){
						while(!quit)
						{
							try {
								Thread.sleep(50);//每隔50毫秒刷新一次
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							
							move();
							if(quit)
								return;
							show();
						}
					}
				}
			}
			
	'''
	
	def CheckEat(InitialFoodSpecificatin ifs,InitialSnakeSpecificatin iss) {
		'''
		«gs.music.join("",[o | generateMusic(o)])»
				point += _point;
				if(_point == 0)//食物是子弹
					{
						bulletNumber ++;
						GameUI.getWeaponLabel().setText("" + bulletNumber);
					}
				GameUI.getScoreLabel().setText("" + point);//在界面上刷新得分
				GameUI.getLengthLabel().setText("" + body.size());//刷新身体长度
				//GameUI.map[coor.y][coor.x] = «iss.members.sna.snakeTag»;//把地图上的该点标记为1，代表蛇身体
				GameUI.setMap(coor.y, coor.x,«iss.members.sna.snakeTag»);
				return true;
				}
		   }
		'''
	}
	
	def generateMusic(MusicSpecification music) {
		val musicName = new ArrayList<String>
		music.musicPath.forEach[o | musicName.add(o.name)]
		
		val musicPath = new ArrayList<String>
		music.musicPath.forEach[o | musicPath.add(o.path)]
		
		'''
		public boolean checkEat(Coordinate coor){
		double _point = food.getFoodPoint(coor);
		if(_point == -1)//没吃到食物
		return false;
		else//吃到了食物
		{
		new Music("«musicPath.get(2)»").start();
		'''
	}
	
	def CheckDeath(InitialObstacleSpecificatin ios) {
		'''
		public boolean checkDeath(Coordinate coor){
		/*注意，coor.x是map数组中的列号，从左到右依次为[0,WIDTH-1]
		 *     coor.y是map数组中的行号，从上到下依次为[0,HEIGHT-1]
		*/
							
		   if( coor.x < 0 || coor.x >= GameUI.getAreaWidth()||
		       coor.y < 0 || coor.y >= GameUI.getAreaHeight()||
		       GameUI.getMap()[coor.y][coor.x] == «ios.members.obstacle.obstacleTag»)
		       //GameUI.map[coor.y][coor.x] == 3)
		       return true;
		       else
		       return false;
		}
		'''
	}
	
	def generateFire(InitialFireSpecification ifs) {
//		val Fire = new ArrayList<IconTag>
		val IconLocate = new ArrayList<String>
		ifs.members.fire.fireIcon.forEach(fi | IconLocate.add('''"'''+fi.locate+'''"''') )
        val size = ifs.members.fire.iconsize
		'''
		public Fire(Coordinate snakehead,Coordinate target,Direction d){
		fireIcon = new ImageIcon(«IconLocate.join("")»);//firePath remember join
		fireIcon.setImage(fireIcon.getImage().getScaledInstance(«size»,«size»,Image.SCALE_SMOOTH));
		fireLabel = new JLabel(fireIcon);					    
		this.target = target;
		this.moveDirection = d;
		this.snakehead = snakehead;
		'''
	}
	
	def generateMove(InitialSnakeSpecificatin iss) {
		'''
		public void move(){
		Coordinate head,next_coor = new Coordinate(«iss.members.sna.initial_x»,«iss.members.sna.initial_y»);
		if(direction == Direction.UP){
			head = body.getFirst().coor;//get head
			next_coor = new Coordinate(head.x,head.y - 1);//head up 1
		}
		else if(direction == Direction.DOWN){
			head = body.getFirst().coor;//get head
			next_coor = new Coordinate(head.x,head.y + 1);//head down 1
		}
		else if(direction == Direction.LEFT){
			head = body.getFirst().coor;//get head
			next_coor = new Coordinate(head.x - 1,head.y);//head left 1
		}
		else if(direction == Direction.RIGHT){
			head = body.getFirst().coor;//get head
			next_coor = new Coordinate(head.x + 1,head.y);//head right 1
		}
		'''
	}
	
	def generatePlaySnake(InitialSnakeSpecificatin iss) {
		val HIcon = new ArrayList<IconTag>()
		val Headsize = iss.members.sna.iconsize
		iss.members.sna.headIcon.forEach(bi| HIcon.add(bi))
		val headIcon = new ArrayList<String>
		val headIconTag = new ArrayList<Integer>
		val locateHead = new ArrayList<String>
		HIcon.forEach[i | headIcon.add('''"'''+i.value+'''"''')]//headIcon
		HIcon.forEach[i | headIconTag.add(i.tag)]//headIcon
		//locate值
		HIcon.forEach[o | 
			locateHead.add('''"'''+o.locate+'''"''')
		]
		
		val BIcon = new ArrayList<IconTag>()
		val Bodysize = iss.members.sna.iconsize
		iss.members.sna.bodyIcon.forEach(bi| BIcon.add(bi))
		val bodyIcon = new ArrayList<String>
		BIcon.forEach[i | bodyIcon.add('''"'''+i.value+'''"''')]//bodyIcon
		val locateBody = new ArrayList<String>
		val bodyIconTag = new ArrayList<Integer>
		//locate值
		BIcon.forEach[o | 
			locateBody.add('''"'''+o.locate+'''"''')
		]
		BIcon.forEach[i | bodyIconTag.add(i.tag)]//headIcon
		
		'''
	    private int defaultSpeed = «iss.members.sna.defaultSpeed»;//默认速度
	    private Deque<Body> body = new LinkedList<Body>();//用于描述蛇身体节点的数组，保存蛇身体各个节点的坐标
	    private double point = 0;//当前蛇得了多少分
	    private int bulletNumber = 20;//蛇的子弹数目
	    				
	    private ImageIcon[] headIcon = new ImageIcon[«headIcon.length»];//表示蛇头的四张图片
	    private int headIconTag = «headIconTag.get(0)»;//头部默认加载第0张图片
	    private ImageIcon[] bodyIcon = new ImageIcon[«bodyIcon.length»];//表示蛇头的四张图片
	    private int bodyIconTag = «bodyIconTag.get(0)»;//身体默认加载第0张图片
	    private boolean quit = false;
	    				
	    public PlayerSnake(MainWindow GameUI,Foodset food,Obstacle obstacle){
	    this.GameUI = GameUI;
	    this.food = food;
	    this.obstacle = obstacle;
	    //加载4张蛇头和4张蛇身体图片
	    
	    for(int i = 0;i < «headIcon.length»;i++)
	    {
	    	«FOR idx:(0..headIcon.length-1)»
	    	«'''headIcon[«idx»] = new ImageIcon(«locateHead.get(idx)»);
	    	    headIcon[«idx»].setImage(headIcon[«idx»].getImage().getScaledInstance(«Headsize»,«Headsize»,Image.SCALE_SMOOTH));
	    	    
	    	    bodyIcon[«idx»] = new ImageIcon(«locateBody.get(idx)»);
	    	    bodyIcon[«idx»].setImage(bodyIcon[«idx»].getImage().getScaledInstance(«Bodysize»,«Bodysize»,Image.SCALE_SMOOTH));
	    	 '''»
	    	«ENDFOR»
	    }
	    					
	    Body head = new Body(«iss.members.sna.initial_x»,«iss.members.sna.initial_y»,headIcon[headIconTag]);//初始化头部在(0,0)位置
	    body.addFirst(head);
	    GameUI.add(head.label);
	    head.label.setBounds(IndexToPixel.getXPixel(head.coor.x), IndexToPixel.getYPixel(head.coor.y), 20, 20);
	    			
	    GameUI.setMap(0, 0, «iss.members.sna.snakeTag»);
	    MoveThread();
		'''
	}
	
}