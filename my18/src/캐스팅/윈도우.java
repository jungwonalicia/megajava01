package 캐스팅;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 윈도우 {

	public static void main(String[] args) {
		JFrame	f = new JFrame();
		f.setSize(200, 200);
		
		JButton b = new JButton("나를 눌러요.");
		f.add(b); //button, label, panel,..
		//add(들어올수있는객체:100개 정도)
		
		
		f.setVisible(true);
	}

}
