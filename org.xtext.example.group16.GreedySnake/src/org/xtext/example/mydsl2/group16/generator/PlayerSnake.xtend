package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess


import org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin
import org.xtext.example.mydsl2.group16.greedySnake.InitialFireSpecification
import org.xtext.example.mydsl2.group16.greedySnake.InitialObstacleSpecificatin
import org.xtext.example.mydsl2.group16.greedySnake.InitialFoodSpecificatin
import org.xtext.example.mydsl2.group16.greedySnake.IconTag
import java.util.ArrayList
import org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification
import org.xtext.example.mydsl2.group16.greedySnake.DirectionSpecification
import org.xtext.example.mydsl2.group16.greedySnake.SnakeMoveSpecification

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
				private MainWindow GameUI;
				private Foodset food;
				private Obstacle obstacle;
				
				private Thread run;
				private Direction direction = Direction.RIGHT;
				private int speed = 300;
				«gs.snakes.join("",[fo | generatePlaySnake(fo)])»
				}
				
				//snake move
				«gs.snakes.join("",[o | 
					gs.snakeMove.join("",[dir | generateMove(o,dir)])
				])»
				
				«gs.snakes.join("",[sna | 
					gs.music.join("",[mus | generateOver(sna,mus)])
				])»
					
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
					GameUI.getWeaponLabel().setText("" + bulletNumber);//refresh bullets
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
					
					    //modify
					    «gs.snakes.join("",[o | 
					    	gs.snakeMove.join("",[ dis | generateSnakeDirection(o,dis)])
					    ])»
					   
					}
					
					«gs.music.join("",[ o | generateshow(o)])»
					
					«gs.directions.join("",[di | genereteFireMove(di)])»
					
					
					public void run(){
						while(!quit)
						{
							try {
								Thread.sleep(50);
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
	
	def generateshow(MusicSpecification ms) {
		val path = new ArrayList<String>
		ms.musicPath.forEach[ o | path.add(o.path)]
		'''
		public void show(){
		//modify
		if(fireCoor.x == target.x && fireCoor.y == target.y)
		{
			if(target.x < 0 || target.x > GameUI.getAreaWidth() || target.y < 0 || target.y > GameUI.getAreaHeight()){}
		else new Music(«'''"'''+path.get(1)+'''"'''»).start();
									
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
		'''
	}
	
	def genereteFireMove(DirectionSpecification ds) {
		
		val Dir = new ArrayList<String>
		ds.di.forEach[ o | Dir.add(o.direction.getName)]
		'''
		public void move(){
		if(moveDirection == Direction.«Dir.get(0)») //up
		{
			fireCoor.y--;
		}
		else if(moveDirection == Direction.«Dir.get(1)») //down
		{
			fireCoor.y++;
		}
		else if(moveDirection == Direction.«Dir.get(2)») //left
		{
			fireCoor.x--;
		}
		else if(moveDirection == Direction.«Dir.get(3)») //right
		{
			fireCoor.x++;
		}
		}
		'''
	}
	
	def generateSnakeDirection(InitialSnakeSpecificatin ifs, SnakeMoveSpecification ds) {
		val Dir = new ArrayList<String>
		ds.^IF.forEach[ o | Dir.add(o.dir.direction.getName)]
		
		val moveName = new ArrayList<String>
		ds.^IF.forEach[ o | moveName.add(o.name)]
		
		val moveCount = new ArrayList<Integer>
		ds.^IF.forEach[ o | moveCount.add(o.moveVal)]
		'''
		 if(moveDirection == Direction.«Dir.get(0)») //up
		 {
		 fireCoor = new Coordinate(«moveName.get(0)».x,«moveName.get(0)».y-«moveCount.get(0)»);
		 }
		 else if(moveDirection == Direction.«Dir.get(1)») //down
		 {
		 fireCoor = new Coordinate(«moveName.get(0)».x,«moveName.get(0)».y+«moveCount.get(1)»);
		 }
		 else if(moveDirection == Direction.«Dir.get(2)») //left
		 {
		 fireCoor = new Coordinate(«moveName.get(0)».x-«moveCount.get(2)»,«moveName.get(0)».y);
		 }
		 else if(moveDirection == Direction.«Dir.get(3)») //right
		 {
		 fireCoor = new Coordinate(«moveName.get(0)».x+«moveCount.get(3)»,«moveName.get(0)».y);
		 }
		 GameUI.add(fireLabel);
		 show();
		 this.start();
		'''
	}
	
	def generateOver(InitialSnakeSpecificatin sna,MusicSpecification mus) {
		val path = new ArrayList<String>
		mus.musicPath.forEach[ o | path.add(o.path)]
		'''
		if(checkDeath(next_coor))
		{
			new Music(«'''"'''+path.get(0)+'''"'''»).start(); //over
			GameUI.setIsrun(false);
			quit();
			JOptionPane.showMessageDialog(null, "Game over!", 
			"Information", JOptionPane.CANCEL_OPTION);
						
			 GameUI.setPause(true);
«««			if(result==JOptionPane.YES_NO_OPTION)
«««			{
«««				GameUI.restart();
«««			}
«««			else
«««			{
«««				GameUI.setPause(true);
«««			}
		}
		else
		{
				Body next_node = new Body(next_coor,headIcon[headIconTag]);
				body.addFirst(next_node);//add head
				//modify
				GameUI.setMap(next_node.coor.y, next_node.coor.x, «sna.members.sna.snakeTag»);
				next_node.label.setVisible(true);
				GameUI.add(next_node.label);
								
				if(!checkEat(next_coor))
				{
				Body tail = body.pollLast();
				GameUI.setMap(tail.coor.y, tail.coor.x, 0);
				tail.label.setVisible(false);
				GameUI.remove(tail.label);
			    }
		}
		'''  
		}

	
	
	
	def CheckEat(InitialFoodSpecificatin ifs,InitialSnakeSpecificatin iss) {
		'''
		«gs.music.join("",[o | generateMusic(o)])»
				point += _point;
				if(_point == 0)
					{
						bulletNumber ++;
						GameUI.getWeaponLabel().setText("" + bulletNumber);
					}
				GameUI.getScoreLabel().setText("" + point);
				GameUI.getLengthLabel().setText("" + body.size());
				//GameUI.map[coor.y][coor.x] = «iss.members.sna.snakeTag»;
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
		if(_point == -1)//not eat food
		return false;
		else//eat food
		{
		new Music("«musicPath.get(2)»").start();
		'''
	}
	
	def CheckDeath(InitialObstacleSpecificatin ios) {
		'''
		public boolean checkDeath(Coordinate coor){
							
		   if( coor.x < 0 || coor.x >= GameUI.getAreaWidth()||
		       coor.y < 0 || coor.y >= GameUI.getAreaHeight()||
		       GameUI.getMap()[coor.y][coor.x] == «ios.members.obstacle.obstacleTag»)
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
	
	def generateMove(InitialSnakeSpecificatin iss, SnakeMoveSpecification sms) {
//		val Dir = new ArrayList<String>
//		ds.di.forEach[ o | Dir.add(o.direction.getName)]
//		val Dir = new ArrayList<String>
//		sms.^IF.forEach[ o | Dir.add(o.dir.getName)]
		
		val Dir = new ArrayList<String>
		sms.^IF.forEach[ o | Dir.add(o.dir.direction.getName)]
		
		val moveName = new ArrayList<String>
		sms.^IF.forEach[ o | moveName.add(o.name)]
		
		val moveCount = new ArrayList<Integer>
		sms.^IF.forEach[ o | moveCount.add(o.moveVal)]
		
		'''
		public void move(){
		Coordinate head,next_coor = new Coordinate(«iss.members.sna.initial_x»,«iss.members.sna.initial_y»);
		if(direction == Direction.«Dir.get(0)»){ // up
			head = body.getFirst().coor;//get head
			next_coor = new Coordinate(head.x,head.y - «moveCount.get(0)»);//head up 1
		}
		else if(direction == Direction.«Dir.get(1)»){ //down
			head = body.getFirst().coor;//get head
			next_coor = new Coordinate(head.x,head.y + «moveCount.get(1)»);//head down 1
		}
		else if(direction == Direction.«Dir.get(2)»){ //left
			head = body.getFirst().coor;//get head
			next_coor = new Coordinate(head.x - «moveCount.get(2)»,head.y);//head left 1
		}
		else if(direction == Direction.«Dir.get(3)»){ //right
			head = body.getFirst().coor;//get head
			next_coor = new Coordinate(head.x + «moveCount.get(3)»,head.y);//head right 1
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
	    private int defaultSpeed = «iss.members.sna.defaultSpeed»;//depfult speed
	    private Deque<Body> body = new LinkedList<Body>();
	    private double point = 0;//the point
	    private int bulletNumber = 20;//the bullet
	    				
	    private ImageIcon[] headIcon = new ImageIcon[«headIcon.length»];//snake headIcon
	    private int headIconTag = «headIconTag.get(2)»;
	    private ImageIcon[] bodyIcon = new ImageIcon[«bodyIcon.length»];//snake bodyIcon
	    private int bodyIconTag = «bodyIconTag.get(1)»;
	    private boolean quit = false;
	    				
	    public PlayerSnake(MainWindow GameUI,Foodset food,Obstacle obstacle){
	    this.GameUI = GameUI;
	    this.food = food;
	    this.obstacle = obstacle;
	    
	    for(int i = 0;i < «headIcon.length»;i++)
	    {
	    	«FOR idx:(0..headIcon.length-1)»
	    	«'''
	    	headIcon[«idx»] = new ImageIcon(«locateHead.get(idx)»);
	    	headIcon[«idx»].setImage(headIcon[«idx»].getImage().getScaledInstance(«Headsize»,«Headsize»,Image.SCALE_SMOOTH));
	    	 '''»
	    	«ENDFOR»
	    }
	    for(int i = 0;i < «bodyIcon.length»;i++)
	    {
	    	«FOR idx:(0..bodyIcon.length-1)»
	    	«'''
	    	bodyIcon[«idx»] = new ImageIcon(«locateBody.get(idx)»);
	    	bodyIcon[«idx»].setImage(bodyIcon[«idx»].getImage().getScaledInstance(«Bodysize»,«Bodysize»,Image.SCALE_SMOOTH));
	    	'''»
	    	«ENDFOR»
	    }
	    					
	    Body head = new Body(«iss.members.sna.initial_x»,«iss.members.sna.initial_y»,headIcon[headIconTag]);//inital location
	    body.addFirst(head);
	    GameUI.add(head.label);
	    head.label.setBounds(IndexToPixel.getXPixel(head.coor.x), IndexToPixel.getYPixel(head.coor.y), 20, 20);
	    			
	    GameUI.setMap(0, 0, «iss.members.sna.snakeTag»);
	    MoveThread();
		'''
	}
	
}