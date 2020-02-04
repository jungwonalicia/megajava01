package 조건문;

import java.util.Date;

public class 요일처리 {

	public static void main(String[] args) {
		
		Date date = new Date();
		int day = date.getDay();
		
		if (day == 0) {
			System.out.println("일요일은 쉬어요.");
		} else if (day == 1) {
			System.out.println("월요일은 쉬어요.");
			
		} else if (day == 2) {
			System.out.println("화요일은 쉬어요.");
			
		} else if (day == 3) {
			System.out.println("수요일은 쉬어요.");
			
		} else if (day == 4) {
			System.out.println("목요일은 쉬어요.");
			
		} else if (day == 5) {
			System.out.println("금요일은 쉬어요.");
			
		} else {
			System.out.println("토요일은 쉬어요.");			
		}
	}//main end
}//class end
