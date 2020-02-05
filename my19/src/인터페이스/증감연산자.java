package 인터페이스;

public class 증감연산자 {

	public static void main(String[] args) {
		int x = 5;
		int y = 3;
		int z = x-- + --y;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}
