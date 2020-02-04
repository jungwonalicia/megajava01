package 메뉴판;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FoodMenu {
	static int 짜장 = 0; 
	// 선언!의 위치가 변수를 사용할 수 있는 범위
	// 클래스 전체영역에서 쓸 수 있는 변수: 전역변수
	static int 우동 = 0; // 주문수 카운트
	static int 짬뽕 = 0; // 주문수 카운트
	static int count = 0; // 주문수 카운트
	static int sum = 0; // 전체 금액 계산
	private static JTextField t2;
	private static JTextField t1;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		//지역변수
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("지불할 총 금액");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel.setBounds(29, 416, 204, 35);
		f.getContentPane().add(lblNewLabel);

		t2 = new JTextField();
		t2.setForeground(Color.RED);
		t2.setFont(new Font("궁서", Font.BOLD, 30));
		t2.setBounds(223, 416, 249, 35);
		f.getContentPane().add(t2);
		t2.setColumns(10);

		t1 = new JTextField();
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("궁서", Font.BOLD, 30));
		t1.setColumns(10);
		t1.setBounds(321, 10, 151, 35);
		f.getContentPane().add(t1);

		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\limjw\\my07\\짜장.gif"));
		img.setBounds(29, 122, 425, 272);
		f.getContentPane().add(img);

		JLabel j = new JLabel("");
		JLabel w = new JLabel("");
		JLabel ja = new JLabel("");

		JButton btnNewButton = new JButton("짜장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				짜장++;
				j.setText(짜장 + "개");
			}
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 21));
		btnNewButton.setBounds(12, 10, 97, 35);
		f.getContentPane().add(btnNewButton);

		JButton button = new JButton("우동");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				// 우동그림을 img라벨에 icon으로 집어 넣어야 함.
				ImageIcon icon = new ImageIcon("우동.png");
				img.setIcon(icon);
				우동++;
			}
		});
		button.setBackground(Color.YELLOW);
		button.setFont(new Font("굴림", Font.BOLD, 21));
		button.setBounds(121, 13, 97, 35);
		f.getContentPane().add(button);

		JButton button_1 = new JButton("짬뽕");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; // 증감연산자
				t1.setText(count + "개");
				sum = count * 5000;
				t2.setText(sum + "원");
				짬뽕++;
			}
		});
		button_1.setBackground(Color.PINK);
		button_1.setFont(new Font("굴림", Font.BOLD, 21));
		button_1.setBounds(223, 10, 97, 35);
		f.getContentPane().add(button_1);

		j.setBounds(29, 55, 67, 15);
		f.getContentPane().add(j);

		w.setBounds(131, 58, 87, 12);
		f.getContentPane().add(w);

		ja.setBounds(233, 55, 87, 15);
		f.getContentPane().add(ja);
		f.setVisible(true);
	}

}
