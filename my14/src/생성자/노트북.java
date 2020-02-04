package 생성자;

public class 노트북 {
	String company;
	int price;
	
	public 노트북(int p) {
		price = p;
	}
	public 노트북(String c, int p) {
		company = c;
		price = p;
	}
	
	@Override
	public String toString() {
		return "노트북 [company=" + company + ", price=" + price + "]";
	}
	
	
}
