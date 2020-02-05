package 인터페이스;

public class BlueCar implements Car {

	@Override
	public void 출발하다() {
		System.out.println("천천히 출발하다.");
	}

	@Override
	public void 멈추다() {
		System.out.println("정확하게 멈추다.");
	}

}
