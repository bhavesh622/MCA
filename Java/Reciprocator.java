import java.util.Scanner;

public class Reciprocator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scan.nextInt();
        scan.close();
        float recipsum = 0;
        for(int i=1 ; i<=n ; i++){
            recipsum += 1f/i;
            if(i==n){
                System.out.print("1/" + i );
            }
            else{
                System.out.print("1/" + i + " + ");
            }
        }
        System.out.println('\n' + "Sum of the series is :" + recipsum);
        }
    }
    
