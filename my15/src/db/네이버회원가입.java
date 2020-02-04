package db;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 네이버회원가입 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 네이버 회원가입");
		f.getContentPane().setBackground(Color.GREEN);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\limjw\\my15\\naver.png"));
		lblNewLabel.setBounds(122, 26, 240, 75);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ID");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 40));
		lblNewLabel_1.setBounds(46, 120, 72, 43);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPw = new JLabel("PW");
		lblPw.setFont(new Font("굴림", Font.BOLD, 40));
		lblPw.setBounds(46, 173, 72, 43);
		f.getContentPane().add(lblPw);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("굴림", Font.BOLD, 40));
		lblName.setBounds(46, 230, 149, 43);
		f.getContentPane().add(lblName);
		
		JLabel lblTel = new JLabel("TEL");
		lblTel.setFont(new Font("굴림", Font.BOLD, 40));
		lblTel.setBounds(46, 283, 100, 43);
		f.getContentPane().add(lblTel);
		
		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setForeground(Color.BLUE);
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(194, 124, 216, 39);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setHorizontalAlignment(SwingConstants.CENTER);
		t2.setForeground(Color.BLUE);
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(194, 177, 216, 39);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setHorizontalAlignment(SwingConstants.CENTER);
		t3.setForeground(Color.BLUE);
		t3.setFont(new Font("굴림", Font.BOLD, 30));
		t3.setColumns(10);
		t3.setBounds(194, 230, 216, 39);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		t4.setForeground(Color.BLUE);
		t4.setFont(new Font("굴림", Font.BOLD, 30));
		t4.setColumns(10);
		t4.setBounds(194, 283, 216, 39);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("회원가입완료");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				//입력한 값 가지고 와야 함.
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				
				//db처리 4단계
				try {
					//1.커넥터 설정
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. 커넧터 설정 성공....");
					
					//2.DB연결
					String url = "jdbc:mysql://localhost:3309/shoes?useUnicode=true&characterEncoding=utf8"; 
					String user = "root";
					String password = "1234";
					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("2. DB연결 성공....");
					
					//3.SQL문을 만든다.
					String sql = "insert into member values (?,?,?,?)";
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
		});
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(70, 337, 328, 52);
		f.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("회원탈퇴처리");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = t1.getText();
				//db처리 4단계
				try {
					//1.커넥터 설정
					Class.forName("com.mysql.jdbc.Driver");
					System.out.println("1. 커넧터 설정 성공....");
					
					//2.DB연결
					String url = "jdbc:mysql://localhost:3309/shoes?useUnicode=true&characterEncoding=utf8"; 
					String user = "root";
					String password = "1234";
					Connection con = DriverManager.getConnection(url, user, password);
					System.out.println("2. DB연결 성공....");
					
					//3.SQL문을 만든다.
					String sql = "delete from member where id = ?";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, id);
					
					System.out.println("3. SQL문 만들기 성공....");
					
					//4.SQL문을 mySQL프로그램에 전송.
					ps.executeUpdate();
					System.out.println("4. SQL문 전송 성공....");
				} catch (Exception e1) {
					e1.printStackTrace();
				} 
				
			}
		});
		button.setFont(new Font("굴림", Font.BOLD, 20));
		button.setBackground(Color.CYAN);
		button.setBounds(70, 399, 328, 52);
		f.getContentPane().add(button);
		f.setVisible(true);
	}
}
