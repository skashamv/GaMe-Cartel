package jrame;
import tictac.*;
import SnakeGame.*;
import Puzzlepack.*;
import SnakeGame.GameSnakeFRame;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class GameFrame extends JFrame implements ActionListener {

	
	
    JFrame f=new JFrame("GaMe Cartel");  
    JButton b1=new JButton("Snake Game"); 
    JButton b2=new JButton("Tic-Tac-Toe");
    JButton b3=new JButton("Puzzle Game");
    
   
    
    
    GameFrame(){
    	
    Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\91885\\Desktop\\java files\\logo.jpeg"); 
    f.setIconImage(icon); 
    
    createUI(f);
    f.setSize(2000, 200);      
    f.setLocationRelativeTo(null);  
    f.setVisible(true);
    	
   
    b1.setBounds(50,250,95,30);
    b1.setSize(500,100);
    b2.setBounds(50,450,95,30);
    b2.setSize(500,100);
    b3.setBounds(50,650,95,30);
    b3.setSize(500,100);
  
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(b1);
    f.add(b2);
    f.add(b3);
   
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    
    Color customColor = new Color(148,0,221);
    f.getContentPane().setBackground(customColor);
    
    
    f.setSize(2000,1000);  
    f.setLayout(null);  
    f.setVisible(true);
    }
    
    public static void createUI(JFrame f){
        
        
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();  
        panel.setLayout(layout);       

        JPanel panel1 = new JPanel();
        String spaces = "                   ";
       
        
        
        JLabel label1= new JLabel(spaces+"Welcome to GaMe Cartel"+spaces);
        label1.setFont(new Font("Verdana", Font.BOLD, 48));
        Color customColor2 = new Color(255,255,153);
        label1.setForeground(customColor2);
        
        
        panel1.add(label1);  
        panel.add(panel1);
        Color customColor1 = new Color(148,0,221);
        panel.setBackground(customColor1);
        panel1.setBackground(customColor1);
        f.getContentPane().add(panel, BorderLayout.CENTER);    
     }
  

    public void actionPerformed(ActionEvent e) {
    	if(e.getSource()== b1) {
    		
    		new GameSnakeFRame();
    		
    	}
    	else if(e.getSource()==b2) {
    		TicTacToe tictactoe=new TicTacToe();
    	}
    	else if(e.getSource()==b3) {
    		new PuzzleGame();  
    	}
    	
    }
    
 }


