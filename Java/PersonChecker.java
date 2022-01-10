import java.util.Scanner;

import PersonPackage.Person;

public class PersonChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Person's First Name: ");
        String first = scan.next();
        System.out.println("Input Person's Last Name: ");
        String last = scan.next();
        Person p1 = new Person(first, last);
        p1.displayFirstName();
        p1.displayLastName();
        scan.close();
    }
    
}


