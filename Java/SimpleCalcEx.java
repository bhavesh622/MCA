import java.util.Scanner;
class InvalidNumeralException extends Exception{
    public InvalidNumeralException(){
        super();

    }
}
class SimpleCalcEx{
    public static int addition(int a, int b){
        try{
            if(a>10 || b>10) {
                throw new InvalidNumeralException();
            }
            return a+b;
        }catch(InvalidNumeralException e){
            System.out.println("Exception occured = ");
            e.printStackTrace();
            return 0;
        }
    }
    public static int subtraction(int a, int b){
        try{
            if(a>10 || b>10){
                throw new InvalidNumeralException();
            }
            return a-b;
        }catch(InvalidNumeralException e){
            System.out.println("Exception occured = ");
            e.printStackTrace();
            return 0;
        }
    }
    public static int multiplication(int a, int b){
        return a*b;
    }
    public static int division(int a, int b){
        return a/b;
    }
    public static int remainder(int a, int b)
    {
        return a%b;
    }
    public static void main(String[] args){
        int number=0;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("0. Exit");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("Enter your choice:");
            boolean b = sc.hasNextInt();
            if(b){
                number = sc.nextInt();

                if(number == 0){
                    break;
                }
                else if(number == 1){
                    System.out.println("Adding char 'a' with 5"); 
                    System.out.println(addition('a',5));
                }
                else if(number == 2){
                    System.out.println("Subtracting 4 from 9");
                    System.out.println(subtraction(9,4));
                }
                else if(number == 3){
                    System.out.println("Multiplying 5 with 8");
                    System.out.println(multiplication(8,5));
                }
                else if(number == 4){
                    System.out.println("Dividing 8 by 2");
                    System.out.println(division(8,2));
                }
                else if(number == 5){
                    System.out.println("Getting remainder of dividing 9 by 4");
                    System.out.println(remainder(9,4));
                }
                else{
                    System.out.println("Enter Valid Input");
                }
            }
            else{
                System.out.println("Enter Valid Number");
            }
            sc.nextLine();
        }while(number!=0);
        sc.close();
    }
}
