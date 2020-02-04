package 클래스;

public class Bank {
	String name;
	String account;
	int money;
	
	public void 예금하다() {
		System.out.println("예금하다.");
	}
	
	public void 출금하다() {
		System.out.println("출금하다.");
	}

	@Override
	public String toString() {
		return "Bank [name=" + name + ", account=" + account + ", money=" + money + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
