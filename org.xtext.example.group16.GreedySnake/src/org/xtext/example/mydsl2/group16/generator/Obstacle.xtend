package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess

import org.xtext.example.mydsl2.group16.greedySnake.InitialObstacleSpecificatin
import org.xtext.example.mydsl2.group16.greedySnake.IconTag
import java.util.ArrayList
import org.xtext.example.mydsl2.group16.greedySnake.ObstacleTime
import org.xtext.example.mydsl2.group16.greedySnake.DirectionSpecification

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
				private MainWindow GameUI;
				private List<Wall> obstacle = new LinkedList<Wall>();
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
				
				public synchronized void removeAll(){
					for (Iterator<Wall> iter = obstacle.iterator(); iter.hasNext();) {
						Wall _wall = iter.next();
						for (Iterator<Brick> iter2 = _wall.wall.iterator(); iter2.hasNext();) {
							Brick _brick = iter2.next();
							
							GameUI.setMap(_brick.coor.y, _brick.coor.x, 0);
							
							_brick.label.setVisible(false);
							GameUI.remove(_brick.label);
							//modify
							_brick.label = null;
						}
					}
				}
				
				public synchronized void removeOne(Coordinate coor){
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
									Thread.sleep(time);//20秒移动一次
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
				«gs.obstacles.join("",[o |
					gs.directions.join("",[di |generateSearchTarget(o,di)])
				])»
				
				
				public class Wall {
					List<Brick> wall;
					public Wall(){
						wall = new LinkedList<Brick>();
					}
				}
				
				public class Brick {
					JLabel label; 
					Coordinate coor;
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
	
	def generateSearchTarget(InitialObstacleSpecificatin ios, DirectionSpecification dsf) {
		
		val Dir = new ArrayList<String>
		dsf.di.forEach[ o | Dir.add(o.direction.getName)]
		
		'''
			public Coordinate searchTarget(Coordinate here,Direction d){
			Coordinate target = new Coordinate(0,0);
			if(d == Direction.«Dir.get(0)»)//up
			{
				for(int i = here.y - 1;i >= 0;i--)
				if(GameUI.getMap()[i][here.x] == «ios.members.obstacle.obstacleTag»)
				{
					target = new Coordinate(here.x,i);
					GameUI.setMap(i, here.x, 0);
					return target;
				}
				 target = new Coordinate(here.x,-2);
				}
				else if(d == Direction.«Dir.get(1)»)//down
				{
					for(int i = here.y + 1;i < GameUI.getAreaHeight();i++)
					if(GameUI.getMap()[i][here.x] == «ios.members.obstacle.obstacleTag»)//3
					{
						target = new Coordinate(here.x,i);
						GameUI.setMap(i, here.x, 0);
						return target;
					}
					target = new Coordinate(here.x,GameUI.getAreaHeight() + 2);
				}
				else if(d == Direction.«Dir.get(2)»)//left
				{
					for(int i = here.x - 1;i >= 0;i--)
					if(GameUI.getMap()[here.y][i] == «ios.members.obstacle.obstacleTag»)//3
					{
						target = new Coordinate(i,here.y);
						GameUI.setMap(here.y, i, 0);
						return target;
					}
				 target = new Coordinate(-2,here.y);
				 }
				 else if(d == Direction.«Dir.get(3)»)//right
				 {
					for(int i = here.x + 1;i < GameUI.getAreaWidth();i++)
					if(GameUI.getMap()[here.y][i] == «ios.members.obstacle.obstacleTag»)//3
					{
						target = new Coordinate(i,here.y);
						GameUI.setMap(here.y, i, 0);
						return target;
					}
				  target = new Coordinate(GameUI.getAreaWidth() + 2,here.y);
				   }	
							
			return target;
			}
		'''
	}
	
	
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
		private int time = «time.get(0)»;
		private boolean quit = false;
						
		public Obstacle(MainWindow GameUI){
		this.GameUI = GameUI;
		//add Image
		brickIcon = new ImageIcon(«ObstacleLocate.get(0)»);
		brickIcon.setImage(brickIcon.getImage().getScaledInstance(«obstacleSize»,«obstacleSize»,Image.SCALE_SMOOTH));
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
		wallAmount = rand.nextInt(6) + 5;
		int tag;	
		int length; 
		Coordinate coor,_coor;
							
		obstacle.clear();
		for(int i = 0;i < wallAmount;i++)
		{
			Wall wall;
			Brick brick;
			tag = rand.nextInt(2);
			length = rand.nextInt(4) + 5;
			coor = GameUI.produceRandomCoordinate();
			if(tag == 0)
			{
				while(coor.y + length >= GameUI.getAreaWidth() || !checkSafe(coor,tag,length))
			    {
				coor = GameUI.produceRandomCoordinate();
			    }
				wall = new Wall();
			    for(int j = 0;j < length;j++)
				{
				_coor = new Coordinate(coor.y + j,coor.x);
										
				//GameUI.P();
				//GameUI.map[coor.x][coor.y + j] = «tag»;
				GameUI.setMap(coor.x, coor.y + j, «tag»);
				//GameUI.V();
										
				brick = new Brick(_coor,brickIcon);
				wall.wall.add(brick);
				}
				obstacle.add(wall);
			}
			else if(tag == 1)
			{
			     while(coor.x + length >= GameUI.getAreaHeight() || !checkSafe(coor,tag,length))
			      {
			       coor = GameUI.produceRandomCoordinate();
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