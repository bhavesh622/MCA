import java.net.*;
import java.io.*;

class EmpClient{
    private Socket socket = null;
    private BufferedReader input = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    public EmpClient(String address, int port){
        try{
            socket = new Socket(address,port);
            System.out.println("Conncted with server");
            input = new BufferedReader(new InputStreamReader(System.in));
            out = new DataOutputStream(socket.getOutputStream());
            in = new DataInputStream(socket.getInputStream());
        }catch(Exception e){
            System.out.println("Exception in EmpClient found "+e.getMessage());
        }

        String id = "";
        try{
            System.out.println("Enter employee id: ");
            id = input.readLine();
            out.writeUTF(id);
        }catch(Exception e){
            System.out.println("Exception in EmpClient user read value "+e.getMessage());
        }

        String empInfo = "";
        try{
            empInfo = in.readUTF();
            System.out.println(empInfo);
        }catch(Exception e){
            System.out.println("Exception found in EmpClient empinfo "+e.getMessage());
        }
        try{
            in.close();
            out.close();
            input.close();
            socket.close();
        }catch(Exception e){
            System.out.println("Exception found in EmpClient closing "+e.getMessage());
        }
    }

    public static void main(String[] args){
        EmpClient client = new EmpClient("localhost",5000);
    }
}
