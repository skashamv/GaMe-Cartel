package SnakeGame;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class GameSnakeFRame extends JFrame{
	public GameSnakeFRame(){
		
		this.add(new GamePanel());
		this.setTitle("Snake");
		Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\91885\\Desktop\\java files\\images\\hero.png"); 
	    this.setIconImage(icon); 
		
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	
		
	}

}
