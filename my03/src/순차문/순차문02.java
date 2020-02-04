package 순차문;

import javax.swing.JOptionPane;

public class 순차문02 {

	public static void main(String[] args) {
		String data 
			= JOptionPane.showInputDialog("현재 온도는");
		//모든 외부 입력은 타입이 String!
		//String을 그대로 쓸지 숫자로 변환해서 쓸지는 
		//프로그래머가 결정!!!
		//String-->int 변환!!
		int now = Integer.parseInt(data);
		
		//처리
		int back = now - 1;
		
		//출력
		System.out.println("집에 갈 때의 온도는 " + back + "도");

	}

}



