package org.xtext.example.mydsl2.group16.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class Direction extends GeneralGenerator {
  public Direction(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateDirectionClassFileName = this.generateDirectionClassFileName();
    _builder.append(_generateDirectionClassFileName);
    fsa.generateFile(_builder.toString(), this.generateDirection());
  }
  
  public CharSequence generateDirection() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateGamePackage = this.generateGamePackage();
    _builder.append(_generateGamePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("public enum Direction {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("UP, DOWN, LEFT, RIGHT;//上下左右");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
}
