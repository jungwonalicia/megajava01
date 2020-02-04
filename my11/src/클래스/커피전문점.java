package 클래스;

public class 커피전문점 {

	public static void main(String[] args) {
		계산기 cal = new 계산기();
		int result = cal.add(2000, 3800);
		cal.minus(result);

		int result2 = cal.multi(3000, 4);
		// =>곱한값 반환받아와서
		// result2변수에 저장

		cal.div(result2, 4);
		// =>1명당 얼마를 내야하나 출력되게 처리
	}

}
