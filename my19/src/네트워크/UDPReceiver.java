package 네트워크;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		DatagramSocket socket = new DatagramSocket(7000);
		System.out.println("받는 쪽 소켓 시작함.");
		System.out.println("받을 준비 끝.");
		byte[] data = new byte[256];
		DatagramPacket packet = new DatagramPacket(data, data.length);
		//받을 준비를 하고 있다가 받아주는 메소드
		socket.receive(packet);
		String str = new String(data);
		System.out.println("받은 데이터: " + str);
		socket.close();
	}
}
