package 클래스복습;

public class Member {
	String id;
	String pw;
	String name;
	String tel;
	String add;
	String post;
	String age;
	String email;
	
	@Override
	public String toString() {
		return "회원가입 정보 [id=" + id + ", pw=" + pw + ", name=" + name + ", tel=" + tel + ", add=" + add + ", post=" + post
				+ ", age=" + age + ", email=" + email + "]";
	}
	
}
