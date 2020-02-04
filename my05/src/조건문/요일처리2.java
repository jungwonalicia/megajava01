package 조건문;

import java.util.Date;

public class 요일처리2 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int day = date.getDay();
		
		//switch문은 간단하지만 
		//수동으로 break해주어야 한다.
		
		switch(day) {//실수가 올 수 없음.
		case 0:
			System.out.println("일"); break;
		case 1:
			System.out.println("월"); break;
		case 2:
			System.out.println("화"); break;
		case 3:
			System.out.println("수"); break;
		case 4:
			System.out.println("목"); break;
		case 5:
			System.out.println("금"); break;
		case 6:
			System.out.println("토"); break;
		}
		
		
		
		
		
		
	}//main end
}//class end
