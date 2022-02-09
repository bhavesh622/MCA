import java.util.Scanner;

public class StudentRegCheck {
    static void detailsChecker(int age, int marks) throws InvalidDetailException {
            if(age<12 && marks<200) {
                throw new InvalidDetailException("The Student is not eligible for registration");
            }
            else {
                System.out.println("The Student is eligible for the registration");
            }
        }
        public static void main(String args[]){
            Scanner scan = new Scanner(System.in);
            int age, marks;
            System.out.println("Input details to check for registration eligibility. ");
            System.out.println("Input Student Age: ");
            age = scan.nextInt();
            System.out.println("Input Student Marks: ");
            marks = scan.nextInt();
            detailsChecker(age, marks);
            scan.close();
        }
};

class InvalidDetailException extends ArithmeticException{
    public InvalidDetailException(String s)
    {
        super(s);
    }
}