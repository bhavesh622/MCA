import java.rmi.Naming;
import java.util.Scanner;

public class CollegeClientRequest {
    public static void main(String[] args) {

        try {
            RMICollege access = (RMICollege) Naming.lookup("rmi://127.0.0.1:1900" + "/BVICAM");
            String rollno;
            String name;
            int choice;

            Scanner sc = new Scanner(System.in);

            do{
                System.out.println("\n1. Enter Details");
                System.out.println("2. Search Details");
                System.out.println("3. Quit!");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter roll no: ");
                        rollno = sc.next();
                        sc.nextLine();
                        System.out.print("Enter Name: ");
                        name = sc.next();
                        access.Admit(Integer.parseInt(rollno), name);
                        System.out.println("Record Saved!");
                        break;
                    case 2:
                        System.out.print("Enter roll no for Search: ");
                        rollno = sc.next();
                        name = access.SearchRecord(Integer.parseInt(rollno));
                        System.out.println("Name: " + name);
                        break;
                    case 3:
                        System.exit(0);
                }
            }while (true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}