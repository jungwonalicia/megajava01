package 조건문;

import java.util.Random;

public class 아무거나2 {

	public static void main(String[] args) {
		// 아무거나 내게 하는 class
		// 랜덤(Random) 
		Random	r = new Random();
		int computer = r.nextInt(3); //0~2
		System.out.println("computer: " + computer);
		//0이면, computer는 가위를 냄.
		//1이면, computer는 바위를 냄.
		//2이면, computer는 보를 냄.
		switch (computer) {
		case 0:
			System.out.println("computer는 가위를 냄.");
			break;
		case 1:
			System.out.println("computer는 바위를 냄.");
			break;
		default:
			System.out.println("computer는 보를 냄.");
			break;
		}
	}
}







