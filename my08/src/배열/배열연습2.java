package 배열;

public class 배열연습2 {

	public static void main(String[] args) {
		   int[] num = new int[10];
		// int[] : int로 만들어진 배열 타입
		// num : 배열의 주소가 들어있음, 참조형
		// new : 복사
		// new int : int변수를 복사해!
		// new int[10] : int변수를 10개 복사해!
		   
		   System.out.println(num); //주소확인
		   System.out.println(num[0]);
		   System.out.println(num[1]);
		   System.out.println(num[9]);
		   //배열은 변수에 초기값을 넣어준다.
		   //int배열은 모두 다 0으로 초기화를 해준다.
		   
		   num[0] = 5;
		   System.out.println(num[0]);

		   //5번째 위치값을 10으로 넣어서 출력
		   num[4] = 10;
		   System.out.println(num[4]);
		   
		   //10번째 위치값을 20으로 넣어서 출력
		   num[9] = 20;
		   System.out.println(num[9]);
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}
}
