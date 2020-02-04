package 스태틱;

public class Tv {
	//멤버변수는 new를 할 때마다 메모리에 객체마다 각각 복사된다.
	String color;
	int price;
	static int count;
	
	//생성자
	//멤버변수값 입력을 한번에! 
	public Tv(String color, int price) {
		count++;
		this.color = color;
		this.price = price;
	}
	
	
	//멤버변수에 들어있는 값들 출력을 한번에!
	@Override
	public String toString() {
		return "Tv [color=" + color + ", price=" + price + "]";
	}

}
