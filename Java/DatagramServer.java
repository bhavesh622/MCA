import java.util.Date;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat; 
class FP3Server{
   public static int clientPort=3902;
   public static int buffer_size =1024;
   public static byte buffer[] =new byte[buffer_size];
   public static DatagramSocket ds ;
    public static void main(String[] args) throws Exception{
      System.out.println("Server Started");
      ds = new DatagramSocket(clientPort);
      while(true){
         DatagramPacket p = new DatagramPacket(buffer, buffer.length); 
         ds.receive(p); 
         String datepattern=new String(p.getData(), 0, p.getLength());
         if(datepattern=="close"){
            System.exit(0);
         }
         try {
            DateFormat dateFormat = new SimpleDateFormat(datepattern);
            Date date = new Date();
            println(dateFormat.format(date));
         } catch (Exception e) {
            Date date = new Date();
            println(date);
         }
      }  
    }
     public static void println(Object line){
        System.out.println(line);
     }
}