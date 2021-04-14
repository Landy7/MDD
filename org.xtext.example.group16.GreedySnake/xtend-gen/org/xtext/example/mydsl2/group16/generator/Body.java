package org.xtext.example.mydsl2.group16.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class Body extends GeneralGenerator {
  public Body(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateBodyClassFileName = this.generateBodyClassFileName();
    _builder.append(_generateBodyClassFileName);
    fsa.generateFile(_builder.toString(), this.generateBody());
  }
  
  public CharSequence generateBody() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateSnakePackage = this.generateSnakePackage();
    _builder.append(_generateSnakePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import javax.swing.ImageIcon;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.swing.JLabel;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import  ");
    CharSequence _generateGamePackage = this.generateGamePackage();
    _builder.append(_generateGamePackage);
    _builder.append(".*;");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Body {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Coordinate coor;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("JLabel label;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Body(int x,int y,ImageIcon icon)");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("coor = new Coordinate(x,y);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("label = new JLabel(icon);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Body(Coordinate coor,ImageIcon icon){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("this.coor = coor;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("label = new JLabel(icon);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Body(Body temp){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("coor = temp.coor;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("label = temp.label;");
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
