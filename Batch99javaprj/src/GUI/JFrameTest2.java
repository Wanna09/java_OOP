package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		
		frame.setSize(new Dimension(500,350));
		frame.setLocation(new Point(200,100));
		frame.setTitle("Login Form");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new BorderLayout());
		
		JButton btnlogin = new JButton();
		btnlogin.setText("Login Button");
		btnlogin.setBackground(Color.blue);
		frame.add(btnlogin,BorderLayout.EAST);
		
		JButton btncancel = new JButton();
		btncancel.setText("Cancel");
		btncancel.setBackground(Color.red);
		frame.add(btncancel,BorderLayout.NORTH);
		
		JTextField txtname = new JTextField();
		txtname.setText("OK PR");
		txtname.setBackground(Color.red);
		frame.add(txtname,BorderLayout.WEST);
		
		JButton btnnok = new JButton();
		btnnok.setText("OK");
		btnnok.setBackground(Color.gray);
		frame.add(btnnok,BorderLayout.CENTER);
		
		JButton btnclick = new JButton();
		btnclick.setText("Click Me");
		btnclick.setBackground(Color.CYAN);
		frame.add(btnclick,BorderLayout.SOUTH);
		
		
		frame.setIconImage(new ImageIcon("src\\car.jpg4").getImage());
		
		
		
		
		
		

	}

}
