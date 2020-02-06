package 네트워크;

import java.net.Socket;

public class TCPClient3 {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 9100);
		System.out.println("TCP client-3 전화함.");
		
	}

}
