package org.xtext.example.mydsl2.group16.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class Coordinate extends GeneralGenerator {
  public Coordinate(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateCoordinateClassFileName = this.generateCoordinateClassFileName();
    _builder.append(_generateCoordinateClassFileName);
    fsa.generateFile(_builder.toString(), this.generateCoordinate());
  }
  
  public CharSequence generateCoordinate() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateGamePackage = this.generateGamePackage();
    _builder.append(_generateGamePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Coordinate {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public int x,y;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Coordinate(int x0,int y0){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("x = x0;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("y = y0;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Coordinate(Coordinate temp){");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("x = temp.x;");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("y = temp.y;");
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
