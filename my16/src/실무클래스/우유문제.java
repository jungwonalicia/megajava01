package 실무클래스;

import java.util.LinkedList;

public class 우유문제 {

	public static void main(String[] args) {
		
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		System.out.println(milk);
		milk.remove();
		System.out.println(milk);
	}
}
