package 상속;

public class Name extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.print("홍길동");
		}
	}
}
