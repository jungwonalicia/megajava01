package 스태틱;

public class Worker {
	String name;
	String gender;
	int age;
	static int sum; //0으로 초기화
	static int count; //0으로 초기화
	
	public Worker(String name, String gender, int age) {
		count++; //직원수 count
		sum = sum + age; //직원 나이 누적
		
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	//static메소드는 객체생성하지 않아도
	//클래스 이름으로 접근해서 사용 가능
	public static int avg() {
		return sum/count;
	}
	
	
}
