package 실무클래스;

import java.util.HashSet;

public class 회사직원 {

	public static void main(String[] args) {
		//중복된 데이터를 자동으로 체크해주는 자료의 형태: set
		HashSet work = new HashSet();
		work.add("디자이너");
		work.add("프로그래머");
		work.add("DB관리자");
		System.out.println(work);
		work.add("디자이너");
		System.out.println(work);
		
	}

}
