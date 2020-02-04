package 배열응용;

public class 배열최대값찾기 {

	public static void main(String[] args) {
		int[] num = {90, 80, 20, 60, 70};
		
		int max = num[0]; //첫번째 값을 넣어둔다.
							//현재 max = 90
		for (int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
				//90 80 20 60 70
			//max:90 90 90 90 90 
			}
		}
		System.out.println("최소값은 " + max);
	}
	
	
	
	
	

}
