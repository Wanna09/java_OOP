package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JFrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		
		frame.setVisible(true);
		
		frame.setSize(new Dimension(800,400));
		frame.setLocation(new Point(500,250));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBackground(Color.white);
		frame.setTitle("Login Form");
		
		
		
		
		frame.setLayout(new FlowLayout());
		
		JButton btn = new JButton();
		btn.setText("Click Me");
		btn.setBackground(Color.red);
		btn.setForeground(Color.white);
		frame.add(btn);
		
		JLabel lbl = new JLabel();
		lbl.setText("Enter your name");
		lbl.setForeground(Color.red);
		frame.add(lbl);
		
		
		JTextField txt = new JTextField();
		txt.setText("Kyaw Gyi");
		txt.setColumns(10);
		txt.setForeground(Color.red);
		frame.add(txt);	
		
		JButton btn2 = new JButton();
		btn2.setText("Login");
		btn2.setForeground(Color.black);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txt.getText();
				JOptionPane.showMessageDialog(null, name+" is login successfully");
				
			}
		});
		frame.add(btn2);
		
	}

}
