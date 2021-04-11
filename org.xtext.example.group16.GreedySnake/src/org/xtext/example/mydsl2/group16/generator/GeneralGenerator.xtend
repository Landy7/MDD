package org.xtext.example.mydsl2.group16.generator

import org.xtext.example.mydsl2.group16.greedySnake.GreedySnake

class GeneralGenerator {
	protected ModelPreprocessor mpp
	protected val GreedySnake gs
	
	new(ModelPreprocessor mpp){
		this.mpp = mpp
		//getGreedySnake() in ModelPreprocess.xtend 
		gs = mpp.greedySnake
	}
	
	//两个包---game and snake
	def generateGamePackage() '''«gs.name».game'''
	
	def generateGamePackageFolder() '''«gs.name»/game'''
	
	def generateSnakePackage() '''«gs.name».snake'''
	
	def generateSnakePackageFolder() '''«gs.name»/snake'''
	
	//每个包下面有几个java文件
	//game package
	def generateAboutClassFileName()  '''«generateGamePackageFolder»/About.java'''
	def generateCoordinateClassFileName()  '''«generateGamePackageFolder»/Coordinate.java'''
	def generateDirectionClassFileName()  '''«generateGamePackageFolder»/Direction.java'''
	def generateFoodSetClassFileName()  '''«generateGamePackageFolder»/Foodset.java'''
	def generateHelpClassFileName()  '''«generateGamePackageFolder»/Help.java'''
	def generateIndexToPixelClassFileName()  '''«generateGamePackageFolder»/IndexToPixel.java'''
	def generateMainWindowClassFileName()  '''«generateGamePackageFolder»/MainWindow.java'''
	def generateMusicClassFileName()  '''«generateGamePackageFolder»/Music.java'''
	def generateObstacleClassFileName()  '''«generateGamePackageFolder»/Obstacle.java'''
	def generateSysTimeClassFileName()  '''«generateGamePackageFolder»/SysTime.java'''
	def generateWrite2fileClassFileName()  '''«generateGamePackageFolder»/Write2file.java'''
	
	//snake package
	def generateBodyClassFileName() '''«generateSnakePackageFolder»/Body.java'''
	def generatePlayerSnakeClassFileName() '''«generateSnakePackageFolder»/PlayerSnake.java'''
	
	
	//所有java文件的class名字
	//body的class name
	def generateBodyClassName(String b) '''«b.toFirstUpper»Body'''
	def generatePlayerSnakeClassName(String b) '''«b.toFirstUpper»PlayerSnake'''
	
	def generateAboutClassName(String b) '''«b.toFirstUpper»About'''
	def generateCoordinateClassName(String b)  '''«b.toFirstUpper»Coordinate'''
	def generateDirectionClassName(String b)  '''«b.toFirstUpper»Direction'''
	def generateFoodSetClassName(String b)  '''«b.toFirstUpper»Foodset'''
	def generateHelpClassName(String b)  '''«b.toFirstUpper»Help'''
	def generateIndexToPixelClassName(String b)  '''«b.toFirstUpper»IndexToPixel'''
	def generateMainWindowClassName()  '''MainWindow'''
	def generateMusicClassName(String b)  '''«b.toFirstUpper»Music'''
	def generateObstacleClassName(String b)  '''«b.toFirstUpper»Obstacle'''
	def generateSysTimeClassName(String b)  '''«b.toFirstUpper»SysTime'''
	def generateWrite2fileClassName(String b)  '''«b.toFirstUpper»Write2file'''
	
	
	
	
	
	
	
	
}