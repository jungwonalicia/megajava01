package 상속;

public class 멀티스레드2 {

	public static void main(String[] args) {
		Star star = new Star();
		Name name = new Name();
		star.start();
		name.start();		
	}

}
