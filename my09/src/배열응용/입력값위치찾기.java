package 배열응용;

import java.util.Scanner;

public class 입력값위치찾기 {

	public static void main(String[] args) {
//		배열값: 66, 33, 22, 11, 99
		int[] num = {66, 33, 22, 11, 99};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값: ");
		
		int input = sc.nextInt();
		
		for (int i = 0; i < num.length; i++) {
			if(num[i] == input) {
				System.out.println("위치는 " + (i + 1) + "번째 입니다.");
			}
		}
//		입력값: 66
//		위치는 1번째 입니다.
//
//		입력값: 11
//		위치는 4번째 입니다.

	}

}
