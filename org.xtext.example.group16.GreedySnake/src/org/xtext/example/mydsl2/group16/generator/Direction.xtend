package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class Direction extends GeneralGenerator{
	
	new(ModelPreprocessor mpp){
		super (mpp)
	}
	
	def generate(IFileSystemAccess fsa){
		fsa.generateFile('''«generateDirectionClassFileName()»''',generateDirection())
	}
	
	def generateDirection()'''
			package «generateGamePackage»;
			
			public enum Direction {
				UP, DOWN, LEFT, RIGHT;
			}
			
	'''
	
}