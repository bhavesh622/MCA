import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
public class CalcClient {
	public static void main(String[] args) throws IOException{
		InetAddress ip = InetAddress.getLocalHost();
		int port = 4444;
		Scanner sc = new Scanner(System.in);
		//Step1: open the socket connection.
		Socket s = new Socket(ip,port);
		//step 2: communication - get the input and output stream
	    DataInputStream dis = new DataInputStream(s.getInputStream());
	    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
	    while(true){
	    	System.out.println("Enter the equation in the form");
	    	System.out.println("operand1 operation operand1");
	    	String inp = sc.nextLine();
	    	if(inp.equals("bye"))
	    		break;
	    	dos.writeUTF(inp);
	    	String ans = dis.readUTF();
	    	System.out.println("Answer : "+ ans);
	    		
	    }
	}
}
