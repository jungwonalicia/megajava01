package 스태틱;

public class WorkTest {

	public static void main(String[] args) {
		Worker w1 = new Worker("임아무개", "남", 24);
		Worker w2 = new Worker("김아무개", "여", 23);
		Worker w3 = new Worker("박아무개", "남", 25);
		System.out.println("총 직원수: " + Worker.count + "명");
		System.out.println("직원 평균 나이: " + Worker.sum / Worker.count + "세");
		System.out.println(Worker.avg() + "세");
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(w3);
		
		String n1 = "100";
		int n2 = Integer.parseInt(n1);
		System.out.println("내년 나이는 " + (n2 + 1));
		
		
	}

}
