package 실무클래스;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		//순서를 가지는 데이터의 형태 : list
		ArrayList list = new ArrayList();
		list.add("홍길동");
		list.add(100);
		list.add(11.22);
		list.add(false);
		list.add('남');
		System.out.println(list.size() + "개");
		System.out.println(list);
		list.remove(3); //false
		System.out.println(list.size() + "개");
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
