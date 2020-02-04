package 상속;

public class 멀티스레드 {

	public static void main(String[] args) {
		Plus p = new Plus();
		Minus m = new Minus();
		p.start();
		m.start();
	}

}
