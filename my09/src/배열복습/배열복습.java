package 배열복습;

public class 배열복습 {

	public static void main(String[] args) {
		//배열을 만들때는 
		//내가 값을 이미 알고 있는 경우인지
		String[] tv = {"무한 도전","런닝맨","아침마당"};
		for (int i = 0; i < tv.length; i++) {
			System.out.print(tv[i]  + " ");
		}
		
		System.out.println();
		
		//내가 값을 나중에 넣는 경우인지
		String[] music2 = new String[3];
		music2[0] = "노래1";
		music2[1] = "노래2";
		music2[2] = "노래3";
		
		for (int i = 0; i < music2.length; i++) {
			System.out.print(music2[i] + " ");
		}
	}
	
	
	
	
	
	
	

}
