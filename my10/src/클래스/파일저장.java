package 클래스;

import java.io.FileWriter;
import java.io.IOException;

public class 파일저장 {

	public static void main(String[] args) throws Exception {
		FileWriter f = new FileWriter("test.txt");
		f.write("hello");
		f.close();
	}
}




