package org.xtext.example.mydsl2.group16.generator;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.mydsl2.group16.greedySnake.HelpSpecification;

@SuppressWarnings("all")
public class Help extends GeneralGenerator {
  public Help(final ModelPreprocessor mpp) {
    super(mpp);
  }
  
  public void generate(final IFileSystemAccess fsa) {
    StringConcatenation _builder = new StringConcatenation();
    CharSequence _generateHelpClassFileName = this.generateHelpClassFileName();
    _builder.append(_generateHelpClassFileName);
    fsa.generateFile(_builder.toString(), this.generateHelp());
  }
  
  public CharSequence generateHelp() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    CharSequence _generateGamePackage = this.generateGamePackage();
    _builder.append(_generateGamePackage);
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import java.awt.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import javax.swing.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class Help extends JDialog {");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private static final long serialVersionUID = 4693799019369193520L;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private JPanel contentPane;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private Font f = new Font(\"Calibri\",Font.PLAIN,15);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("private JScrollPane scroll;");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public Help() {");
    _builder.newLine();
    _builder.append("    \t");
    final Function1<HelpSpecification, CharSequence> _function = (HelpSpecification o) -> {
      return this.generateHelpContext(o);
    };
    String _join = IterableExtensions.<HelpSpecification>join(this.gs.getHelp(), "", _function);
    _builder.append(_join, "    \t");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("J1.setFocusable(false);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("J1.setFont(f);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("J1.setEditable(false);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("J1.setOpaque(false);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("J1.setLineWrap(true);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("scroll = new JScrollPane(J1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("scroll.setBorder(BorderFactory.createTitledBorder(\"How to play\"));");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("scroll.setOpaque(false);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("scroll.getViewport().setOpaque(false);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("shadePanel.add(scroll);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("scroll.setBounds(10, 10, 385, 330);");
    _builder.newLine();
    _builder.append("    \t");
    _builder.newLine();
    _builder.append("    \t");
    _builder.append("setVisible(true);");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("new Help();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence generateHelpContext(final HelpSpecification hs) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("setTitle(\"");
    String _helpTitle = hs.getHelpTitle();
    _builder.append(_helpTitle);
    _builder.append("\");//title");
    _builder.newLineIfNotEmpty();
    _builder.append("Image img=Toolkit.getDefaultToolkit().getImage(\"title.png\");");
    _builder.newLine();
    _builder.append("setIconImage(img);");
    _builder.newLine();
    _builder.append("setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);");
    _builder.newLine();
    _builder.append("setModal(true);");
    _builder.newLine();
    _builder.append("setSize(");
    int _x = hs.getX();
    _builder.append(_x);
    _builder.append(",");
    int _y = hs.getY();
    _builder.append(_y);
    _builder.append(");");
    _builder.newLineIfNotEmpty();
    _builder.append("setResizable(false);");
    _builder.newLine();
    _builder.append("setLocationRelativeTo(null);");
    _builder.newLine();
    _builder.append("contentPane = new JPanel();");
    _builder.newLine();
    _builder.append("contentPane.setLayout(new BorderLayout(0, 0));");
    _builder.newLine();
    _builder.append("setContentPane(contentPane);");
    _builder.newLine();
    _builder.append("ShadePanel shadePanel = new ShadePanel();");
    _builder.newLine();
    _builder.append("contentPane.add(shadePanel, BorderLayout.CENTER);");
    _builder.newLine();
    _builder.append("shadePanel.setLayout(null);");
    _builder.newLine();
    _builder.newLine();
    _builder.append("JTextArea J1 = new JTextArea(\"");
    String _helpInfor = hs.getHelpInfor();
    _builder.append(_helpInfor);
    _builder.append("\");");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
}
