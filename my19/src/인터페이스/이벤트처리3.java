package 인터페이스;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;

public class 이벤트처리3 extends JFrame{
	JButton b1, b2;//전역변수
	
	public 이벤트처리3() {
		setTitle("이벤트 처리 연습");
		setSize(300, 300);
		b1 = new JButton("나를 눌러요.");
		b1.setFont(new Font("굴림", Font.BOLD, 40));
		getContentPane().add(b1);
		
		b2 = new JButton("나도 눌러요!");
		b2.setFont(new Font("굴림", Font.BOLD, 40));
		getContentPane().add(b2, BorderLayout.SOUTH);
		
		//인터페이스를 구현한 익명클래스의 객체를 생성
		//반드시 원래 구현해주어야만 하는 메소드를 꼭 구현해주어야 한다.
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("더하기 처리. b1을 누름.");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 처리. b2를 누름.");
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		이벤트처리3 이 = new 이벤트처리3();
	}
	

}




