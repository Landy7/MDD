package org.xtext.example.mydsl2.group16.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;

@SuppressWarnings("all")
public class SysTime extends GeneralGenerator {
  public SysTime(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateSysTimeClassFileName = this.generateSysTimeClassFileName();
    _builder.append(_generateSysTimeClassFileName);
    fsa.generateFile(_builder.toString(), this.generateSysTime());
  }
  
  public CharSequence generateSysTime() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateGamePackage = this.generateGamePackage();
    _builder.append(_generateGamePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("import java.util.Calendar;");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("public class SysTime {");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("public static String getSysTime(){");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Calendar Cld;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("int MI,MI2,MI3;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("int SS,SS2,SS3;");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("String Time = \"\";");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("Cld = Calendar.getInstance();");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("int YY = Cld.get(Calendar.YEAR) ;");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("int MM = Cld.get(Calendar.MONTH)+1;");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("int DD = Cld.get(Calendar.DATE);");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("int HH = Cld.get(Calendar.HOUR_OF_DAY);");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("int mm = Cld.get(Calendar.MINUTE);");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("SS = Cld.get(Calendar.SECOND);");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("MI = Cld.get(Calendar.MILLISECOND); ");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("Time += YY + \"/\" + MM + \"/\" + DD + \"-\" + HH + \":\" + mm + \":\" + SS + \":\" + MI;");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.newLine();
    _builder.append("\t\t\t        ");
    _builder.append("return Time;");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
