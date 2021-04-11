package org.xtext.example.mydsl2.group16.generator

import org.xtext.example.mydsl2.group16.greedySnake.GreedySnake



import org.eclipse.emf.ecore.resource.Resource
import org.xtext.example.mydsl2.group16.greedySnake.InitialSnakeSpecificatin

import org.eclipse.emf.ecore.EClass
import org.xtext.example.mydsl2.group16.greedySnake.InitialFoodSpecificatin
import org.xtext.example.mydsl2.group16.greedySnake.InitialObstacleSpecificatin
import java.util.Map
import java.util.List
import java.util.HashMap
import java.util.Collections
import java.util.LinkedList

class ModelPreprocessor {
	val GreedySnake gs
	var int currentStateID = 0
	//蛇的specification ----个人认为可能grammar改成一人一个state比较好
//	//可能需要改---snake
//	val Map<InitialSnakeSpecificatin,List<Pair<AllItemState,Pair<Integer,? extends Map<String,Value>>>>>
//		snakeStateRegistry  = new HashMap<InitialSnakeSpecificatin,List<Pair<AllItemState,Pair<Integer,? extends Map<String,Value>>>>>
//		
//	//可能需要改---food
//	val Map<InitialFoodSpecificatin,List<Pair<AllItemState,Pair<Integer,? extends Map<String,Value>>>>>
//		foodStateRegistry  = new HashMap<InitialFoodSpecificatin,List<Pair<AllItemState,Pair<Integer,? extends Map<String,Value>>>>>
//	
//	//可能需要改---obstacle
//	val Map<InitialObstacleSpecificatin,List<Pair<AllItemState,Pair<Integer,? extends Map<String,Value>>>>>
//		obstacleStateRegistry  = new HashMap<InitialObstacleSpecificatin,List<Pair<AllItemState,Pair<Integer,? extends Map<String,Value>>>>>
		
	
	
	new(Resource resource){
		//Eobject -----any element of EMF
		gs = resource.allContents.filter(GreedySnake).head
		
//		preprocess()
	}
	def getGreedySnake(){
		gs
	}
	
	
//	private def preprocess() {
//		//蛇部分
//		gs.snakes.forEach [s | 
//			s.normalizeSnakeDisplayAnnotation 
//			s.extractSnakeStates.forEach [cs |
//				cs.createSnakeUniqueID(s)
//			]
//		]
//		//食物
//		gs.foods.forEach [f | 
//			f.normalizeFoodeDisplayAnnotation
//			f.extractFoodStates.forEach [ cs |
//				cs.createFoodUniqueID(f)
//			]
//		]
//		//障碍
//		gs.obstacles.forEach [o | 
//			o.normalizeObstacleDisplayAnnotation
//			o.extractObstacleStates.forEach [ cs |
//				cs.createObstacleUniqueID(o)
//			]
//		]
//	}

//	
//	private def createSnakeUniqueID(Pair<? extends Map <String,Value>,AllItemState> stateDef, InitialSnakeSpecificatin s){
//		var List<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>> states= snakeStateRegistry.get(s)
//		if(states === null){
//			states = new LinkedList<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>>()
//			snakeStateRegistry.put(s,states)
//		}
//		states.add(new Pair(stateDef.value, new Pair<Integer, Map<String,Value>>(currentStateID++, stateDef.key)))
//	}
//	
//	private def createFoodUniqueID(Pair<? extends Map <String,Value>,AllItemState> stateDef, InitialFoodSpecificatin f){
//		var List<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>> states = foodStateRegistry.get(f)
//		if(states === null){
//			states = new LinkedList<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>>()
//			foodStateRegistry.put(f,states)
//		}
//		states.add(new Pair(stateDef.value, new Pair<Integer, Map<String,Value>>(currentStateID++, stateDef.key)))
//	}
//	
//	private def createObstacleUniqueID(Pair<? extends Map <String,Value>,AllItemState> stateDef, InitialObstacleSpecificatin o){
//		var List<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>> states = obstacleStateRegistry.get(o)
//		if(states === null){
//			states = new LinkedList<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>>()
//			obstacleStateRegistry.put(o,states)
//		}
//		states.add(new Pair(stateDef.value, new Pair<Integer, Map<String,Value>>(currentStateID++, stateDef.key)))
//	}
//	
//	//有问题---蛇的initial
//	def void normalizeSnakeDisplayAnnotation(InitialSnakeSpecificatin s){
//		//正常化显示dispaly--为什么要进行筛选？
//		if((s.members.filter(AllItemStateSpec).empty) && (!s.members.filter(AllItemDisplaySpec).empty)){
//			//不知道有啥用
//			var stateSpec = gs.eClass.EPackage.EFactoryInstance.create(gs.eClass.EPackage.EClassifiers.findFirst
//				[ec | ec.name.equals("LocalAllItemStateSpec")] as EClass ) as LocalAllItemStateSpec
//				
//			//所有东西的状态都定义为了EClass
//			//findFirst什么意思？
//			var dummyState = gs.eClass.EPackage.EFactoryInstance.create(gs.eClass.EPackage.EClassifiers.findFirst
//				[ec | ec.name.equals("AllItemState")] as EClass ) as AllItemState
//				
//			//这个name其实是AllItemState中的name=ID 中的name, 同理下面的display是AllItemState中的display=AllItemDisplaySpec
//			//中的display。
//			//这个default可能会有大问题
//			//这一部分有很大的问题---应该是定义default的cell(原本)
//			dummyState.name = "default";
//			stateSpec.states.add(dummyState)
//			s.members.add(stateSpec)
//			dummyState.display = s.members.filter(AllItemDisplaySpec).findFirst[true]
//			stateSpec.start = dummyState
//		}
//	}
//	
//	//有问题--food的initial
//	def void normalizeFoodeDisplayAnnotation(InitialFoodSpecificatin f){
//		//正常化显示dispaly--为什么要进行筛选？
//		if((f.members.filter(AllItemStateSpec).empty) && (!f.members.filter(AllItemDisplaySpec).empty)){
//			//不知道有啥用
//			var stateSpec = gs.eClass.EPackage.EFactoryInstance.create(gs.eClass.EPackage.EClassifiers.findFirst
//				[ec | ec.name.equals("LocalAllItemStateSpec")] as EClass ) as LocalAllItemStateSpec
//				
//			//所有东西的状态都定义为了EClass
//			//findFirst什么意思？
//			var dummyState = gs.eClass.EPackage.EFactoryInstance.create(gs.eClass.EPackage.EClassifiers.findFirst
//				[ec | ec.name.equals("AllItemState")] as EClass ) as AllItemState
//				
//			//这个name其实是AllItemState中的name=ID 中的name, 同理下面的display是AllItemState中的display=AllItemDisplaySpec
//			//中的display。
//			//这个default可能会有大问题
//			//这一部分有很大的问题---应该是定义default的cell(原本)
//			dummyState.name = "default";
//			stateSpec.states.add(dummyState)
//			f.members.add(stateSpec)
//			dummyState.display = f.members.filter(AllItemDisplaySpec).findFirst[true]
//			stateSpec.start = dummyState
//		}
//	}
//	//有问题----obstacle障碍的initial
//	def void normalizeObstacleDisplayAnnotation(InitialObstacleSpecificatin O){
//		//正常化显示dispaly--为什么要进行筛选？
//		if((O.members.filter(AllItemStateSpec).empty) && (!O.members.filter(AllItemDisplaySpec).empty)){
//			//不知道有啥用
//			var stateSpec = gs.eClass.EPackage.EFactoryInstance.create(gs.eClass.EPackage.EClassifiers.findFirst
//				[ec | ec.name.equals("LocalAllItemStateSpec")] as EClass ) as LocalAllItemStateSpec
//				
//			//所有东西的状态都定义为了EClass
//			//findFirst什么意思？
//			var dummyState = gs.eClass.EPackage.EFactoryInstance.create(gs.eClass.EPackage.EClassifiers.findFirst
//				[ec | ec.name.equals("AllItemState")] as EClass ) as AllItemState
//				
//			//这个name其实是AllItemState中的name=ID 中的name, 同理下面的display是AllItemState中的display=AllItemDisplaySpec
//			//中的display。
//			//这个default可能会有大问题
//			//这一部分有很大的问题---应该是定义default的cell(原本)
//			dummyState.name = "default";
//			stateSpec.states.add(dummyState)
//			O.members.add(stateSpec)
//			dummyState.display = O.members.filter(AllItemDisplaySpec).findFirst[true]
//			stateSpec.start = dummyState
//		}
//	}
//	
//	//该部分应该是获取在xtext定义的所有蛇的状态（state）,并且以map形式返回
//	//allStates是dispatch后面的函数签名(第一个字母小写)，并没有在语法中定义
//	//dispacth的函数签名都一样，但是形参不同
//	private def extractSnakeStates(InitialSnakeSpecificatin s){
//		//只是蛇的状态
//		//但是获取了所有item的信息
//		s.members.filter(AllItemStateSpec).map[aiss | aiss.allSnakeItemStates].flatten
//	}
//	
//	private def dispatch List<Pair<? extends Map<String, Value>, AllItemState>> getAllSnakeItemStates(LocalAllItemStateSpec lasiss){
//		val symbols  = Collections.emptyMap;
//		//states = AllItemStates---> snake_initial/snake_died/obstacle_show/food_show
//		val m = lasiss.states.map[st | new Pair (symbols,st)]
//		//输出看看
//		println(m)
//		//因为最后的肯定是return值
//		lasiss.states.map[st | new Pair (symbols,st)]
//	}
//	//注意var/val的区别
//	private def dispatch List<Pair<? extends Map<String, Value>, AllItemState>> getAllSnakeItemStates(AllItemStateSpecReference aissr){
//		val symbols  = new HashMap<String,Value>()
//		
//		//put params into symbol table
//		val iter = aissr.params.iterator
//		//GlobalAllItemStateSpec中的params---symbol里面应该是<headIcon,nop>, <foodIcon,nop>, <brickIcon, nop>
//		aissr.stateSpec.params.forEach[p | 
//			symbols.put(p.name, iter.next)
//		]
//		//应该是做一个map处理（symbol,states）states与AllItemState有关
//		aissr.stateSpec.states.map[st | new Pair(symbols,st)]
//	}
//	
//	
//	//获取所有信息--从AllItemStateSpec开始
//	//dispatch 函数签名都必须一样
//	dispatch def AllItemState getSnakeStartState(InitialSnakeSpecificatin s){
//		s.members.filter(AllItemStateSpec).map[aiss | aiss.snakeStartState].findFirst[true]
//	}
//	
//	def dispatch AllItemState getSnakeStartState(LocalAllItemStateSpec laiss){
//		laiss.start
//	}
//	def dispatch AllItemState getSnakeStartState(AllItemStateSpecReference aissr){
//		aissr.stateSpec.start
//	}
//	
//	def Iterable<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>> getSnakeStates (InitialSnakeSpecificatin s){
//		snakeStateRegistry.get(s)
//	}
//	
//	def Iterable<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>> getAllSnakeStates (){
//		snakeStateRegistry.values.flatten
//	}
//	//EnterAction 没有定义不知道怎么写
//	
//	
//	
//	//field不知道怎么写
//	
//	
//	
//	//该部分应该是获取在xtext定义的所有蛇的状态（state）,并且以map形式返回
//	//allStates是dispatch后面的函数签名(第一个字母小写)，并没有在语法中定义
//	//dispacth的函数签名都一样，但是形参不同
//	private def extractFoodStates(InitialFoodSpecificatin f){
//		//只是food的状态
//		//但是获取了所有item的信息
//		f.members.filter(AllItemStateSpec).map[aiss | aiss.allFoodItemStates].flatten
//	}
//	
//	private def dispatch List<Pair<? extends Map<String, Value>, AllItemState>> getAllFoodItemStates(LocalAllItemStateSpec lasiss){
//		val symbols  = Collections.emptyMap;
//		//states = AllItemStates---> snake_initial/snake_died/obstacle_show/food_show
//		val m = lasiss.states.map[st | new Pair (symbols,st)]
//		//输出看看
//		println(m)
//		//因为最后的肯定是return值
//		lasiss.states.map[st | new Pair (symbols,st)]
//	}
//	//注意var/val的区别
//	private def dispatch List<Pair<? extends Map<String, Value>, AllItemState>> getAllFoodItemStates(AllItemStateSpecReference aissr){
//		val symbols  = new HashMap<String,Value>()
//		
//		//put params into symbol table
//		val iter = aissr.params.iterator
//		//GlobalAllItemStateSpec中的params---symbol里面应该是<headIcon,nop>, <foodIcon,nop>, <brickIcon, nop>
//		aissr.stateSpec.params.forEach[p | 
//			symbols.put(p.name, iter.next)
//		]
//		//应该是做一个map处理（symbol,states）states与AllItemState有关
//		aissr.stateSpec.states.map[st | new Pair(symbols,st)]
//	}
//	
//	
//	//可能需要重新想一下这部分
//	//这里定义的是在开始的时候选择food的哪个部分作为开始游戏
//	//dispatch 函数签名都必须一样
//	dispatch def AllItemState getFoodStartState(InitialFoodSpecificatin f){
//		f.members.filter(AllItemStateSpec).map[aiss | aiss.foodStartState].findFirst[true]
//	}
//	
//	def dispatch AllItemState getFoodStartState(LocalAllItemStateSpec laiss){
//		laiss.start
//	}
//	def dispatch AllItemState getFoodStartState(AllItemStateSpecReference aissr){
//		aissr.stateSpec.start
//	}
//	
//	def Iterable<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>> getFoodStates (InitialFoodSpecificatin s){
//		foodStateRegistry.get(s)
//	}
//	
//	def Iterable<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>> getAllFoodStates (){
//		foodStateRegistry.values.flatten
//	}
//	
//	
//	
//	
//	
//	
//	
//	
//	//该部分应该是获取在xtext定义的所有障碍的状态（state）,并且以map形式返回
//	//allStates是dispatch后面的函数签名(第一个字母小写)，并没有在语法中定义
//	//dispacth的函数签名都一样，但是形参不同
//	private def extractObstacleStates(InitialObstacleSpecificatin o){
//		//只是障碍的状态
//		//但是获取了所有item的信息
//		o.members.filter(AllItemStateSpec).map[aiss | aiss.allObstacleItemStates].flatten
//	}
//	
//	private def dispatch List<Pair<? extends Map<String, Value>, AllItemState>> getAllObstacleItemStates(LocalAllItemStateSpec lasiss){
//		val symbols  = Collections.emptyMap;
//		//states = AllItemStates---> snake_initial/snake_died/obstacle_show/food_show
//		val m = lasiss.states.map[st | new Pair (symbols,st)]
//		//输出看看
//		println(m)
//		//因为最后的肯定是return值
//		lasiss.states.map[st | new Pair (symbols,st)]
//	}
//	//注意var/val的区别
//	private def dispatch List<Pair<? extends Map<String, Value>, AllItemState>> getAllObstacleItemStates(AllItemStateSpecReference aissr){
//		val symbols  = new HashMap<String,Value>()
//		
//		//put params into symbol table
//		val iter = aissr.params.iterator
//		//GlobalAllItemStateSpec中的params---symbol里面应该是<headIcon,nop>, <foodIcon,nop>, <brickIcon, nop>
//		aissr.stateSpec.params.forEach[p | 
//			symbols.put(p.name, iter.next)
//		]
//		//应该是做一个map处理（symbol,states）states与AllItemState有关
//		aissr.stateSpec.states.map[st | new Pair(symbols,st)]
//	}
//	
//	
//	//可能需要重新想一下这部分
//	//这里定义的是在开始的时候选择obstacle的哪个部分作为开始游戏
//	//dispatch 函数签名都必须一样
//	dispatch def AllItemState getObstacleStartState(InitialObstacleSpecificatin o){
//		//aiss.后面的变量和dispatch的函数签名要一样
//		o.members.filter(AllItemStateSpec).map[aiss | aiss.obstacleStartState].findFirst[true]
//	}
//	
//	def dispatch AllItemState getObstacleStartState(LocalAllItemStateSpec laiss){
//		laiss.start
//	}
//	
//	def dispatch AllItemState getobstacleStartState(AllItemStateSpecReference aissr){
//		aissr.stateSpec.start
//	}
//	
//	def Iterable<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>> getObstacleStates (InitialObstacleSpecificatin o){
//		obstacleStateRegistry.get(o)
//	}
//	
//	def Iterable<Pair<AllItemState, Pair<Integer, ? extends Map<String, Value>>>> getAllObstacleStates (){
//		obstacleStateRegistry.values.flatten
//	}
	
	

	
}