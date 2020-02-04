package 순차문;

import java.util.Scanner;

public class 콘솔연습 {
	public static void main(String[] args) {
		//1.콘솔에서 입력
		//4000천개 중에서 콘솔에서 입력할 수 있는 기능을
		//가진 부품(class)을 램에 복사해서 사용.
		//복사할 때 사용하는 키워드: new
		Scanner sc = new Scanner(System.in);
		//Scanner라는 class는 
		//이 파일에서 한번 복사하면 계속 반복해서 사용.
		System.out.print("이름을 입력>> ");
		String name = sc.next(); //단어 입력 받는 기능
		
		System.out.print("소속을 입력>> ");
		String company = sc.next();
		
		//2.처리
		
		//3.콘솔(모니터)에 출력
		System.out.println("당신의 이름은 " + name);
		System.out.println("당신의 소속은 " + company);
	}

}
