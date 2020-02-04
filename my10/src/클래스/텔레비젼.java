package 클래스;

public class 텔레비젼 {
	//부품의 특징으로 가지고 부품을 만들어야 한다.
	//성질: 모양, 크기, 회사, 가격, 색, ---
	//=>변수로 만든다.(멤버변수)
	//동작: 채널바꾸다, 볼륨바꾸다, 끄다, 켜다, ---
	//=>멤버메소드(함수)
	String shape;
	int size;
	
	public void changeCh() {
		//changeCh()명령어를 쳤을 때 
		//처리하고 싶은 내용을 여기에 쭉 적으면 된다.
		System.out.println("TV 채널을 바꾸다.");
	}
	
	public void off() {
		System.out.println("TV를 끄다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
