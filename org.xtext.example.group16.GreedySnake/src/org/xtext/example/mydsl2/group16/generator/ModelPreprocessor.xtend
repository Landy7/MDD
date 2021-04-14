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
	
	new(Resource resource){
		gs = resource.allContents.filter(GreedySnake).head
		
	}
	def getGreedySnake(){
		gs
	}
	
}