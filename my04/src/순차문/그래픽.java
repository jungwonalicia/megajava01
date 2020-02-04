package 순차문;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Font;

public class 그래픽 {

	public static void main(String[] args) {
		//그래픽 부품(class) 사용해서 화면을 띄워봅시다!
		JFrame f = new JFrame();
		f.setSize(800, 800);
		
		JButton b = new JButton();
		b.setForeground(Color.YELLOW);
		b.setFont(new Font("HY엽서M", Font.BOLD, 62));
		b.setBackground(Color.GREEN);
		b.setText("나를 눌러요..!!!!!꾹꾹!!!!");
		
		f.getContentPane().add(b);
		//프레임에 b라는 버튼을 올려줘!
		
		f.setVisible(true); //맨 아래에 있어야 함.
		
	}

}
