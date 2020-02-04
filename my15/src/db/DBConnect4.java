package db;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DBConnect4 {

	public static void main(String[] args)  {
		try {
			//1.커넥터 설정
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("1. 커넧터 설정 성공....");
			
			//2.DB연결
			String url = "jdbc:mysql://localhost:3309/shoes";
			String user = "root";
			String password = "1234";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("2. DB연결 성공....");
			
			String id = JOptionPane.showInputDialog("id입력");
			String pw = JOptionPane.showInputDialog("pw입력");
			String name = JOptionPane.showInputDialog("name입력");
			String tel = JOptionPane.showInputDialog("tel입력");
			//3.SQL문을 만든다.
			String sql = "insert into member values (?,?,?,?)";
			//URL url = new URL("http://www.naver.com");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, name);
			ps.setString(4, tel);
			
			System.out.println("3. SQL문 만들기 성공....");
			
			//4.SQL문을 mySQL프로그램에 전송.
			ps.executeUpdate();
			System.out.println("4. SQL문 전송 성공....");
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
	}

}
