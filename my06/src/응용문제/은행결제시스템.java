package 응용문제;

import java.util.Scanner;

public class 은행결제시스템 {

	public static void main(String[] args) {
		// 은행 결제 시스템
		// --------------
		// 1)잔고확인 2)입금 3)출금 4)종료
		System.out.println("은행 결제 시스템");
		System.out.println("--------------");
		System.out.println("1)잔고확인 2)입금 3)출금 4)종료");
		Scanner sc = new Scanner(System.in);
		int money = 10000; //은행에 잔금
		while (true) {
			//조건식에는 반드시 비교연산자를 써준다.
			//비교연산자의 결과는 항상 논리형(true/false)
			System.out.print("선택>> ");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("당신의 잔고는 " + money + "원");
				
			}else if (choice == 2) {
				System.out.print("당신의 입금액은 >> ");
				//입금액 입력
				int input = sc.nextInt();
				//잔고에다가 더해주어야 함.
				money = money + input;
				
			}else if (choice == 3) {
				System.out.print("당신의 출금액은 >> ");
				//출금액 입력
				int input = sc.nextInt();
				//잔고에서 빼주어야 함.
				money = money - input;
				
			}else {
				System.out.println("시스템을 종료합니다.");
				break; //while문을 종료
			}
		}
	}

}



