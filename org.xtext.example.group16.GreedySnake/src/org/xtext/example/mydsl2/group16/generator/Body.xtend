package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class Body extends GeneralGenerator{
	
	new(ModelPreprocessor mpp){
		super (mpp)
	}
	
	def generate(IFileSystemAccess fsa){
		fsa.generateFile('''«generateBodyClassFileName()»''',generateBody())
	}
	
	def generateBody() '''
			package «generateSnakePackage»;
			
			import javax.swing.ImageIcon;
			
			import javax.swing.JLabel;
			
			import  «generateGamePackage».*;
			

			public class Body {
				Coordinate coor;
				JLabel label;
				public Body(int x,int y,ImageIcon icon)
				{
					coor = new Coordinate(x,y);
					label = new JLabel(icon);
				}
				
				public Body(Coordinate coor,ImageIcon icon){
					this.coor = coor;
					label = new JLabel(icon);
				}
				
				public Body(Body temp){
					coor = temp.coor;
					label = temp.label;
				}
			}
			
	'''
	
}