import java.util.Scanner;

public class EmployeePay {
    static double calcPay(double hours, double basepay){
        double pay = 0;
        if(basepay < 8){
            System.err.println();
        }
        if(hours > 60){
            System.err.println();
        }
        else if (hours <= 60 && hours > 40){
            pay = (hours-40) * (basepay*1.5) + (40 * basepay);
        }
        else if (hours <= 40){
            pay = hours * basepay;
        }
        return pay;
    }
    public static void main(String[] args) {
        System.out.println("Enter amount of hours worked: ");
        Scanner scan = new Scanner(System.in);
        int hours = scan.nextInt();
        System.out.println("Enter basepay: ");
        double basepay = scan.nextDouble();
        scan.close();
        double payment = calcPay(hours, basepay);
        System.out.print("Payment for this employee is : " + payment);
    }
    
}
