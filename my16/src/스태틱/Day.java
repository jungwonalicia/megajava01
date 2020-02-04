package 스태틱;

public class Day {
	//new를 할 때 객체 생성시, 멤버변수가 복사되는
	//ram의 영역은 heap영역
	//heap 영역은 크기만 맞으면 아무데나 만들어 쓸 수 있다.
	//new를 할 때 heap영역에 복사되는 변수는 다이나믹 복사!
	String doing; //String은 null로 초기화!!
	int time;
	String location;
	static int count; //멤버변수는 자동으로 초기화를 시켜줌.
				//int는 0으로 초기화!!
	static int sum; //시간 누적용
	
	public Day(String doing, int time, String location) {
		sum = sum + time;
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", location=" + location + "]";
	}
	
	public void play() {
		System.out.println("매일 매일 놀다.");
	}
	
	
	
	
}
