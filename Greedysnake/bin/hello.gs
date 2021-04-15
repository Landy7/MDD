game GreedySnake{
	//map Path
	Filepath = "map.txt"
	
	field init_field {
		Panel_width = 900
		Panel_Height = 480
		column = 40
		row = 21
		label_width = 1000
		label_Height = 540
		
		init item (){
			Default : 
			snakeLength = "1"
			Score = ""
			Time = ""
			Amount = "0"
			Weapon = "20"
		}
	}
	
	snake snake_initial {
		head = (0,0)
		//locate
		//do not modify
		headIcon {
			HeadTag1 "emotion1" = 0
			Locate : "head//head0.png"
			
			HeadTag2 "emotion2" = 1
			Locate : "head//head1.png"
			
			HeadTag3 "emotion3" = 2
			Locate : "head//head2.png"
			
			HeadTag4 "emotion4" = 3
			Locate : "head//head3.png"
				
		}
		Icon_size = 20
		//do not modify
		BodyIcon {
			BodyTag1 "hello1" = 0
			Locate : "body//body0.png"
			
			BodyTag2 "hello2" = 1
			Locate : "body//body1.png"
			
			BodyTag3 "hello3" = 2
			Locate : "body//body2.png"
			
			BodyTag4 "hello4" = 3
			Locate : "body//body3.png"
			
			BodyTag5 "hello4" = 4
			Locate : "body//body3.png"
		}
		
		defaultSpeed = 300
		snakeTag = 1
		}
	
	Direction{
		up = UP
		down = DOWN
		left = LEFT
		right = RIGHT
	}
	
	snake move{
		 if(direction = up)
		 snakehead.y - 1
		 if (direction = down)
		 snakehead.y + 1
		 if (direction = left)
		 snakehead.x - 1
		 if (direction = right)
		 snakehead.x + 1
	}
	
	//at least the 6 icon
	food food_initial {
		foodIcon {
			FoodTag1 "kind1" = 0
			Locate : "food//food1.png"
			
			FoodTag2 "kind2" = 1
			Locate : "food//food2.png"
			
			FoodTag3 "kind3" = 2
			Locate : "food//food3.png"
			
			FoodTag4 "kind4" = 3
			Locate : "food//food4.png"
			
			FoodTag5 "kind5" = 4
			Locate : "food//food5.png"
			
			FoodTag6 "kind6" = 5
			Locate : "food//food6.png"
			
			
		}
		Icon_size = 20
		foodKind {
			FoodTag1 : point = (0 * 2) + 3.5
			FoodTag2 : point = (1 * 10.5 + 3)
			FoodTag3 : point = (2 * 10 + 3.5)
			FoodTag4 : point = (3 + 2) + 2.5
			FoodTag5 : point = (4 * 10 + 3.7)
			FoodTag6 : point = (5 * 10 + 3.6)
		}
		//modify
		randomFoodSize  Maxsize 8 Minsize 3
		foodTag = 2
	}
	
	obstacle obstacle_initial {
		ObstacleIcon {
			FoodTag1 "brick" = 0
			Locate : "image//brick.png"
		}
		Icon_size = 20
		ObstacleTag = 3
	}
	
	fire fire_initial {
		FireIcon {
			FireTag1 "fire" = 0
			Locate : "image//fire.png"
		}
		Icon_size = 20
	}
	
	timeLimited {
	refresh_food = 10000
	refresh_obstacle = 20000
	}
		
	Speed{
		ordinary = 600
		walk = 400
		run = 300
		crazy = 150
	}
	
	about aboutContent {
		Title : "About game"
		Information  : "hello"
		Label_size : (410,380)
	}
	
	help helpContent {
		Title : "Help"
		Information : "using the key of up/down/left/right to control the snake and using the shift key to release bullets."
		Label_size : (410,380)
	}
	
	//at least 6 icon
	backGround {
		Icon {
			BodyTag1 "desert" = 0
			Locate  : "background//desert.jpg"
			
			BodyTag2 "grass" = 1
			Locate  : "background//grass.jpg"
			
			BodyTag3 "ocean" = 2
			Locate  : "background//ocean.jpg"
			
			BodyTag4 "ocean2" = 3
			Locate  : "background//ocean2.jpg"
			
			BodyTag4 "sky" = 4
			Locate  : "background//sky.jpg"
			
			BodyTag4 "sky2" = 5
			Locate  : "background//sky2.jpg"
			
		}
		Height = 540
		Width = 1000
	}
	
	Music {
		BufferSize = 524288
		MusicOver  path =  "music//over.wav"
		MusicExplode  path = "music//Explode.wav"
		MusicEat  path = "music//eat.wav"
 	} //music
 	
 	start  = init_field
}       