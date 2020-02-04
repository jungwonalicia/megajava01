package 스태틱;

public class Mouse {
	String color;
	String company;
	int price;
	
	//입력을 한번에!
	public Mouse(String color, String company, int price) {
		this.color = color;
		this.company = company;
		this.price = price;
	}

	//출력을 한번에!
	@Override
	public String toString() {
		return "Mouse [color=" + color + ", company=" + company + ", price=" + price + "]";
	}
	
	
	
	
}
