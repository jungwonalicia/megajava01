package 네트워크;

import java.net.Socket;

public class TCPClient2 {

	public static void main(String[] args) throws Exception {
		Socket socket = new Socket("localhost", 9100);
		System.out.println("TCP client-2 전화함.");
		
	}

}
