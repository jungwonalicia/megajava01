package 배열심화;

public class 배열깊은복사 {

	public static void main(String[] args) {
		int[] x = {1, 2, 3};
		int[] y = x.clone(); //깊은 복사
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
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
		
		
		
	}

}
