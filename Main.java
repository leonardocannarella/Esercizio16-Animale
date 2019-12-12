import java.awt.*;
import javax.swing.*;

public class Main{
	public static void main(String[] argv){
		MyFrame f = new MyFrame("Bottoni e animali");
		f.setLayout(new GridLayout(1, 1));
		Container c = f.getContentPane(); 
		MyPanel panel = new MyPanel();
		
		c.add(panel);
		f.setLocation(200,100);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 
}


	
