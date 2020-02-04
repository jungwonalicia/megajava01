package 배열심화;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼500개만들기2 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		//붙이는 순서대로 뒤에 붙여주는 class
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow); 
		
		JButton[] buttons = new JButton[500];
		
		for (int i = 0; i < 500; i++) {
			buttons[i] = new JButton("자리" + i);
			f.add(buttons[i]);
			//인터페이스로 이벤트처리할 예정!
			//4주차에 할 내용
		}
		f.setVisible(true);
	}
}






