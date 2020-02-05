package 인터페이스;

public class RedCar implements Car {

	@Override
	public void 출발하다() {
		System.out.println("빨리 출발하다.");
	}

	@Override
	public void 멈추다() {
		System.out.println("멈추고 싶을 때 멈추다.");
	}

}
