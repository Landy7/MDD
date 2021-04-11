package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess

class SysTime extends GeneralGenerator{
	
	new(ModelPreprocessor mpp){
		super (mpp)
	}
	
	def generate(IFileSystemAccess fsa){
		fsa.generateFile('''«generateSysTimeClassFileName()»''',generateSysTime())
	}
	
	def generateSysTime()'''
			package «generateGamePackage»;
						
						import java.util.Calendar;
						
						public class SysTime {
							public static String getSysTime(){
								Calendar Cld;
								int MI,MI2,MI3;
								int SS,SS2,SS3;
								
								String Time = "";
								
								Cld = Calendar.getInstance();
								int YY = Cld.get(Calendar.YEAR) ;
						        int MM = Cld.get(Calendar.MONTH)+1;
						        int DD = Cld.get(Calendar.DATE);
						        int HH = Cld.get(Calendar.HOUR_OF_DAY);
						        int mm = Cld.get(Calendar.MINUTE);
						        SS = Cld.get(Calendar.SECOND);
						        MI = Cld.get(Calendar.MILLISECOND); 
						        Time += YY + "/" + MM + "/" + DD + "-" + HH + ":" + mm + ":" + SS + ":" + MI;
						        
						        return Time;
							}
						}
	'''
	
}