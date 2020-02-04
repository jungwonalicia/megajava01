package 상속;

public class Employee {
	//접근제어자
	//public->protected->default->private
	public String name; //아무데서나 사용 가능
	//기본제어자 => 같은 패키지!
	String address; //같은 패키지 내에서만 사용 가능
				//상속이라는 패키지 내에서만 사용 가능
	protected int salary; //같은+다른 패키지(상속)
	private int rrn; //이 클래스내에서만 사용 가능
	
}
