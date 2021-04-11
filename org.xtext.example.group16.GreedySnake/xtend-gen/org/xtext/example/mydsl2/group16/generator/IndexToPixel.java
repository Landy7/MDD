package org.xtext.example.mydsl2.group16.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class IndexToPixel extends GeneralGenerator {
  public IndexToPixel(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateIndexToPixelClassFileName = this.generateIndexToPixelClassFileName();
    _builder.append(_generateIndexToPixelClassFileName);
    fsa.generateFile(_builder.toString(), this.generateIndexToPixel());
  }
  
  public CharSequence generateIndexToPixel() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateGamePackage = this.generateGamePackage();
    _builder.append(_generateGamePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public class IndexToPixel {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//注意，序号从0开始");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//横坐标：i -> 7+i*22");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("//纵坐标：i -> 12+i*22");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static int getXPixel(int i)//通过方格序号返回其横坐标");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 7+i*22;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static int getYPixel(int i)//通过方格序号返回其纵坐标");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("return 12+i*22;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
