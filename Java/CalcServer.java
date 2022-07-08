import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

public class CalcServer {
	public static void main(String[] args) throws IOException{
		//step 1: Establish the socket connection
		ServerSocket ss = new ServerSocket(4444);
		Socket s = ss.accept();
		//step 2: Processing the request
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		
		while(true){
			//wait for input
			String input = dis.readUTF();
			
			if(input.equals("bye")){
				break;
			}
			System.out.println("Equation Received : "+input);
			int result=0;
			//use StringTokenizer to break the equation into operand and operation
			StringTokenizer  st = new StringTokenizer(input); 
			int operand1 = Integer.parseInt(st.nextToken());
			String operation = st.nextToken();
			int operand2 = Integer.parseInt(st.nextToken());
			//perform the required operation
			if(operation.equals("+")) {
				result = operand1 + operand2;
			}
			else if(operation.equals("-")) {
				result = operand1 - operand2;
			}
			else if(operation.equals("*")) {
				result = operand1 * operand2;
			}
			else if(operation.equals("/")) {
				result = operand1 / operand2;
			}
			System.out.println("Sending the  result");
			//send the result back to the client
			dos.writeUTF(Integer.toString(result));
		}
	}
}
