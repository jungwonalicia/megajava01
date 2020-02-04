package 배열응용;

import javax.swing.JOptionPane;

public class 여러번스트링입력계산 {

	public static void main(String[] args) {
//		우리 가족의 나이를 JoptionPane으로 
//		입력받아서, 평균 나이를 구해보세요.
//		55 50 27 15
		String[] ages = new String[4];
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			ages[i] = JOptionPane.showInputDialog("나이 입력");
			sum = sum + Integer.parseInt(ages[i]);
		}	
		System.out.println("우리 가족 나이의 평균은 " + sum/ages.length);
	}
}
