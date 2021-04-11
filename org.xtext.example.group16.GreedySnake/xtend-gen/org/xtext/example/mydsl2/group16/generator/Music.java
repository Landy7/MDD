package org.xtext.example.mydsl2.group16.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl2.group16.greedySnake.MusicSpecification;

@SuppressWarnings("all")
public class Music extends GeneralGenerator {
  public Music(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateMusicClassFileName = this.generateMusicClassFileName();
    _builder.append(_generateMusicClassFileName);
    fsa.generateFile(_builder.toString(), this.generateMusic());
  }
  
  public CharSequence generateMusic() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateGamePackage = this.generateGamePackage();
    _builder.append(_generateGamePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.io.File;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import java.io.IOException;");
    _builder.newLine();
    _builder.append("import javax.sound.sampled.AudioFormat;");
    _builder.newLine();
    _builder.append("import javax.sound.sampled.AudioInputStream;");
    _builder.newLine();
    _builder.append("import javax.sound.sampled.AudioSystem;");
    _builder.newLine();
    _builder.append("import javax.sound.sampled.DataLine;");
    _builder.newLine();
    _builder.append("import javax.sound.sampled.LineUnavailableException;");
    _builder.newLine();
    _builder.append("import javax.sound.sampled.SourceDataLine;");
    _builder.newLine();
    _builder.append("import javax.sound.sampled.UnsupportedAudioFileException;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("/*");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* 负责播放音频");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* 调用方法");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* new Music(filepath).start();");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("* filepath为音频文件的路径，如果直接使用文件名，文件得放在项目文件夹的最外层目录");
    _builder.newLine();
    _builder.append(" ");
    _builder.append("*/");
    _builder.newLine();
    _builder.append("public class Music extends Thread{ \t ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private String filepath;");
    _builder.newLine();
    _builder.append("    ");
    final Function1<MusicSpecification, CharSequence> _function = (MusicSpecification o) -> {
      return this.generateMusicSize(o);
    };
    String _join = IterableExtensions.<MusicSpecification>join(this.gs.getMusic(), "", _function);
    _builder.append(_join, "    ");
    _builder.append("; // 128Kb --524288");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Music(String wavfile) { ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("filepath = wavfile;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("    \t    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public void run() { ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("File soundFile = new File(filepath); ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("AudioInputStream audioInputStream = null;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try { ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("audioInputStream = AudioSystem.getAudioInputStream(soundFile);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (UnsupportedAudioFileException e1) { ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("e1.printStackTrace();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (IOException e1) { ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("e1.printStackTrace();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("AudioFormat format = audioInputStream.getFormat();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("SourceDataLine auline = null;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try { ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("auline = (SourceDataLine) AudioSystem.getLine(info);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("auline.open(format);");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (LineUnavailableException e) { ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (Exception e) { ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("        ");
    _builder.append("auline.start();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("int nBytesRead = 0;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("byte[] abData = new byte[EXTERNAL_BUFFER_SIZE];");
    _builder.newLine();
    _builder.append(" ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("try { ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("while (nBytesRead != -1) { ");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("nBytesRead = audioInputStream.read(abData, 0, abData.length);");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("if (nBytesRead >= 0) ");
    _builder.newLine();
    _builder.append("                    ");
    _builder.append("auline.write(abData, 0, nBytesRead);");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} catch (IOException e) { ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("e.printStackTrace();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("return;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} finally { ");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("auline.drain();");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("auline.close();");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("} ");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateMusicSize(final MusicSpecification sp) {
    CharSequence _xblockexpression = null;
    {
      int name = sp.getBuffersize();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("private final int EXTERNAL_BUFFER_SIZE = ");
      _builder.append(name);
      _builder.newLineIfNotEmpty();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
}