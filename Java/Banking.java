import java.util.Scanner;
interface Account {
    public void OpenAcc();
    public void CloseAcc();
    public void Withdraw();
    public void Deposit();
    public void Transfer();
}
class CurrentAcc implements Account {
    String name;
    int acc_no;
    double balance = 0.0;
    Scanner input = new Scanner(System.in);
    public void OpenAcc() {
        System.out.print("Enter ID: ");
        acc_no = input.nextInt();
        System.out.print("Enter Name: ");
        name = input.next();
        System.out.print("Enter balance: ");
        balance = input.nextDouble();
        if (balance <= 2000) {
            balance = 0.0;
            System.out.println("Please deposit minimum of Rs. 2000");
            System.out.print("Enter balance: ");
            balance = input.nextDouble();
        }
    }
    public void CloseAcc() {
        int AccID;
        System.out.print("Enter Account ID: ");
        AccID = input.nextInt();
        if (AccID == acc_no) {
            System.out.println("Account has been deleted");
        } else {
            System.out.println("Account not found");
        }
    }
    public void Withdraw() {
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = input.nextDouble();
        if (amount < balance) {
            balance = balance - amount;
            System.out.println("Your current balance is: " + balance);
        } else {
            System.out.println("Insufficient Balance!!");
        }
    }
    public void Deposit() {
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = input.nextDouble();
        balance = balance + amount;
        System.out.println("Your Current Balance is: " + balance);
    }
    public void Transfer() {
        double amount;
        System.out.print("Enter the amount to be transferred: ");
        amount = input.nextDouble();
        if (amount > balance) {
            System.out.println("Insufficient Balance!!");
        } else {
            balance = balance - amount;
            System.out.println("Amount has been transferred");
        }
    }
}
class SavingsAcc implements Account {
    String name;
    int acc_no;
    int time;
    double balance = 0.0;
    double interest = 5;
    Scanner input = new Scanner(System.in);
    public void OpenAcc() {
        System.out.print("Enter ID: ");
        acc_no = input.nextInt();
        System.out.print("Enter Name: ");
        name = input.next();
        System.out.print("Enter balance: ");
        balance = input.nextDouble();
        System.out.print("Enter time: ");
        time = input.nextInt();
    }
    public void CloseAcc() {
        int AccID;
        System.out.print("Enter Account ID: ");
        AccID = input.nextInt();
        if (AccID == acc_no) {
            System.out.println("Account has been deleted");
        } else {
            System.out.println("Account not found");
        }
    }
    public void Withdraw() {
        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = input.nextDouble();
        if (amount < balance) {
            balance = balance - amount;
            System.out.println("Your current balance is: " + balance);
        } else {
            System.out.println("Insufficient Balance!!");
        }
    }
    public void Deposit() {
        double amount;
        System.out.print("Enter amount to deposit: ");
        amount = input.nextDouble();
        balance = balance + amount;
        if (time > 2) {
            balance = balance + ((balance * 5) / 100);
        }
        System.out.println("Your Current Balance is: " + balance);
    }
    public void Transfer() {
        double amount;
        System.out.print("Enter the amount to be transferred: ");
        amount = input.nextDouble();
        input.close();
        if (amount > balance) {
            System.out.println("Insufficient Balance!!");
        } else {
            balance = balance - amount;
            System.out.println("Amount has been transferred");
        }
    }
}
public class Banking {
    public static void main(String args[]) {
        int choice, ch;
        CurrentAcc objCurr = new CurrentAcc();
        SavingsAcc objSav = new SavingsAcc();
        Scanner input = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("1- Open Current Account");
            System.out.println("2- Open Savings Account");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println();
                        System.out.println("1- Open Account");
                        System.out.println("2- Close Account");
                        System.out.println("3- Withdraw Amount");
                        System.out.println("4- Deposit Amount");
                        System.out.println("5- Transfer Amount");
                        System.out.print("Enter your choice: ");
                        ch = input.nextInt();
                        switch (ch) {
                            case 1:
                                objCurr.OpenAcc();
                                break;
                            case 2:
                                objCurr.CloseAcc();
                                break;
                            case 3:
                                objCurr.Withdraw();
                                break;
                            case 4:
                                objCurr.Deposit();
                                break;
                            case 5:
                                objCurr.Transfer();
                                break;
                            default:
                                System.out.println("Invalid Choice!!");
                                System.exit(0);
                                break;
                        }
                    } while (ch > 0 || ch < 6);
                case 2:
                    do {
                        System.out.println();
                        System.out.println("1- Open Account");
                        System.out.println("2- Close Account");
                        System.out.println("3- Withdraw Amount");
                        System.out.println("4- Deposit Amount");
                        System.out.println("5- Transfer Amount");
                        System.out.print("Enter your choice: ");
                        ch = input.nextInt();
                        switch (ch) {
                            case 1:
                                objSav.OpenAcc();
                                break;
                            case 2:
                                objSav.CloseAcc();
                                break;
                            case 3:
                                objSav.Withdraw();
                                break;
                            case 4:
                                objSav.Deposit();
                                break;
                            case 5:
                                objSav.Transfer();
                                break;
                            default:
                                System.out.println("Invalid Choice!!");
                                System.exit(0);
                                break;
                        }
                    } while (ch > 0 || ch < 6);
                default:
                    System.out.println("Invalid Choice!!");
                    System.exit(0);
                    break;
            }
        } while (choice > 0 || choice < 3);
        input.close();
    }
}
