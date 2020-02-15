//import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.*; 
//import java.awt.color.*;
//import java.awt.event.*;

public class flagClass extends JPanel {
	 public void paintComponent (Graphics page) {
		 Color purple = new Color(90, 0, 100);
		 Color grey = new Color(240, 240, 250);
		 @SuppressWarnings("unused")
		int xpos1, ypos1, xpos2, ypos2, xpos3, ypos3, xpos4, ypos4, height, width;
		 xpos1 = 10;
		 ypos1 = 10;
		 xpos2 = 30;
		 ypos2 = 110;
		 xpos3 = 30;
		 ypos3 = 210;
		 xpos4 = 30;
		 ypos4 = 310;
		 height = 100;
		 width = 600;
		 setBackground (grey);
		 super.paintComponent (page);
		 
		 page.setColor(Color.black);
		 page.fillRect(xpos1, ypos1, width, height);
		 
		 page.setColor(Color.gray);
		 page.fillRect(xpos1, ypos2, width, height);
		 
		 page.setColor(Color.white);
		 page.fillRect(xpos1, ypos3, width, height);
		 
		 page.setColor(purple);
		 page.fillRect(xpos1, ypos4, width, height);
		 
	 }
	
}
