package 순차문;

import java.util.Scanner;

public class 음식점 {

	public static void main(String[] args) {
		// 콘솔에서 입력받을 수 있는 부품(class)을 복사해왔음.
		Scanner sc = new Scanner(System.in);

		System.out.print("음식점 계산 총 금액: ");
		int money = sc.nextInt();
		
		System.out.print("함께 먹은 사람 인원수: ");
		int count = sc.nextInt();
		
		double result = money / (double)count;
		//타입을 바꾸는 것=> casting(캐스팅)
		
		System.out.println("--------------------");
		System.out.print("각자 내야할 돈: " + (int)result + "원");
		
	}
}



