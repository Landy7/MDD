package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class IndexToPixel extends GeneralGenerator{
	
	new(ModelPreprocessor mpp){
		super (mpp)
	}
	
	def generate(IFileSystemAccess fsa){
		fsa.generateFile('''«generateIndexToPixelClassFileName()»''',generateIndexToPixel())
	}
	
	def generateIndexToPixel() '''
			package «generateGamePackage»;
			
			public class IndexToPixel {
				public static int getXPixel(int i)
				{
					return 7+i*22;
				}
					
				public static int getYPixel(int i)
				{
					return 12+i*22;
				}
			}
			
	'''
	
}