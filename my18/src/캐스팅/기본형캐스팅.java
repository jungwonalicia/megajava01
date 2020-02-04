package 캐스팅;

public class 기본형캐스팅 {

	public static void main(String[] args) {
		byte a = 100; //1바이트
		int b = 120; //4바이트
		b = a; //큰<-작 : 큰것으로 자동 변환해서 들어간다.
					//int<-byte(자동형변환)
		//형변환 = 캐스팅(casting)
		
		a = (byte)b; //작<-큰 : 작은것으로 강제 변환해서 들어간다.
					//byte<-int(강제형변환)
		
	}

}
