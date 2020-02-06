package 네트워크;

import java.net.Socket;

public class TCPClient1 {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 9100);
		System.out.println("TCP client-1 전화함.");
		
	}

}
