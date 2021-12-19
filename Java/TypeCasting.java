import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n_int = scan.nextInt();
        System.out.println("Enter a double:");
        double n_double = scan.nextDouble();
        System.out.println("Enter a float:");
        float n_float = scan.nextFloat();
        scan.close();

        System.out.println((byte) n_int + " is the value when integer is converted to byte");
        System.out.println((int) n_double + " is the value when double is converted to int");
        System.out.println((byte) n_double + " is the value when double is converted to byte");
        System.out.println((char) n_int + " is the value when int is converted to char");
        System.out.println((short) n_float + " is the value when float is converted to short");
    }
    
}