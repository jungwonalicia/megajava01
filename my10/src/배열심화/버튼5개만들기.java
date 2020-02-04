package 배열심화;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼5개만들기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		//붙이는 순서대로 뒤에 붙여주는 class
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); 
		JButton b1 = new JButton("자리1");
		JButton b2 = new JButton("자리2");
		JButton b3 = new JButton("자리3");
		JButton b4 = new JButton("자리4");
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		
		
		f.setVisible(true);
	}
}






