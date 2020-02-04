package 배열응용;

import java.util.Scanner;

public class 극장예매시스템 {

	public static void main(String[] args) {
		// 좌석의 예매 상황을 저장할 변수 10개=>배열!
		int[] seat = new int[10];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while (true) {
			System.out.println("--------------------");
			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + " ");
			}
			System.out.println();
			System.out.println("--------------------");
			System.out.print("원하는 좌석 번호(종료 -1)>> ");
			int choice = sc.nextInt();
			
			// 1. -1을 누른 경우
			if (choice == -1) {
				System.out.println("예약 프로그램을 종료합니다.");
				System.out.println("당신은 " + count + "자리 예매했습니다.");
				System.out.println("당신의 결제금액은 " + (count * 10000) + "원입니다.");
				System.exit(0); // 프로그램 종료
			}
			// 2. 다른 번호를 선택한 경우
			// 좌석번호 0번을 선택!
			// 이미 그 자리가 예매가 된 상황이라면
			// (그 자리의 값이 1인경우)
			// 예매할 수 없음 처리!
			if (seat[choice] == 1) {
				System.out.println("이미 예매된 자리입니다.");
				System.out.println("다른 자리를 선택해주세요.");
			} else {
				seat[choice] = 1; // 예매처리
				count++;
				System.out.println("예매가 완료되었습니다.");
			}
			System.out.println();
		}
	}
}
