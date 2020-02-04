package 배열응용;

public class 배열값더하기2 {

	public static void main(String[] args) {
		String[] num2 = {"11", "22", "33"};
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum = sum + Integer.parseInt(num2[i]);
		}
		System.out.println("배열의 합은 " + sum);
		
	}

}
