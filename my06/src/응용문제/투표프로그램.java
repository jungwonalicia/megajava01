package 응용문제;

import java.util.Scanner;

public class 투표프로그램 {

	public static void main(String[] args) {

		System.out.println("5번 투표 기회가 있음.");
		System.out.println("--------------------");
		System.out.println("1)아이유 2)유재석 3)공유");
		System.out.println("--------------------");
		Scanner sc = new Scanner(System.in);
		int iu = 0;
		int you = 0;
		int gong = 0;
		
		for (int i = 0; i < 5; i++) {
			System.out.print("당신의 선택은>> ");
			int choice = sc.nextInt();
			//choice의 값에 따라서 다르게 처리
			//조건문(if, switch)
			switch (choice) {
			case 1:
				iu++;
				break;
			case 2:
				you++;
				break;
			case 3:
				gong++;
				break;
			default:
				System.out.println("1,2,3만 투표 가능합니다.");
				break;
			}//switch
		}//for
		
		System.out.println("--------------");
		System.out.println("아이유: " + iu + "표");
		System.out.println("유재석: " + you + "표");
		System.out.println("공유: " + gong + "표");
		
	}

}
