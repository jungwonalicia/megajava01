package 윈도우;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 메뉴판 {
	//도너츠의 개수
	static int count = 10;

	public static void main(String[] args) {
		//큰 프레임을 만들어야 함.
		JFrame f = new JFrame();
		
		//프레임의 크기를 결정해야함.
		f.setSize(415, 298);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("D:\\limjw\\my06\\do.png"));
		f.getContentPane().add(label, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("-");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null, "도너츠 빼기");
				if (count != 0) {
					count--;
					System.out.println("도너츠의 개수는 " + count + "개");
					f.setTitle("도너츠의 개수: " + count + "개");
				} else {
					f.setTitle("더이상 뺄 수 없음");
				}
			}
		});
		btnNewButton.setBackground(Color.GREEN);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(btnNewButton, BorderLayout.WEST);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JOptionPane.showMessageDialog(null, "도너츠 더하기");
				count++;
				System.out.println("도너츠의 개수는 " + count + "개");
				f.setTitle("도너츠의 개수: " + count + "개");
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 50));
		btnNewButton_1.setBackground(Color.MAGENTA);
		f.getContentPane().add(btnNewButton_1, BorderLayout.EAST);
		
		//프레임을 보여지게 설정해야함.
		f.setVisible(true);
	}

}
