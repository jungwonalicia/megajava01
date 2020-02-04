package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnect {

	public static void main(String[] args) throws Exception {
		//1.커넥터 설정
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. 커넧터 설정 성공....");
		
		//2.DB연결
		String url = "jdbc:mysql://localhost:3309/shoes";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공....");
		
		//3.SQL문을 만든다.
		String sql = "insert into member values ('summer','summer','summer','summer')";
		//URL url = new URL("http://www.naver.com");
		PreparedStatement ps = con.prepareStatement(sql);
		System.out.println("3. SQL문 만들기 성공....");
		
		//4.SQL문을 mySQL프로그램에 전송.
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공....");
		
	}

}
