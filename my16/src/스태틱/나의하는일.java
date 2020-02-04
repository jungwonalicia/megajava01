package 스태틱;

public class 나의하는일 {

	public static void main(String[] args) {
		Day day1 = new Day("자바공부", 10, "강남");
		System.out.println(Day.count);
		day1.play();
		
		Day day2 = new Day("여행", 15, "강원도");
		System.out.println(Day.count);
		
		Day day3 = new Day("운동", 11, "피트니스");
		System.out.println(Day.count);
		
		System.out.println("전체 시간은 " + Day.sum);
		System.out.println("평균 시간은 " + Day.sum/Day.count);
		//지역변수인 day1은 스택영역 
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		
	}

}
