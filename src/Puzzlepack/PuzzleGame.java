package Puzzlepack;

import java.awt.*;  
import java.awt.event.*;
import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane; 

	public class PuzzleGame extends JFrame implements ActionListener{  
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;  
	JFrame frame = new JFrame();
	JLabel textfield = new JLabel();
	
	public PuzzleGame(){  
		
		
	    super("Puzzle"); 
	    

	    Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\91885\\Desktop\\java files\\images\\puzzlee.png"); 
	    frame.setIconImage(icon);  
	    b1=new Button("1");  
	    b1.setBounds(100,100,40,40);  
	    b2=new Button("2");  
	    b2.setBounds(150,100,40,40);  
	    b3=new Button("3");  
	    b3.setBounds(200,100,40,40);  
	    b4=new Button("4");  
	    b4.setBounds(100,150,40,40);  
	    b5=new Button("5");  
	    b5.setBounds(150,150,40,40);  
	    b6=new Button("6");  
	    b6.setBounds(200,150,40,40);  
	    b7=new Button("7");  
	    b7.setBounds(100,200,40,40);  
	    b8=new Button("");  
	    b8.setBounds(150,200,40,40);  
	    b9=new Button("8");  
	    b9.setBounds(200,200,40,40);  
	  
	      
	    b1.addActionListener(this);  
	    b2.addActionListener(this);  
	    b3.addActionListener(this); 
	    b4.addActionListener(this);
	    b5.addActionListener(this);  
	    b6.addActionListener(this);  
	    b7.addActionListener(this);  
	    b8.addActionListener(this);  
	    b9.addActionListener(this);  
	    
	    textfield.setBackground(new Color(25,25,25));
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Ink Free",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Puzzle");
		textfield.setOpaque(true);
	      
	    add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);  
	    setSize(400,400);  
	    
	    frame.getContentPane().setBackground(Color.orange);
	    setResizable(false);
	    setLayout(null);  
	    setVisible(true);
	    
	}  
	public void actionPerformed(ActionEvent e){  
	    if(e.getSource()==b1){  
	        String label=b1.getLabel();  
	        if(b2.getLabel().equals("")){  
	            b2.setLabel(label);  
	            b1.setLabel("");  
	        }  
	        if(b4.getLabel().equals("")){  
	            b4.setLabel(label);  
	            b1.setLabel("");  
	        }  
	    }  
	    if(e.getSource()==b2){  
	        String label=b2.getLabel();  
	        if(b1.getLabel().equals("")){  
	            b1.setLabel(label);  
	            b2.setLabel("");  
	        }  
	        if(b3.getLabel().equals("")){  
	            b3.setLabel(label);  
	            b2.setLabel("");  
	        }  
	        if(b5.getLabel().equals("")){  
	            b5.setLabel(label);  
	            b2.setLabel("");  
	        }  
	    }  
	    if(e.getSource()==b3){  
	        String label=b3.getLabel();  
	        if(b2.getLabel().equals("")){  
	            b2.setLabel(label);  
	            b3.setLabel("");  
	        }  
	        if(b6.getLabel().equals("")){  
	            b6.setLabel(label);  
	            b3.setLabel("");  
	        }  
	    }  
	    if(e.getSource()==b4){  
	        String label=b4.getLabel();  
	        if(b1.getLabel().equals("")){  
	            b1.setLabel(label);  
	            b4.setLabel("");  
	        }  
	        if(b7.getLabel().equals("")){  
	            b7.setLabel(label);  
	            b4.setLabel("");  
	        }  
	        if(b5.getLabel().equals("")){  
	            b5.setLabel(label);  
	            b4.setLabel("");  
	        }  
	    }  
	    if(e.getSource()==b5){  
	        String label=b5.getLabel();  
	        if(b2.getLabel().equals("")){  
	            b2.setLabel(label);  
	            b5.setLabel("");  
	        }  
	        if(b6.getLabel().equals("")){  
	            b6.setLabel(label);  
	            b5.setLabel("");  
	        }  
	        if(b4.getLabel().equals("")){  
	            b4.setLabel(label);  
	            b5.setLabel("");  
	        }  
	        if(b8.getLabel().equals("")){  
	            b8.setLabel(label);  
	            b5.setLabel("");  
	        }  
	    }  
	    if(e.getSource()==b6){  
	        String label=b6.getLabel();  
	        if(b9.getLabel().equals("")){  
	            b9.setLabel(label);  
	            b6.setLabel("");  
	        }  
	        if(b3.getLabel().equals("")){  
	            b3.setLabel(label);  
	            b6.setLabel("");  
	        }  
	        if(b5.getLabel().equals("")){  
	            b5.setLabel(label);  
	            b6.setLabel("");  
	        }  
	    }  
	    if(e.getSource()==b7){  
	        String label=b7.getLabel();  
	        if(b4.getLabel().equals("")){  
	            b4.setLabel(label);  
	            b7.setLabel("");  
	        }  
	        if(b8.getLabel().equals("")){  
	            b8.setLabel(label);  
	            b7.setLabel("");  
	        }  
	    }  
	    if(e.getSource()==b8){  
	        String label=b8.getLabel();  
	        if(b9.getLabel().equals("")){  
	            b9.setLabel(label);  
	            b8.setLabel("");  
	        }  
	        if(b7.getLabel().equals("")){  
	            b7.setLabel(label);  
	            b8.setLabel("");  
	        }  
	        if(b5.getLabel().equals("")){  
	            b5.setLabel(label);  
	            b8.setLabel("");  
	        }  
	    }  
	    if(e.getSource()==b9){  
	        String label=b9.getLabel();  
	        if(b6.getLabel().equals("")){  
	            b6.setLabel(label);  
	            b9.setLabel("");  
	        }  
	        if(b8.getLabel().equals("")){  
	            b8.setLabel(label);  
	            b9.setLabel("");  
	        }  
	    }  
	      
	      
	    if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()    
	            .equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")    
	            &&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()    
	            .equals("8")&&b9.getLabel().equals("")){ 
	    	Random random = new Random();
	    	final String[] proper_noun = {"Check your temperature mutiple times", "Wash your hands FREQUENTLY", "Cover your hand with bent elbow while sneezeing", "Alcohol sanitizers are safe for everyone",
		    		"Avoid touching nose,mouth or eyes","Keep atleast 1 metre distance from other ","If you feel unwell STAY HOME"};
		    int index = random.nextInt(proper_noun.length);
	            JOptionPane.showMessageDialog(this,proper_noun[index],"COVID-19 Awareness",JOptionPane.PLAIN_MESSAGE);    
	    }    
	}  

}
