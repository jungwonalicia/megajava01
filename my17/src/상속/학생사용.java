package 상속;

public class 학생사용 {

	public static void main(String[] args) {
		초등학생 초등 = new 초등학생();
		중학생 중등 = new 중학생();
		고등학생 고등 = new 고등학생();
		대학생 대학 = new 대학생();
		초등.배우다();
		중등.배우다();
		고등.배우다();
		대학.배우다();
	}

}
