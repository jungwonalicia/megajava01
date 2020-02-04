package 계산기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cal {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField result;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(394, 402);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\limjw\\my07\\cal.png"));
		lblNewLabel.setBounds(111, 21, 134, 76);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1: ");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1.setBounds(40, 120, 75, 32);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel label = new JLabel("숫자2: ");
		label.setFont(new Font("굴림", Font.BOLD, 20));
		label.setBounds(40, 172, 75, 32);
		f.getContentPane().add(label);
		
		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(111, 118, 194, 42);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(111, 170, 194, 42);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("더하기");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1. t1과 t2의 입력값을 가지고 온다.
				String t11 = t1.getText();
				String t22 = t2.getText();
				
				//2. t1과 t2의 타입을 계산해주기위해서 int로 변환
				int t111 = Integer.parseInt(t11);
				int t222 = Integer.parseInt(t22);
				
				//3. 두 수를 더한다.
				int t = t111 + t222;
				
				//4. 더 한 결과를 result에 넣어준다.
				//   결과값: 300
				String s = String.valueOf(t);
				result.setText(s);
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 17));
		btnNewButton.setBounds(18, 245, 83, 47);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("빼 기");
		button.setFont(new Font("굴림", Font.BOLD, 17));
		button.setBackground(Color.GREEN);
		button.setBounds(107, 245, 83, 47);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("곱하기");
		button_1.setFont(new Font("굴림", Font.BOLD, 17));
		button_1.setBackground(Color.GREEN);
		button_1.setBounds(195, 245, 83, 47);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("나누기");
		button_2.setFont(new Font("굴림", Font.BOLD, 17));
		button_2.setBackground(Color.GREEN);
		button_2.setBounds(283, 245, 83, 47);
		f.getContentPane().add(button_2);
		
		JLabel label_1 = new JLabel("결과화면: ");
		label_1.setFont(new Font("굴림", Font.BOLD, 20));
		label_1.setBounds(40, 305, 116, 32);
		f.getContentPane().add(label_1);
		
		result = new JTextField();
		result.setBackground(SystemColor.inactiveCaption);
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setColumns(10);
		result.setBounds(145, 302, 206, 42);
		f.getContentPane().add(result);
		f.setVisible(true);
	}
}
