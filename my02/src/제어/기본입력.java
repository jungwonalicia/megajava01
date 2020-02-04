package 제어;

import javax.swing.JOptionPane;

public class 기본입력 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("당신의 이름은 ");
		System.out.println("당신이 입력한 이름은 " + name); //결합연산자
		
//		프로그램의 흐름은?
//				데이터를 입력---> 처리----> 결과 출력
//
//				1)입력-당신의 소속은? 메가
		String company = JOptionPane.showInputDialog("당신의 소속은");
		
//				2)처리-(메가+스터디)해서 임의의 변수에 저장
		String result = company + "스터디";
		
//				3)출력-2번의 변수 내용을 모니터에 출력
		System.out.println("당신은 " + result + "소속이군요.");
		
		//자동 주석: 컨트롤 + /
		
		
	}

}
