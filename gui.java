//import java.awt.*;
import javax.swing.*;

public class gui {
	public static void main(String args[]){
	JFrame firstFrame = new JFrame("ACE PRIDE YA'LL AMAZING ACES");
	firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	firstFrame.getContentPane().add (new flagClass());
    firstFrame.setSize(640,460);
    firstFrame.setVisible(true);
 	}
}
