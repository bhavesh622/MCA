import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int [] num = new int[3];
        Scanner scan = new Scanner(System.in);
        System.out.println("Input three numbers one by one");
        num[0] = scan.nextInt();
        num[1] = scan.nextInt();
        num[2] = scan.nextInt();
        scan.close();
        System.out.println("All combinations of the three numbers:");
        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 3 ; j++){
                for (int k = 0; k < 3 ; k++){
                    if(k != j && k != i && j != i)
                    System.out.println(num[i] + "" + num[j] + "" + num[k]);
                }
            }

        }

    }
}
