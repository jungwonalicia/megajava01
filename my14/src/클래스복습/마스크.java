package 클래스복습;

public class 마스크 {
	//멤버변수
	String color;
	int price;
	
	//멤버메소드
	public void make() {
		System.out.println("마스크를 만들다.");
	}

	//마스크로 복사한 변수를 프린트할 때 자동 실행(호출)
	//멤버변수 값을 한번에 간단히 출력하고 싶을 때 사용!
	public String toString() {
		return color + ", "+ price;
	}
	
	
}
