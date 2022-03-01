import java.io.*;  
import java.net.*;
import java.util.*;  
public class InetAddressTest{  
public static void main(String[] args){  
try{  
InetAddress ip=InetAddress.getByName("www.bvicam.ac.in");    
InetAddress ip1[] = InetAddress.getAllByName("www.bvicam.ac.in");  
byte addr[]={72, 3, 2, 12};  
System.out.println("ip : "+ip);  
System.out.print("\nip1 : "+ip1);  
InetAddress ip2 =  InetAddress.getByAddress(addr);  
            System.out.println("\nip2 : "+ip2);  
System.out.println("\nAddress : " +Arrays.toString(ip.getAddress()));  
System.out.print("\nHost Address : " +ip.getHostAddress());  //instance //methods
System.out.println("Host Name: "+ip.getHostName());  
System.out.print("\n isMulticastAddress : " +ip.isMulticastAddress());  //instance //methods
System.out.print("\n isSiteLocalAddress : " +ip.isSiteLocalAddress());  
System.out.print("\n hashCode : " +ip.hashCode());  
System.out.print("\n Is ip1 == ip2 : " +ip.equals(ip2));  //instance methods
}catch(Exception e){System.out.println(e);}  }  } 
