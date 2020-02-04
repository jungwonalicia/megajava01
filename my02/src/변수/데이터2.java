package 변수;

public class 데이터2 {

	public static void main(String[] args) {
		// 컴퓨터거 인식하는 데이터는 무엇인가?
		// 기본 데이터
		// 숫자(정수, 실수), 1글자(문자), 맞는지여부(논리)
		// 변수 선언! => ram에 저장공간이 만들어진다.!
		int year;
		// 변수 대입! => 변수에 값을 넣는다.!
		year = 2020;		
		
		int age = 100; // =(등호) : 저장공간(변수)에 값을 넣는 것.
		double eye = 0.7;
		//int eye2 = 4.5; //안됨
		
		char sn = '1'; //문자 1글자
		boolean coffee = true; //false(거짓)
		System.out.println("내 나이는 " + age + "세");
		
		
		//모든 연산은 cpu가 한다.
		System.out.println(age + 1);
		int nextAge = age + 1;
		System.out.println("내 내년 나이는 " + nextAge);
		
		
		
		
		
		
		
		

	}

}
