import java.util.Scanner;
public class GravityCalc {
    static void CalcPos(double gravity, double initialVel, double fallingTime, double initialPosition){

                double result = (0.5*(gravity * Math.pow(fallingTime,2)))+(initialVel*fallingTime)+initialPosition; 
                System.out.println("\nFinal position= "+Math.abs(result)); 
        }
    public static void main(String[] args) {
        double gravity = -9.81;
        double initialVel = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;

        //choice between if-else and switchcase
        System.out.println("Calculate using if-else or switch case? Input 1 for if-else, 2 for switch: ");
        Scanner scan = new Scanner(System.in);
        int choice, choices=0, choicei=0;
        choice = scan.nextInt();
        do{
            if(choice==1){
            
                System.out.println("Using if-else\n");
                System.out.println("0. Exit");
                System.out.println("1. Input initial position.");
                System.out.println("2. Input initial velocity.");
                System.out.println("3. Calculate final Position.");
                choicei = scan.nextInt();
                if(choicei == 0){
                    System.out.println("Exiting.");
                    break;
                }
                else if(choicei == 1){
                    System.out.println("Input initial position "); 
                    initialPosition = scan.nextDouble();
                }
                else if(choicei == 2){
                    System.out.println("Input initial velocity. Default =0");
                    initialVel = scan.nextDouble();
                }
                else if(choicei == 3){
                    System.out.println("Final position of the object: ");
                    CalcPos(gravity,initialVel,fallingTime,initialPosition);                   
                }
                else{
                    System.out.println("Enter Valid Input");
                }
            }
            else if (choice == 2)
            {
                System.out.println("Using Switch case");
                System.out.println("0. Exit");
                System.out.println("1. Input initial position.");
                System.out.println("2. Input initial velocity.");
                System.out.println("3. Calculate final Position.");
                choices = scan.nextInt();
                switch(choices){
                    case 0:
                        System.out.println("Exiting.");
                        break;
                    case 1:
                        System.out.println("Input initial position "); 
                        initialPosition = scan.nextDouble();
                        break;
                    case 2:
                        System.out.println("Input initial velocity. Default =0");
                        initialVel = scan.nextDouble();
                        break;
                    case 3:
                        System.out.println("Final position of the object: ");
                        CalcPos(gravity,initialVel,fallingTime,initialPosition); 
                        break;
                    default:
                        System.out.println("Enter Valid Input");
                        break;
                }
            }
            else{
                System.out.println("Enter valid choice.");
            }
            scan.nextLine();
        }while(choicei!=0 ||choices!=0);
        scan.close();
    }
}
