import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class buttonClass extends flagClass { 	
	public static void buttonClassMethod() {
		int width, height, x1, y1, x2, y2, labelWidth, labelHeight, aceLabelX, aceLabelY, aroLabelX;
		int aroLabelWidth, demiAroLabelX, demiAroLabelY, demiAroLabelWidth, demiAroLabelHeight;
		width = 300;
		height = 50;
		labelWidth = 500;
		labelHeight = 30;
		aroLabelWidth = 540;
		demiAroLabelWidth = 600;
		demiAroLabelHeight = 60;
		x1 = 160; 
		x2 = 760;
		y1 = 415;
		y2 = 905;
		aceLabelX = 60;
		aceLabelY = 467;
		aroLabelX = 650;
		demiAroLabelX = 10;
		demiAroLabelY = 960;
		//demiAceLabelX = 650;

		JFrame firstFrame = new JFrame("Pride Flags");
		JButton aceButton = new JButton("Asexual (Ace) Flag");
		JButton aroButton = new JButton("Aromantic (Aro) Flag");
		JButton demiAroButton = new JButton("Demiromantic (Demi) Flag");
		JButton demiAceButton = new JButton("Demisexual (Demi) Flag");	
		Label label = new Label();
		Label aroLabel = new Label();
		TextArea demiAroLabel = new TextArea();
		TextArea demiAceLabel = new TextArea();
		 
		aceButton.setBounds(x1, y1, width, height);	
		aroButton.setBounds(x2, y1, width, height);
		demiAroButton.setBounds(x1, y2, width, height);
		demiAceButton.setBounds(x2, y2, width, height);
		label.setBounds(aceLabelX, aceLabelY, labelWidth, labelHeight);
		aroLabel.setBounds(aroLabelX, aceLabelY, aroLabelWidth, labelHeight);
		demiAroLabel.setBounds(demiAroLabelX, demiAroLabelY, demiAroLabelWidth, demiAroLabelHeight);
		demiAceLabel.setBounds(aroLabelX, demiAroLabelY, demiAroLabelWidth, demiAroLabelHeight);
		
		firstFrame.add(aceButton);	
		firstFrame.add(aroButton);
		firstFrame.add(demiAroButton);
		firstFrame.add(demiAceButton);
		
		aceButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				if(aceButton.getActionCommand().equals("Asexual (Ace) Flag")) {
				label.setText("Asexuality is a sexual orientation where a person experineces no or little sexual attraction.");
				firstFrame.add(label);
				label.setBackground(Color.gray);  
				label.setVisible(true);
				}				
			}
		} );
		
		aroButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				if(aroButton.getActionCommand().equals("Aromantic (Aro) Flag")) {
				aroLabel.setText("Aromanticism is a romantic orientation where a person experineces no or little romantic attraction.");
				firstFrame.add(aroLabel);
				aroLabel.setBackground(Color.gray);  
				aroLabel.setVisible(true);
				}				
			}
		} );
		
		demiAroButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				if(demiAroButton.getActionCommand().equals("Demiromantic (Demi) Flag")) {
				demiAroLabel.setText("Demiromanticism is a romantic orientation where a person experineces romantic attraction very rarely,\n usually only after having a deep and long emotional connection with someone.");
				firstFrame.add(demiAroLabel);
				demiAroLabel.setBackground(Color.gray);  
				demiAroLabel.setVisible(true);
				}				
			}
		} );
		
		demiAceButton.addActionListener(new ActionListener() { 
			@Override
			public void actionPerformed(ActionEvent e) {
				if(demiAceButton.getActionCommand().equals("Demisexual (Demi) Flag")) {
				demiAceLabel.setText("Demisexuality is a sexual orientation where a person experineces sexual attraction very rarely, usually\n only after having a deep and long emotional connection with someone.");
				firstFrame.add(demiAceLabel);
				demiAceLabel.setBackground(Color.gray);  
				demiAceLabel.setVisible(true);
				}				
			}
		} );

		
		firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstFrame.getContentPane().add (new flagClass());
		firstFrame.setSize(1250, 1050);
		firstFrame.setVisible(true);
	}

}
