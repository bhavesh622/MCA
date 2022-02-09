import java.util.Scanner; 
import java.util.InputMismatchException;

class ExceptionPOC{ 
    public static int excepthrows() throws InputMismatchException{ 
        int num=0; 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number between 1 to 10:"); 
        num=sc.nextInt(); 
        return num;
       }
    public static int excepthrow(){ 
        int num=0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("In throw:"); 
        System.out.println("Enter a number between 1 to 10:");
        boolean b =sc.hasNextInt();
        System.out.println(b);
        if (!b){
            sc.close();
            throw new InputMismatchException();
        } 
        num=sc.nextInt();
        sc.close(); 
        return num;
       }     
    public static void main(String[] args){  
        try{ 
            System.out.println("Excep using throws:\n"+ excepthrows());
            System.out.println("Excep using throw:\n" + excepthrow()); 
        }
        catch(Exception e){ 
            e.printStackTrace(); 
            System.out.println(e);   
        } 
 } 
}