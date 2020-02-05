package 네트워크;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpTest {

	public static void main(String[] args) throws Exception {
		String dns = "localhost";
		InetAddress add = InetAddress.getByName(dns);
		System.out.println(add);
		System.out.println(add.getHostAddress());
		
		
	}

}
