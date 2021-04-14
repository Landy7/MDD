package GreedySnake.game;

import java.awt.*;

import javax.swing.*;

public class Help extends JDialog {
    private static final long serialVersionUID = 4693799019369193520L;
    private JPanel contentPane;
    private Font f = new Font("Calibri",Font.PLAIN,15);
    private JScrollPane scroll;
	
    public Help() {
    	setTitle("Help");//title
    	Image img=Toolkit.getDefaultToolkit().getImage("title.png");
    	setIconImage(img);
    	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    	setModal(true);
    	setSize(410,380);
    	setResizable(false);
    	setLocationRelativeTo(null);
    	contentPane = new JPanel();
    	contentPane.setLayout(new BorderLayout(0, 0));
    	setContentPane(contentPane);
    	ShadePanel shadePanel = new ShadePanel();
    	contentPane.add(shadePanel, BorderLayout.CENTER);
    	shadePanel.setLayout(null);
    	
    	JTextArea J1 = new JTextArea("......");
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

