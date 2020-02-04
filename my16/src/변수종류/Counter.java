package 변수종류;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	static int count; //전역변수(global)
				//멤버변수는 모두 전역변수
				//전역변수는 자동으로 초기화!
	
	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터");
		//f는 지역변수(local)
		//지역변수는 자동 초기화를 안해줌.
		//지역변수는 프로그래머가 초기화를 해주어야함.
		
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(363, 280);
		f.getContentPane().setLayout(null);
		
		JLabel result = new JLabel("0");
		//result는 지역변수
		//프로그램은 순차적으로 실행
		//아래의 객체들은 위에서 인식 불가
		
		
		
		JButton btnNewButton = new JButton("1더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				result.setText(count + "");
				
			}
		});
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 17));
		btnNewButton.setBounds(12, 35, 107, 37);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("0초기화");
		button.setFont(new Font("굴림", Font.BOLD, 17));
		button.setBackground(Color.PINK);
		button.setBounds(131, 35, 107, 37);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("1빼기");
		button_1.setFont(new Font("굴림", Font.BOLD, 17));
		button_1.setBackground(Color.CYAN);
		button_1.setBounds(247, 35, 88, 37);
		f.getContentPane().add(button_1);
		
	
		result.setForeground(Color.RED);
		result.setFont(new Font("궁서", Font.BOLD, 99));
		result.setBounds(132, 96, 153, 123);
		f.getContentPane().add(result);
		f.setVisible(true);
	}
}
