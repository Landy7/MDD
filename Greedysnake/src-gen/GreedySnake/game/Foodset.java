package GreedySnake.game;

import java.awt.Image;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Foodset {
	
	private MainWindow GameUI;
	private List<Food> food = new LinkedList<Food>();
	private static final int MAXSIZE = 8;
	private static final int MINSIZE = 3;
				
				private static final int FOODKIND = 6;
				private double[] point = new double[FOODKIND];
				private ImageIcon[] foodIcon = new ImageIcon[FOODKIND];
				
				private Thread run;
				//modify
				private int time = 10000;
				private boolean quit = false;
				
				public Foodset(MainWindow GameUI){
					this.GameUI = GameUI;
					
					//the point for each food
					point[0] = 7.5;
					point[1] = 13.5;
					point[2] = 23.5;
					point[3] = 7.5;
					point[4] = 43.7;
					point[5] = 53.6;
				    
				    
				    foodIcon[0] = new ImageIcon("food//food1.png");
				    foodIcon[0].setImage(foodIcon[0].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
				    
				    
				    foodIcon[1] = new ImageIcon("food//food2.png");
				    foodIcon[1].setImage(foodIcon[1].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
				    
				    
				    foodIcon[2] = new ImageIcon("food//food3.png");
				    foodIcon[2].setImage(foodIcon[2].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
				    
				    
				    foodIcon[3] = new ImageIcon("food//food4.png");
				    foodIcon[3].setImage(foodIcon[3].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
				    
				    
				    foodIcon[4] = new ImageIcon("food//food5.png");
				    foodIcon[4].setImage(foodIcon[4].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
				    
				    
				    foodIcon[5] = new ImageIcon("food//food6.png");
				    foodIcon[5].setImage(foodIcon[5].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
				    
				    
				    produceFood();
				    show();
				    AutoMoveThread();
				}
				
				public void quit(){
					quit = true;
				}
				
				public synchronized double getFoodPoint(Coordinate coor){
					for (Iterator<Food> iter = food.iterator(); iter.hasNext();) {
						Food node = iter.next();
						if(node.coor.x == coor.x && node.coor.y == coor.y)
						{
							node.label.setVisible(false);
							GameUI.remove(node.label);
							iter.remove();
							
							produceFood();
							
							GameUI.getAmountLabel().setText("" + food.size());
							return point[node.kind];
						}
					}
					
					return -1;
				}
				
				public void produceFood(){
					Random rand = new Random();
					int amount = rand.nextInt(MINSIZE);//[0,MINSIZE-1]
					double prob;
					int foodtag = 2;
					Food newfood;
					
					//P();
					if(food.size() == 0)
					{
						amount = MINSIZE;
					}
					else
					{
						while(amount + food.size() < MINSIZE || amount + food.size() > MAXSIZE)
						{
							amount = rand.nextInt(MINSIZE);//[0,MINSIZE-1];
						}
					}
					//V();
					
					for(int i = 0;i < amount;i++)
					{
						Coordinate coor = GameUI.produceRandomCoordinate();
						Coordinate _coor = new Coordinate(coor.y,coor.x);
						prob = rand.nextDouble();
						if(prob >= 0 && prob <0.1) 		    foodtag = 0;//10%
						else if(prob >= 0.1  && prob <0.25) foodtag = 4;//15%
						else if(prob >= 0.25 && prob <0.5)  foodtag = 3;//25%
						else if(prob >= 0.5  && prob <0.8)  foodtag = 2;//30%
						else if(prob >= 0.8 && prob <0.95)  foodtag = 1;//15%
						else if(prob >= 0.95 && prob <1) 	foodtag = 5;//5%
						
						//GameUI.P();
						GameUI.setMap(coor.x, coor.y, 2);
						//GameUI.V();
						
						newfood = new Food(foodtag,_coor,foodIcon[foodtag]);
						food.add(newfood);
						GameUI.add(newfood.label);
			//			newfood.label.setBounds(IndexToPixel.getXPixel(newfood.coor.y), 
					}
					
					GameUI.getAmountLabel().setText("" + food.size());
					show();
					System.out.print("produce" + amount + "food\t");
					String Time = SysTime.getSysTime();
					System.out.println(Time);
				}
				
				public synchronized void show(){
					for (Iterator<Food> iter = food.iterator(); iter.hasNext();) {
						Food node = iter.next();
						node.label.setBounds(IndexToPixel.getXPixel(node.coor.x), 
								IndexToPixel.getYPixel(node.coor.y), 20, 20);
						node.label.setVisible(true);
					}
				}
				
				public synchronized void removeAll(){//remove all picture of foods
					for (Iterator<Food> iter = food.iterator(); iter.hasNext();) {
						Food node = iter.next();
						
						GameUI.setMap(node.coor.y, node.coor.x, 0);//relabel 0
						
						node.label.setVisible(false);
						GameUI.remove(node.label);
						node.label = null;
					}
					food.clear();
					
			
				}
	
	public void AutoMoveThread(){
		run = new Thread() {
			public void run() {
				while (!quit) 
				{
					try {
						Thread.sleep(time);
					} catch (InterruptedException e) {
						e.printStackTrace();
						break;
					}
					
					if(!GameUI.getPause() && GameUI.getIsrun())
					{
						removeAll();
						produceFood();
						Write2file.PrintMap(GameUI.getMap(),"map.txt");
						if(quit)
							break;
						show();
					}
				}
				System.out.println("Food thread exit...");
			}
		};
		run.start();
	}

	//the data structure of food
	public class Food {
		int kind;//the food kind
		JLabel label; 
		Coordinate coor;//coordinate
		public Food(int kind,int x,int y,ImageIcon icon){
			this.kind = kind;
			label = new JLabel(icon);
			coor = new Coordinate(x,y);
		}
		
		public Food(int kind,Coordinate coor,ImageIcon icon){
			this.kind = kind;
			label = new JLabel(icon);
			this.coor = coor;
		}
	}
}

