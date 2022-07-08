import java.net.InetAddress;
public class HostAddr{
	public static void main(String[] args) throws Exception{
		InetAddress address = InetAddress.getLocalHost();
		System.out.println("Local HostAddress: "+ address.getHostAddress());
		System.out.println("Local host name: "+ address.getHostName());
	}
}
