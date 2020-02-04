package 배열;

public class 배열연습3 {

	public static void main(String[] args) {
		int[] num = new int[10];
		//각 int변수 내에 0으로 초기값이 다 들어가 있다.
//		num[0] = 0;
//		num[1] = 1;
//		num[2] = 2;
		//전체 개수를 구해봅시다.
		System.out.println(num.length);
		//이클립스에서는 for문을 자동완성할 때
		//바로 위에 있는 배열을 기준으로 만들어준다.
		for (int i = 0; i < num.length; i++) {
			num[i] = i;
		//  num[0] = 0
		//  num[1] = 1
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
		
		
		
		
		
		
		
		
		
		
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}
}
