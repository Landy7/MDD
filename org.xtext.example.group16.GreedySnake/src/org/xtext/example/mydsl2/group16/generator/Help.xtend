package org.xtext.example.mydsl2.group16.generator

import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.example.mydsl2.group16.greedySnake.HelpSpecification

class Help extends GeneralGenerator{
	
	new(ModelPreprocessor mpp){
		super (mpp)
	}
	def generate(IFileSystemAccess fsa){
		fsa.generateFile('''«generateHelpClassFileName()»''',generateHelp())
	}
	
	def generateHelp()'''
			package «generateGamePackage»;
			
			import java.awt.*;
			
			import javax.swing.*;
			
			public class Help extends JDialog {
			    private static final long serialVersionUID = 4693799019369193520L;
			    private JPanel contentPane;
			    private Font f = new Font("Calibri",Font.PLAIN,15);
			    private JScrollPane scroll;
				
			    public Help() {
			    	«gs.help.join("",[o |generateHelpContext(o)])»
			        J1.setFocusable(false);
			    	J1.setFont(f);
			    	J1.setEditable(false);
			    	J1.setOpaque(false);
			    	J1.setLineWrap(true);
			    	
			    	scroll = new JScrollPane(J1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			    	scroll.setBorder(BorderFactory.createTitledBorder("How to play"));
			    	scroll.setOpaque(false);
			    	scroll.getViewport().setOpaque(false);
			    	shadePanel.add(scroll);
			    	scroll.setBounds(10, 10, 385, 330);
			    	
			    	setVisible(true);
			    }
			    
			    public static void main(String[] args) {
					new Help();
				}
			}
			
	'''
	
	def generateHelpContext(HelpSpecification hs) {
		'''
		 setTitle("«hs.helpTitle»");//title
		 Image img=Toolkit.getDefaultToolkit().getImage("title.png");
		 setIconImage(img);
		 setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		 setModal(true);
		 setSize(«hs.x»,«hs.y»);
		 setResizable(false);
		 setLocationRelativeTo(null);
		 contentPane = new JPanel();
		 contentPane.setLayout(new BorderLayout(0, 0));
		 setContentPane(contentPane);
		 ShadePanel shadePanel = new ShadePanel();
		 contentPane.add(shadePanel, BorderLayout.CENTER);
		 shadePanel.setLayout(null);
		 
		 JTextArea J1 = new JTextArea("«hs.helpInfor»");
		'''
	}
	
}
