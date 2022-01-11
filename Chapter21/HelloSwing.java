import javax.swing.*;
import java.awt.*;

class HelloSwing{
	public static void main(String[] args){
		JFrame f = new JFrame();
		JLabel l1 = new JLabel("hi!");
		l1.setBounds(50,50,300,40);
		f.add(l1);
		f.setSize(300,200);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}