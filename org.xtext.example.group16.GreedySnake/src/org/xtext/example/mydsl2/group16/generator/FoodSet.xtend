package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.example.mydsl2.group16.greedySnake.InitialFoodSpecificatin
import java.util.ArrayList
import org.xtext.example.mydsl2.group16.greedySnake.IconTag
import org.xtext.example.mydsl2.group16.greedySnake.FoodKind
import org.xtext.example.mydsl2.group16.greedySnake.Expression
import org.xtext.example.mydsl2.group16.greedySnake.Addition
import org.xtext.example.mydsl2.group16.greedySnake.Multiplication
import org.xtext.example.mydsl2.group16.greedySnake.IntLiteral
import org.xtext.example.mydsl2.group16.greedySnake.RealLiteral

class FoodSet extends GeneralGenerator{
	
	new(ModelPreprocessor mpp){
		super (mpp)
	}
	def generate(IFileSystemAccess fsa){
		fsa.generateFile('''«generateFoodSetClassFileName()»''',generateFoodSet())
	}
	
	def generateFoodSet()'''
		package «generateGamePackage»;
		
		import java.awt.Image;
		
		import java.util.Iterator;
		import java.util.LinkedList;
		import java.util.List;
		import java.util.Random;
		import javax.swing.ImageIcon;
		import javax.swing.JLabel;
		
		public class Foodset {
			
			«gs.foods.join("",[fd | generatefoodset(fd)])»
			
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
								Write2file.PrintMap(GameUI.getMap(),«'''"'''+gs.map.join("", [o | o.map])+'''"'''»);
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
		
	'''
	
	def generatefoodset(InitialFoodSpecificatin ifs) {
		var kind = 0
		kind = ifs.members.food.foodKind.length
//		val point = new ArrayList<Integer>
		
		val FIcon = new ArrayList<IconTag>()
		val foodsize = ifs.members.food.iconsize
		ifs.members.food.foodIcon.forEach(bi| FIcon.add(bi))
		val foodIcon = new ArrayList<String>
		val foodIconTag = new ArrayList<Integer>
		val locatefood = new ArrayList<String>
		FIcon.forEach[i | foodIcon.add('''"'''+i.value+'''"''')]//foodicon
		FIcon.forEach[i | foodIconTag.add(i.tag)]//headIcon
		//locate值
		FIcon.forEach[o | 
			locatefood.add('''"'''+o.locate+'''"''')
		]
		
		var tag = 0
		tag = ifs.members.food.foodTag
		
		//point
		val point = new ArrayList<CharSequence>
		
		ifs.members.food.foodKind.map[generateExp()].forEach[o | point.add(o)]
		
		'''
		private MainWindow GameUI;
		private List<Food> food = new LinkedList<Food>();
		private static final int MAXSIZE = «ifs.members.food.produce.maxsize»;
		private static final int MINSIZE = «ifs.members.food.produce.minsize»;
					
					private static final int FOODKIND = «kind»;
					private double[] point = new double[FOODKIND];
					private ImageIcon[] foodIcon = new ImageIcon[FOODKIND];
					
					private Thread run;
					//modify
					private int time = 10000;
					private boolean quit = false;
					
					public Foodset(MainWindow GameUI){
						this.GameUI = GameUI;
						
						//the point for each food
						«FOR idx:(0..kind-1)»
						«'''point[«idx»] = «point.get(idx)»'''»
						«ENDFOR»
					    
					    «FOR idx:(0..kind-1)»
					    «'''
					    foodIcon[«idx»] = new ImageIcon(«locatefood.get(idx)»);
					    foodIcon[«idx»].setImage(foodIcon[«idx»].getImage().getScaledInstance(«foodsize»,«foodsize»,Image.SCALE_SMOOTH));
					    '''»
					    «ENDFOR»
					    
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
						int foodtag = «tag»;
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
							if(prob >= 0 && prob <0.1) 		    foodtag = «foodIconTag.get(0)»;//10%
							else if(prob >= 0.1  && prob <0.25) foodtag = «foodIconTag.get(4)»;//15%
							else if(prob >= 0.25 && prob <0.5)  foodtag = «foodIconTag.get(3)»;//25%
							else if(prob >= 0.5  && prob <0.8)  foodtag = «foodIconTag.get(2)»;//30%
							else if(prob >= 0.8 && prob <0.95)  foodtag = «foodIconTag.get(1)»;//15%
							else if(prob >= 0.95 && prob <1) 	foodtag = «foodIconTag.get(5)»;//5%
							
							//GameUI.P();
							GameUI.setMap(coor.x, coor.y, «tag»);
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
		'''
	}
	
	def generateExp(FoodKind kind) '''
		«kind.point.generateJavaExpression()»
	'''
	
	
	def String generateJavaExpression(Expression exp) {
		exp.evaluate.translateToJavaString
	}
	
	dispatch def Number evaluate(Expression exp) { null }
	dispatch def Number evaluate(Addition exp) {
		val evaluatedChildren = #[exp.left.evaluate] + exp.right.map[evaluate]
		
		val Number[] result = #[null]
		
		evaluatedChildren.forEach[ec, idx |
			result.set(0, 
				if (idx > 0) {
					if (exp.operator.get(idx - 1) == '+') {
						result.get(0).add(ec)
					} else {
						result.get(0).subtract(ec)						
					}
				} else {
					ec
				})
		]
		
		result.get(0)
	}
	
	dispatch def Number evaluate(Multiplication exp) {
		val evaluatedChildren = #[exp.left.evaluate] + exp.right.map[evaluate]
		
		val Number[] result = #[null]
		
		evaluatedChildren.forEach[ec, idx |
			result.set(0, 
				if (idx > 0) {
					if (exp.operator.get(idx - 1) == '*') {
						result.get(0).multiply(ec)
					} else {
						result.get(0).divide(ec)						
					}
				} else {
					ec
				})
		]
		
		result.get(0)
	}
	
	dispatch def Number evaluate(IntLiteral exp) { exp.^val }
	
	dispatch def Number evaluate(RealLiteral exp) { exp.^val }
	
	dispatch def Number add(Integer a, Number b) {
		if (b instanceof Integer) {
			Integer.valueOf(a.intValue + b.intValue)
		} else {
			a.floatValue + (b as Float).floatValue		
		}
	}
	dispatch def Number add(Float a, Number b) {
		if (b instanceof Integer) {
			a.floatValue + b.floatValue
		} else {
			a.floatValue + (b as Float).floatValue			
		}
	}
	
	dispatch def Number subtract(Integer a, Number b) {
		if (b instanceof Integer) {
			Integer.valueOf(a.intValue - b.intValue)
		} else {
			a.floatValue - (b as Float).floatValue		
		}
	}
	dispatch def Number subtract(Float a, Number b) {
		if (b instanceof Integer) {
			a.floatValue - b.floatValue
		} else {
			a.floatValue - (b as Float).floatValue			
		}
	}
	
	dispatch def Number multiply(Integer a, Number b) {
		if (b instanceof Integer) {
			Integer.valueOf(a.intValue * b.intValue)
		} else {
			a.floatValue * (b as Float).floatValue		
		}
	}
	dispatch def Number multiply(Float a, Number b) {
		if (b instanceof Integer) {
			a.floatValue * b.floatValue
		} else {
			a.floatValue * (b as Float).floatValue			
		}
	}
	
	dispatch def Number divide(Integer a, Number b) {
		if (b instanceof Integer) {
			Integer.valueOf(a.intValue / b.intValue)
		} else {
			a.floatValue / (b as Float).floatValue		
		}
	}
	dispatch def Number divide(Float a, Number b) {
		if (b instanceof Integer) {
			a.floatValue / b.floatValue
		} else {
			a.floatValue / (b as Float).floatValue			
		}
	}

	dispatch def String translateToJavaString(Number n) { 
		'''
		«n.toString»;
		'''
	}
	dispatch def String translateToJavaString(Float f) '''«f.toString»;'''
	
}


