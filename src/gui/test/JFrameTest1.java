package gui.test;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class JFrameTest1 {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JLabel lbl = new JLabel();
		ImageIcon icon = new ImageIcon("image/1학기 dnfl5일본교류zoom.png");
		frame.setTitle("JFrame 연습1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(200,200);
		frame.setSize(500,300);
		frame.setVisible(true);
	}
}
