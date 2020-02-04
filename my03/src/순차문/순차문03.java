package 순차문;

import javax.swing.JOptionPane;

public class 순차문03 {

	public static void main(String[] args) {
		//입력
		String data1 =JOptionPane.showInputDialog("숫자 입력1");
		String data2 =JOptionPane.showInputDialog("숫자 입력2");
		int n1 = Integer.parseInt(data1);
		int n2 = Integer.parseInt(data2);
		
		//처리
		int result = n1 + n2;
		
		//출력
		System.out.println(n1 + " + " + n2 + " = " + result);
	} //main end.
} //class end.



