package 실무클래스;

import java.util.LinkedList;

public class 영화문제 {

	public static void main(String[] args) {
		//대기줄의 형태를 가지는 자료의 형태: queue
		LinkedList movie = new LinkedList();
		movie.add("백두산");
		movie.add("히트맨");
		movie.add("남산의 부장들");
		System.out.println(movie);
		movie.remove();
		System.out.println(movie);
		movie.remove();
		System.out.println(movie);
		movie.remove();
		System.out.println(movie);
	}

}
