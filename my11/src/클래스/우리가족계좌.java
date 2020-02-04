package 클래스;

public class 우리가족계좌 {

	public static void main(String[] args) {
		Bank father = new Bank();
		father.name = "홍길동";
		father.account = "튼튼적금";
		father.money = 1000;
		System.out.println(father);
		
		//System.out.println(father.name);
		
		Bank mother = new Bank();
		mother.name = "박길동";
		mother.account = "튼튼예금";
		mother.money = 2000;
		System.out.println(mother);
		
		Bank girl = new Bank();
		girl.name = "홍기사";
		girl.account = "다음적금";
		girl.money = 3000;
		System.out.println(girl);
	}

}
