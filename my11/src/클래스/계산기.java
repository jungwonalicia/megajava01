package 클래스;

public class 계산기 {
	//없음 = void
	public int add(int coffee, int green) {
		return coffee + green;
	}
	
	public void minus(int money) {
		boolean vip = true;
		int result = money - 1000;
		System.out.println("당신의 최종 결제금액: " + result);
	}
	
	  public int multi(int money, int count) {
		  return money * count;
	  }
	  
	  public void div(int result, int count) {
		  System.out.println(result / count + "원씩 내면 됨.");
	  }
}




