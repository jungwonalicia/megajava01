package 순차문;

import javax.swing.JOptionPane;

public class 순차문01 {

	public static void main(String[] args) {
		// 입력--> 처리--> 출력
		//1. 입력: 오늘의 날씨는?
		String data = JOptionPane.showInputDialog("오늘의 날씨는?");
		
		//2. 처리: 비 => 비가 오는 날에는 우산을 챙겨요
		String result = data + "가 오는 날에는 우산을 챙겨요";
		
		//3. 출력
		//sysout 컨트롤+스페이스바(자동완성)
		//System.out.println(result);
		JOptionPane.showMessageDialog(null, result);

	}

}
