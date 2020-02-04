package 스태틱;

public class Tv사용 {

	public static void main(String[] args) {
		Tv t1 = new Tv("검정", 100);
		System.out.println(Tv.count);
		
		Tv t2 = new Tv("빨강", 50);
		System.out.println(Tv.count);
		
		System.out.println(t1);
		System.out.println(t2);
		
	}

}
