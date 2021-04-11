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
				//注意，序号从0开始
				//横坐标：i -> 7+i*22
				//纵坐标：i -> 12+i*22
				public static int getXPixel(int i)//通过方格序号返回其横坐标
				{
					return 7+i*22;
				}
					
				public static int getYPixel(int i)//通过方格序号返回其纵坐标
				{
					return 12+i*22;
				}
			}
			
	'''
	
}