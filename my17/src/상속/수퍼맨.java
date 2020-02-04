package 상속;

public class 수퍼맨 extends 맨{
	//멤버변수: 3개
	//멤버멤소드: 4개
	public void 날아다니다() {
		System.out.println("우주를 날아다니다.");
	}

	@Override
	public String toString() {
		return "수퍼맨 [power=" + power + ", gender=" + gender + ", name=" + name + "]";
	}
	
	
}
