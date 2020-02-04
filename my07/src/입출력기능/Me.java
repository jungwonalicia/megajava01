package 입출력기능;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Me {
	private static JTextField name;
	private static JTextField age;
	private static JTextField shoe;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500); 
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel.setBounds(49, 75, 91, 59);
		f.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("나이");
		label.setFont(new Font("굴림", Font.BOLD, 40));
		label.setBounds(49, 177, 91, 59);
		f.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("신발");
		label_1.setFont(new Font("굴림", Font.BOLD, 40));
		label_1.setBounds(49, 287, 91, 59);
		f.getContentPane().add(label_1);
		
		name = new JTextField();
		name.setBackground(Color.YELLOW);
		name.setFont(new Font("굴림", Font.BOLD, 40));
		name.setBounds(152, 82, 180, 44);
		f.getContentPane().add(name);
		name.setColumns(10);
		
		age = new JTextField();
		age.setFont(new Font("굴림", Font.BOLD, 40));
		age.setColumns(10);
		age.setBackground(Color.YELLOW);
		age.setBounds(152, 187, 180, 44);
		f.getContentPane().add(age);
		
		shoe = new JTextField();
		shoe.setFont(new Font("굴림", Font.BOLD, 40));
		shoe.setColumns(10);
		shoe.setBackground(Color.YELLOW);
		shoe.setBounds(152, 294, 180, 44);
		f.getContentPane().add(shoe);
		
		JButton btnNewButton = new JButton("출력");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String n = name.getText();
				if(n.equals("") || n.equals("다시입력")) {
					name.setText("다시입력");
				}else {
					System.out.println("이름 출력: " + n + "님");
				}
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 40));
		btnNewButton.setBounds(344, 78, 128, 52);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("출력");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = age.getText();
				//내년 나이를 구해서, 나이 출력 아래서 넣어보세요.
				int a2 = Integer.parseInt(a);
				int nextYear = a2 + 1;
				System.out.println("나이 출력: " + a + "세");
				System.out.println("내년 나이: " + nextYear + "세");
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 40));
		button.setBackground(Color.RED);
		button.setBounds(344, 180, 128, 52);
		f.getContentPane().add(button);
		
		JButton button_1 = new JButton("출력");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = shoe.getText();
				System.out.println("신발 사이즈 출력: " + s + "mm");
			}
		});
		button_1.setFont(new Font("굴림", Font.BOLD, 40));
		button_1.setBackground(Color.RED);
		button_1.setBounds(344, 287, 128, 52);
		f.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("모두 출력");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n = name.getText();
				String a = age.getText();
				String s = shoe.getText();
				System.out.println("모두 출력");
				System.out.println("----------");
				System.out.println("이름 출력: " + n + "님");
				System.out.println("나이 출력: " + a + "세");
				System.out.println("신발 사이즈 출력: " + s + "mm");
			}
		});
		button_2.setFont(new Font("굴림", Font.BOLD, 40));
		button_2.setBackground(Color.RED);
		button_2.setBounds(137, 384, 238, 52);
		f.getContentPane().add(button_2);
		//.연산자=> 접근연산자(~에)
		
		
			
		
		f.setVisible(true);
	}
}





