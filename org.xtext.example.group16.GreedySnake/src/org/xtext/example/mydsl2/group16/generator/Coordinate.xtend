package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class Coordinate extends GeneralGenerator{
	
	new(ModelPreprocessor mpp){
		super (mpp)
	}
	
	def generate(IFileSystemAccess fsa){
		fsa.generateFile('''«generateCoordinateClassFileName()»''',generateCoordinate())
	}
	
	def generateCoordinate()'''
			package «generateGamePackage»;
			
			
			public class Coordinate {
				public int x,y;
				
				public Coordinate(int x0,int y0){
					x = x0;
					y = y0;
				}
				
				public Coordinate(Coordinate temp){
					x = temp.x;
					y = temp.y;
				}
			}
			
	'''
	
}