package 배열심화;

public class 배열깊은복사점수변경 {

	public static void main(String[] args) {
//		응용문제
//		------
//		1학기 수학 점수: 100, 88, 96
//		2학기 수학 점수는 첫 학생만 100점에서 99점으로 변경
//
//		두 학기의 점수를 프린트!
		
		int[] term1 = {100, 88, 96};
		int[] term2 = term1.clone();
		term2[0] = 99;
		
		System.out.print("term1: ");
		for (int a : term1) {
			System.out.print(a + " ");
		}
		System.out.println("\n==============");
		
		System.out.print("term2: ");
		for (int b : term2) {
			System.out.print(b + " ");
		}
	}

}
