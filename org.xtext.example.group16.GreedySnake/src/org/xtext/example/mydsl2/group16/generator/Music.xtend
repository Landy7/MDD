package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess

import org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification

class Music extends GeneralGenerator{
	
	new(ModelPreprocessor mpp){
		super (mpp)
	}
	
	def generate(IFileSystemAccess fsa){
		fsa.generateFile('''«generateMusicClassFileName()»''',generateMusic())
	}
	
	def generateMusic()'''
			package «generateGamePackage»;
			
			import java.io.File;
			
			import java.io.IOException;
			import javax.sound.sampled.AudioFormat;
			import javax.sound.sampled.AudioInputStream;
			import javax.sound.sampled.AudioSystem;
			import javax.sound.sampled.DataLine;
			import javax.sound.sampled.LineUnavailableException;
			import javax.sound.sampled.SourceDataLine;
			import javax.sound.sampled.UnsupportedAudioFileException;
			
			/*
			 * 负责播放音频
			 * 调用方法
			 * new Music(filepath).start();
			 * filepath为音频文件的路径，如果直接使用文件名，文件得放在项目文件夹的最外层目录
			 */
			public class Music extends Thread{ 	 
			    private String filepath;
			    «gs.music.join("",[o | generateMusicSize(o)])»; // 128Kb --524288
			
			    public Music(String wavfile) { 
			        filepath = wavfile;
			    } 
			    	    
			    public void run() { 
			        File soundFile = new File(filepath); 
			        AudioInputStream audioInputStream = null;
			        try { 
			            audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			        } catch (UnsupportedAudioFileException e1) { 
			            e1.printStackTrace();
			            return;
			        } catch (IOException e1) { 
			            e1.printStackTrace();
			            return;
			        } 
			 
			        AudioFormat format = audioInputStream.getFormat();
			        SourceDataLine auline = null;
			        DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
			 
			        try { 
			            auline = (SourceDataLine) AudioSystem.getLine(info);
			            auline.open(format);
			        } catch (LineUnavailableException e) { 
			            e.printStackTrace();
			            return;
			        } catch (Exception e) { 
			            e.printStackTrace();
			            return;
			        } 
			
			        auline.start();
			        int nBytesRead = 0;
			        byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];
			 
			        try { 
			            while (nBytesRead != -1) { 
			                nBytesRead = audioInputStream.read(abData, 0, abData.length);
			                if (nBytesRead >= 0) 
			                    auline.write(abData, 0, nBytesRead);
			            } 
			        } catch (IOException e) { 
			            e.printStackTrace();
			            return;
			        } finally { 
			            auline.drain();
			            auline.close();
			        } 
			    } 
			}
			
	'''
	
	def generateMusicSize(MusicSpecification sp) {
		var name = sp.buffersize
		'''
		private final int EXTERNAL_BUFFER_SIZE = «name»
		'''
	}
	
}