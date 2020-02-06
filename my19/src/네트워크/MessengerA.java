package 네트워크;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class MessengerA extends JFrame{
	private JTextField input;
	private JTextArea list;
	DatagramSocket socket; //전역범위
	//변수가 생성되는 위치가 사용할 수 있는 범위
	//변수를 선언할 때 변수가 생성!
	//변수의 선언의 위치가 사용할 수 있는 범위
	
	public MessengerA() throws Exception{
		socket = new DatagramSocket(5000); //수신용 전화기
		
		setTitle("메신저 A");
		
		list = new JTextArea();
		list.setEditable(false);
		list.setColumns(10);
		list.setRows(10);
		list.setFont(new Font("Monospaced", Font.BOLD, 30));
		list.setBackground(Color.GREEN);
		getContentPane().add(list, BorderLayout.CENTER);
		
		input = new JTextField();
		input.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//1.입력한 값을 가지고 온다.
				String str = input.getText();
				//** 전송용 전화기와 
				//   수신용 전화기를 따로 따로 만들어주어야함.
				try {
					DatagramSocket socket = new DatagramSocket();
					InetAddress ip = InetAddress.getByName("127.0.0.1");
					int port = 6000; //상대방 포트
					byte[] data = str.getBytes();
					DatagramPacket packet = new DatagramPacket(data, data.length, ip, port);
					list.append("나>> " + str + "\n");
					input.setText("");
					socket.send(packet);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				//2.패킷을 만들어서 전송
				//	2-1.byte배열로 바꾸어준다.
				//	2-2.패킷에 들어갈 ip와 포트를 지정
				//	2-3.소켓으로 패킷을 보낸다.
				//3.소켓을 close.
			}
		});
		input.setFont(new Font("굴림", Font.BOLD, 30));
		input.setBackground(Color.YELLOW);
		getContentPane().add(input, BorderLayout.SOUTH);
		input.setColumns(10);
		pack();
		setVisible(true);
	}
	
	public void process() throws Exception {
		while (true) {
			byte[] data = new byte[256];
			DatagramPacket packet = new DatagramPacket(data, data.length);
			socket.receive(packet);
			String str = new String(data);
			list.append("너>> " + str + "\n");
		}
	}
	
	public static void main(String[] args) throws Exception {
		MessengerA m = new MessengerA();
		m.process();
	}

}
