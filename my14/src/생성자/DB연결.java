package 생성자;

public class DB연결 {

	public static void main(String[] args) throws Exception {
		//1. 커넥터 설정 ok..
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넥터 설정 성공...!!");
	}
}
