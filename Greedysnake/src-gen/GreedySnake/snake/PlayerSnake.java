package GreedySnake.snake;

import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.LinkedList;
import java.awt.Image;
import java.util.Deque;
import java.util.Iterator;

import GreedySnake.game.*;

public class PlayerSnake {
	private MainWindow GameUI;
	private Foodset food;
	private Obstacle obstacle;
	
	private Thread run;
	private Direction direction = Direction.RIGHT;
	private int speed = 300;
	private int defaultSpeed = 300;//depfult speed
	private Deque<Body> body = new LinkedList<Body>();
	private double point = 0;//the point
	private int bulletNumber = 20;//the bullet
					
	private ImageIcon[] headIcon = new ImageIcon[4];//snake headIcon
	private int headIconTag = 2;
	private ImageIcon[] bodyIcon = new ImageIcon[5];//snake bodyIcon
	private int bodyIconTag = 1;
	private boolean quit = false;
					
	public PlayerSnake(MainWindow GameUI,Foodset food,Obstacle obstacle){
	this.GameUI = GameUI;
	this.food = food;
	this.obstacle = obstacle;
	
	for(int i = 0;i < 4;i++)
	{
		
		headIcon[0] = new ImageIcon("head//head0.png");
		headIcon[0].setImage(headIcon[0].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
		 
		
		headIcon[1] = new ImageIcon("head//head1.png");
		headIcon[1].setImage(headIcon[1].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
		 
		
		headIcon[2] = new ImageIcon("head//head2.png");
		headIcon[2].setImage(headIcon[2].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
		 
		
		headIcon[3] = new ImageIcon("head//head3.png");
		headIcon[3].setImage(headIcon[3].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
		 
	}
	for(int i = 0;i < 5;i++)
	{
		
		bodyIcon[0] = new ImageIcon("body//body0.png");
		bodyIcon[0].setImage(bodyIcon[0].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
		
		
		bodyIcon[1] = new ImageIcon("body//body1.png");
		bodyIcon[1].setImage(bodyIcon[1].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
		
		
		bodyIcon[2] = new ImageIcon("body//body2.png");
		bodyIcon[2].setImage(bodyIcon[2].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
		
		
		bodyIcon[3] = new ImageIcon("body//body3.png");
		bodyIcon[3].setImage(bodyIcon[3].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
		
		
		bodyIcon[4] = new ImageIcon("body//body3.png");
		bodyIcon[4].setImage(bodyIcon[4].getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
		
	}
						
	Body head = new Body(0,0,headIcon[headIconTag]);//inital location
	body.addFirst(head);
	GameUI.add(head.label);
	head.label.setBounds(IndexToPixel.getXPixel(head.coor.x), IndexToPixel.getYPixel(head.coor.y), 20, 20);
				
	GameUI.setMap(0, 0, 1);
	MoveThread();
	}
	
	//snake move
	public void move(){
	Coordinate head,next_coor = new Coordinate(0,0);
	if(direction == Direction.UP){ // up
		head = body.getFirst().coor;//get head
		next_coor = new Coordinate(head.x,head.y - 1);//head up 1
	}
	else if(direction == Direction.DOWN){ //down
		head = body.getFirst().coor;//get head
		next_coor = new Coordinate(head.x,head.y + 1);//head down 1
	}
	else if(direction == Direction.LEFT){ //left
		head = body.getFirst().coor;//get head
		next_coor = new Coordinate(head.x - 1,head.y);//head left 1
	}
	else if(direction == Direction.RIGHT){ //right
		head = body.getFirst().coor;//get head
		next_coor = new Coordinate(head.x + 1,head.y);//head right 1
	}
	
	if(checkDeath(next_coor))
	{
		new Music("music//over.wav").start(); //over
		GameUI.setIsrun(false);
		quit();
		JOptionPane.showMessageDialog(null, "Game over!", 
		"Information", JOptionPane.CANCEL_OPTION);
					
		 GameUI.setPause(true);
	}
	else
	{
			Body next_node = new Body(next_coor,headIcon[headIconTag]);
			body.addFirst(next_node);//add head
			//modify
			GameUI.setMap(next_node.coor.y, next_node.coor.x, 1);
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
		
	}
	
	//if snake died
	public boolean checkDeath(Coordinate coor){
						
	   if( coor.x < 0 || coor.x >= GameUI.getAreaWidth()||
	       coor.y < 0 || coor.y >= GameUI.getAreaHeight()||
	       GameUI.getMap()[coor.y][coor.x] == 3)
	       return true;
	       else
	       return false;
	}
	
	public boolean checkEat(Coordinate coor){
	double _point = food.getFoodPoint(coor);
	if(_point == -1)//not eat food
	return false;
	else//eat food
	{
	new Music("music//eat.wav").start();
			point += _point;
			if(_point == 0)
				{
					bulletNumber ++;
					GameUI.getWeaponLabel().setText("" + bulletNumber);
				}
			GameUI.getScoreLabel().setText("" + point);
			GameUI.getLengthLabel().setText("" + body.size());
			//GameUI.map[coor.y][coor.x] = 1;
			GameUI.setMap(coor.y, coor.x,1);
			return true;
			}
	   }
	
	
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
						Write2file.PrintMap(GameUI.getMap(),"map.txt");
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
		public Fire(Coordinate snakehead,Coordinate target,Direction d){
		fireIcon = new ImageIcon("image//fire.png");//firePath remember join
		fireIcon.setImage(fireIcon.getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH));
		fireLabel = new JLabel(fireIcon);					    
		this.target = target;
		this.moveDirection = d;
		this.snakehead = snakehead;
		
		    //modify
		    if(moveDirection == Direction.UP) //up
		    {
		    fireCoor = new Coordinate(snakehead.x,snakehead.y-1);
		    }
		    else if(moveDirection == Direction.DOWN) //down
		    {
		    fireCoor = new Coordinate(snakehead.x,snakehead.y+1);
		    }
		    else if(moveDirection == Direction.LEFT) //left
		    {
		    fireCoor = new Coordinate(snakehead.x-1,snakehead.y);
		    }
		    else if(moveDirection == Direction.RIGHT) //right
		    {
		    fireCoor = new Coordinate(snakehead.x+1,snakehead.y);
		    }
		    GameUI.add(fireLabel);
		    show();
		    this.start();
		   
		}
		
		public void show(){
		//modify
		if(fireCoor.x == target.x && fireCoor.y == target.y)
		{
			if(target.x < 0 || target.x > GameUI.getAreaWidth() || target.y < 0 || target.y > GameUI.getAreaHeight()){}
		else new Music("music//Explode.wav").start();
									
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
		if(moveDirection == Direction.UP) //up
		{
			fireCoor.y--;
		}
		else if(moveDirection == Direction.DOWN) //down
		{
			fireCoor.y++;
		}
		else if(moveDirection == Direction.LEFT) //left
		{
			fireCoor.x--;
		}
		else if(moveDirection == Direction.RIGHT) //right
		{
			fireCoor.x++;
		}
		}
		
		
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

