package 순차문;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {
		// 콘솔에서 입력받을 수 있는 부품(class)을 복사해왔음.
		Scanner sc = new Scanner(System.in);

		System.out.println("<< 여행 정보 >>");
		System.out.println("---------------------");
		System.out.print("- 여행지: ");
		String location = sc.next();
		
		System.out.print("- 경비: ");
		int money = sc.nextInt();
		
		System.out.print("- 할인율: ");
		double sale = sc.nextDouble();
		
		System.out.print("- 실제 경비: ");
		double result = money - money * sale; 
		//자바에서는 연산할 때 하나라도 실수가 들어있으면 
		//무조건 결과가 실수!
		//정수와 정수의 연산의 결과는 무조건 정수!
		System.out.println((int)result + "원");
		System.out.println("---------------------");
		System.out.println("=> 12월 중순에 갔을 때 가격");
	}
	
	
	
	
	
}
