package 배열심화;

public class 배열복사 {

	public static void main(String[] args) {
		// x는 1,2,3이 들어있는 주소가 들어있음.
		int[] x = { 1, 2, 3 };
		// 주소가 복사
		// 주소가 들어있는 변수: 참조형변수
		// 복사할 때 원본이 복사되지 않아서
		// 하나의 데이터를 두 변수가 공유하고 있는 모양!
		// 얕은 복사 => 원본이 훼손되는 복사
		// 배열의 복사는 깊은 복사를 해야한다.
		// 깊은 복사는 원본의 데이터를 복사!!
		int[] y = x;

		System.out.println(x);
		System.out.println(y);
		System.out.print("x: ");
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.print("y: ");
		for (int b : y) {
			System.out.print(b + " ");
		}
		System.out.println("\n----------");
		
		x[2] = 5;
		
		System.out.print("x: ");
		for (int a : x) {
			System.out.print(a + " ");
		}
		System.out.println();

		System.out.print("y: ");
		for (int b : y) {
			System.out.print(b + " ");
		}
		System.out.println("\n----------");
		
		
		
		
		
		
		
		
		

	}
}
