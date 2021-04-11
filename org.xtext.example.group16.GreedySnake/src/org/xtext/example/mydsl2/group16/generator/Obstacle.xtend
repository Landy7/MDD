package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess

import org.xtext.example.mydsl2.group16.greedySnake.InitialObstacleSpecificatin
import org.xtext.example.mydsl2.group16.greedySnake.IconTag
import java.util.ArrayList
import org.xtext.example.mydsl2.group16.greedySnake.ObstacleTime

class Obstacle extends GeneralGenerator{
	
	new(ModelPreprocessor mpp){
		super (mpp)
	}
	
	def generate(IFileSystemAccess fsa){
		fsa.generateFile('''«generateObstacleClassFileName()»''',generateObstacle())
	}
	
	def generateObstacle()'''
			package «generateGamePackage»;
			
			import java.util.List;
			
			import java.util.Random;
			import java.awt.Image;
			import java.util.Iterator;
			import java.util.LinkedList;
			import javax.swing.ImageIcon;
			import javax.swing.JLabel;
			
			public class Obstacle {
				private MainWindow GameUI;//母窗体,即游戏主界面
				private List<Wall> obstacle = new LinkedList<Wall>();//整个界面上的障碍物，很多堵墙
				private int wallAmount;
				private ImageIcon brickIcon;
				«gs.obstacles.join("",[o | generateObstacleContext(o)])»
				
				public synchronized void show(){
					for (Iterator<Wall> iter = obstacle.iterator(); iter.hasNext();) {
						Wall _wall = iter.next();
						for (Iterator<Brick> iter2 = _wall.wall.iterator(); iter2.hasNext();) {
							Brick _brick = iter2.next();
							GameUI.add(_brick.label);
							_brick.label.setBounds(IndexToPixel.getXPixel(_brick.coor.x), 
									IndexToPixel.getYPixel(_brick.coor.y), 20, 20);
							_brick.label.setVisible(true);
						}
					}
				}
				
				public synchronized void removeAll(){//移除界面上的所有砖块图片
					for (Iterator<Wall> iter = obstacle.iterator(); iter.hasNext();) {
						Wall _wall = iter.next();
						for (Iterator<Brick> iter2 = _wall.wall.iterator(); iter2.hasNext();) {
							Brick _brick = iter2.next();
							
							GameUI.setMap(_brick.coor.y, _brick.coor.x, 0);//地图上的该点重新标记为0
							
							_brick.label.setVisible(false);
							GameUI.remove(_brick.label);
							//modify
							_brick.label = null;
						}
					}
				}
				
				public synchronized void removeOne(Coordinate coor){//移除界面上的一张砖块图片
					for (Iterator<Wall> iter = obstacle.iterator(); iter.hasNext();) {
						Wall _wall = iter.next();
						for (Iterator<Brick> iter2 = _wall.wall.iterator(); iter2.hasNext();) {
							Brick _brick = iter2.next();
							
							if(_brick.coor.x == coor.x && _brick.coor.y == coor.y)
							{
								_brick.label.setVisible(false);
								GameUI.remove(_brick.label);
								return;
							}
						}
					}
					
				}
				
				public void AutoMoveThread(){
					run = new Thread() {
						public void run() {
							while (!quit) 
							{
								try {
									Thread.sleep(time);//15秒移动一次
								} catch (InterruptedException e) {
									e.printStackTrace();
									break;
								}
								
								if(!GameUI.getPause() && GameUI.getIsrun())
								{
									removeAll();
									produceBarrier();
									Write2file.PrintMap(GameUI.getMap(),"map.txt");
									if(quit)
										break;
									show();
								}
							}
							System.out.println("Obstacle thread exit...");
						}
					};
					run.start();
				}
				
				public Coordinate searchTarget(Coordinate here,Direction d){
					Coordinate target = new Coordinate(0,0);
					if(d == Direction.UP)
					{
						for(int i = here.y - 1;i >= 0;i--)
							if(GameUI.getMap()[i][here.x] == 3)
							{
								target = new Coordinate(here.x,i);
								GameUI.setMap(i, here.x, 0);//重新标记为0
								return target;
							}
						target = new Coordinate(here.x,-2);
					}
					else if(d == Direction.DOWN)
					{
						for(int i = here.y + 1;i < GameUI.getAreaHeight();i++)
							if(GameUI.getMap()[i][here.x] == 3)
							{
								target = new Coordinate(here.x,i);
								GameUI.setMap(i, here.x, 0);
								return target;
							}
						target = new Coordinate(here.x,GameUI.getAreaHeight() + 2);
					}
					else if(d == Direction.LEFT)
					{
						for(int i = here.x - 1;i >= 0;i--)
							if(GameUI.getMap()[here.y][i] == 3)
							{
								target = new Coordinate(i,here.y);
								GameUI.setMap(here.y, i, 0);
								return target;
							}
						target = new Coordinate(-2,here.y);
					}
					else if(d == Direction.RIGHT)
					{
						for(int i = here.x + 1;i < GameUI.getAreaWidth();i++)
							if(GameUI.getMap()[here.y][i] == 3)
							{
								target = new Coordinate(i,here.y);
								GameUI.setMap(here.y, i, 0);
								return target;
							}
						target = new Coordinate(GameUI.getAreaWidth() + 2,here.y);
					}	
					
					return target;
				}
				
				
				//墙的数据结构，一堵墙有多块砖
				public class Wall {
					List<Brick> wall;
					public Wall(){
						wall = new LinkedList<Brick>();
					}
				}
				
				//砖块的数据结构
				public class Brick {
					JLabel label; 
					Coordinate coor;//坐标
					public Brick(int x,int y,ImageIcon icon){
						coor = new Coordinate(x,y);
						label = new JLabel(icon);
					}
					
					public Brick(Coordinate coor,ImageIcon icon){
						this.coor = coor;
						label = new JLabel(icon);
					}
				}
			}
			
	'''
	
	def generateObstacleContext(InitialObstacleSpecificatin ios) {
		
		val OIcon = new ArrayList<IconTag>()
		val obstacleSize = ios.members.obstacle.iconsize
		var tag = 0
		tag = ios.members.obstacle.obstacleTag
		ios.members.obstacle.obstacleIcon.forEach(bi| OIcon.add(bi))
		val ObstacleIcon = new ArrayList<String>
		val ObstacleLocate = new ArrayList<String>
		OIcon.forEach[i | ObstacleIcon.add('''"'''+i.value+'''"''')]//foodicon
		//locate值
		OIcon.forEach[o | 
			ObstacleLocate.add('''"'''+o.locate+'''"''')
		]
		val time = new ArrayList<Integer>
		gs.time.filter(ObstacleTime).forEach[o | time.add(o.obstacleTime)]
		
		'''
		private Thread run;
		private int time = «time.get(0)»;//20秒刷新一次
		private boolean quit = false;
						
		public Obstacle(MainWindow GameUI){
		this.GameUI = GameUI;
		//加载砖块图片
		brickIcon = new ImageIcon(«ObstacleLocate.get(0)»);
		brickIcon.setImage(brickIcon.getImage().getScaledInstance(«obstacleSize»,«obstacleSize»,Image.SCALE_SMOOTH));//保持图片的清晰
		produceBarrier();
		show();
		AutoMoveThread();
		}
						
		public void quit(){
		quit = true;
		}
						
		public boolean checkSafe(Coordinate coor,int tag,int length)
		{
			if(tag == 0)
			{
				for(int i = 0;i < length;i++)
				{
					if(GameUI.getMap()[coor.x][coor.y + i] != 0)
					return false;
				}
			}
			else if(tag == 1)
			{
				for(int i = 0;i < length;i++)
				{
					if(GameUI.getMap()[coor.x + i][coor.y] != 0)
					return false;
				}
			}
		return true;
		}
						
		public synchronized void produceBarrier(){
		Random rand = new Random();
		wallAmount = rand.nextInt(6) + 5;//随机产生[5,10]赌墙
		int tag;	//tag = 0表示墙的方向为横向，1表示墙的方向为纵向
		int length; //每堵墙所包含的砖块数目，即每堵墙的长度
		Coordinate coor,_coor;
							
		obstacle.clear();
		for(int i = 0;i < wallAmount;i++)
		{
			Wall wall;
			Brick brick;
			tag = rand.nextInt(2);
			length = rand.nextInt(4) + 5;//墙的长度从5到8随机
			coor = GameUI.produceRandomCoordinate();//注意coor.x是数组的行号，对应界面上的列方向的坐标序号
			if(tag == 0)
			{
				while(coor.y + length >= GameUI.getAreaWidth() || !checkSafe(coor,tag,length))
				/*横向排列时得保证最右边的那块砖不能跑到界面外边去
				 * 而且该堵墙的每块砖都是处于空闲位置
				 */
			    {
				coor = GameUI.produceRandomCoordinate();//注意coor.x是数组的行号，对应界面上的列方向的坐标序号
			    }
				wall = new Wall();
			    for(int j = 0;j < length;j++)
				{
				_coor = new Coordinate(coor.y + j,coor.x);//注意要交换x和y中的次序
										
				//GameUI.P();
				//GameUI.map[coor.x][coor.y + j] = «tag»;//标记地图上的该点为障碍物
				GameUI.setMap(coor.x, coor.y + j, «tag»);
				//GameUI.V();
										
				brick = new Brick(_coor,brickIcon);
				wall.wall.add(brick);//把该块砖添加到该堵墙中去
				}
				obstacle.add(wall);//把该堵墙添加到整个障碍物数组中去
			}
			else if(tag == 1)
			{
			     while(coor.x + length >= GameUI.getAreaHeight() || !checkSafe(coor,tag,length))
			     /*纵向排列时得保证最下边的那块砖不能跑到界面外边去
			     * 而且该堵墙的每块砖都是处于空闲位置
			     */
			      {
			       coor = GameUI.produceRandomCoordinate();//注意coor.x是数组的行号，对应界面上的列方向的坐标序号
			      }
			wall = new Wall();
			for(int j = 0;j < length;j++)
			{
				_coor = new Coordinate(coor.y,coor.x + j);
										
				//GameUI.P();
				//GameUI.map[coor.x + j][coor.y] = 3;
				GameUI.setMap(coor.x + j, coor.y, «tag»);
				//GameUI.V();
				brick = new Brick(_coor,brickIcon);
				wall.wall.add(brick);//add brick
			}
			obstacle.add(wall);//add whole wall
		   }
		}
							
		System.out.print("produce" + wallAmount +"brick\t\t");
		String Time = SysTime.getSysTime();
		System.out.println(Time);
		}
		'''
	}
	
}