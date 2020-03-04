import javax.swing.JPanel;
import java.awt.*; 
//import java.util.ArrayList;
//import java.awt.color.*;
//import java.awt.event.*;

public class flagClass extends JPanel {
	public void paintComponent (Graphics page) {
		/*
		This class has the flags
		//Shade Colors below
		//Color darkPurple = new Color(80, 0, 100);
		//Color darkWhite = new Color(250, 250, 250);
		//Color darkGrey = new Color(100, 100, 100);
		//int xpos3, shadxpos1 ,shadypos1 , shadypos2, shadypos3, shadypos4, xpos4;
		shadow
		shadxpos1 = 15;
		shadypos1 = 15;
		shadypos2 = 115;
		shadypos3 = 215;
		shadypos4 = 315;
		//flag3
		//xpos3 = 10;
		//flag4
		//xpos4 = 620;
		//From demi flag int[] y2 = {420, 620, 820}; 
		demisexposy1 = 420;
		demisexposy2 = 590;
		demisexposy3 = 620;
		//Shadow ACE Flag
		page.setColor(Color.black);
		page.fillRect(shadxpos1, shadypos1, width, height);
		page.setColor(darkGrey);
		page.fillRect(shadxpos1, shadypos2, width, height);

		page.setColor(darkWhite);
		page.fillRect(shadxpos1, shadypos3, width, height);

		page.setColor(darkPurple);
		page.fillRect(shadxpos1, shadypos4, width, height);
		*/		

		Color purple = new Color(100, 0, 120);		 
		Color grey = new Color(240, 240, 250);		 
		Color arogreen = new Color(0, 150, 0);
		Color lightAroGreen = new Color(0, 205, 0);
		Color arogrey = new Color(210, 210, 210);

		int xpos1, ypos1, xpos2, ypos2, ypos4, height, width, height2, aroflagypos2, aroflagypos3;
		int aroflagypos4, aroflagypos5, demiaroposy1, height3, height4, demiaroposy2, demiaroposy3;
		int ypos3; 

		//AceFlag
		xpos1 = 10;
		ypos1 = 10;
		ypos2 = 110;
		ypos3 = 210;
		ypos4 = 310;
		height = 100;
		width = 600;

		//Aro Flag
		xpos2 = 620;
		aroflagypos2 = 90;
		height2 = 80;
		aroflagypos3 = 170;
		aroflagypos4 = 250;
		aroflagypos5 = 330;

		//Demiromo flag 
		int[] x = {10, 260, 10}; 
		int[] y = {500 /*420*/, 700 /*620*/, 900 /*820*/}; 
		demiaroposy1 = 500 /*420*/;
		demiaroposy2 = 670/*590*/;
		demiaroposy3 = 700 /*620*/;
		height3 = 200;
		height4 = 60;

		//demisexual flag
		int[] x2 = {620, 860, 620}; 

		height3 = 200;
		height4 = 60;

		setBackground (grey);
		super.paintComponent (page);

		//ACE FLAG
		page.setColor(Color.black);
		page.fillRect(xpos1, ypos1, width, height);

		page.setColor(Color.gray);
		page.fillRect(xpos1, ypos2, width, height);

		page.setColor(Color.white);
		page.fillRect(xpos1, ypos3, width, height);

		page.setColor(purple);
		page.fillRect(xpos1, ypos4, width, height);


		//AROFLAG
		page.setColor(arogreen);
		page.fillRect(xpos2, ypos1, width, height2);

		page.setColor(lightAroGreen);
		page.fillRect(xpos2, aroflagypos2, width, height2);

		page.setColor(Color.white);
		page.fillRect(xpos2, aroflagypos3, width, height2);

		page.setColor(Color.gray);
		page.fillRect(xpos2, aroflagypos4, width, height2);

		page.setColor(Color.black);
		page.fillRect(xpos2, aroflagypos5, width, height2);

		//Demiromantic Flag		 		 
		page.setColor(Color.white);
		page.fillRect(xpos1, demiaroposy1, width, height3);

		page.setColor(arogrey);
		page.fillRect(xpos1, demiaroposy3, width, height3);

		page.setColor(arogreen);
		page.fillRect(xpos1, demiaroposy2, width, height4);


		page.setColor(Color.black);
		page.fillPolygon(x, y, 3);

		//Demisexual flag
		page.setColor(Color.white);
		page.fillRect(xpos2, demiaroposy1, width, height3);

		page.setColor(arogrey);
		page.fillRect(xpos2, demiaroposy3, width, height3);

		page.setColor(purple);
		page.fillRect(xpos2, demiaroposy2, width, height4);


		page.setColor(Color.black);
		page.fillPolygon(x2, y, 3);
	}
}
