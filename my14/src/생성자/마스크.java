package 생성자;

public class 마스크 {
	String color;
	int price;
	
	//입력값을 한꺼번에 넣고 싶을 때
	//생성자!를 이용!!
	//클래스이름과 동일
	//반환타입의 유무를 쓰지 않음.
	//=>무조건 void!!!
	//new를 할 때마다 자동으로 호출됨(사용됨)
	public 마스크(String c, int p) {
		color = c;
		price = p;
	}

	@Override
	public String toString() {
		return "마스크 [color=" + color + ", price=" + price + "]";
	}
	
	
}




