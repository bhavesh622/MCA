import java.net.*; 
import java.util.Scanner;
class DatagramClient{
   public static int serverPort=3902;
   public static DatagramSocket ds;
    public static void main(String[] args) throws Exception{
        System.out.println("Client has started");
        System.out.println("Enter Date Format: ");
        Scanner scan =new Scanner(System.in);
        while(true){
            ds = new DatagramSocket();
            String str=scan.nextLine();
            if(str=="exit"){
                System.exit(0);
           }
            DatagramPacket p = new DatagramPacket(str.getBytes(),         str.length(),InetAddress.getLocalHost(),serverPort); 
              ds.send(p);     
          }
    }
}


