import java.util.Scanner;

class Electronics {
    static class Television{
        int cost; String brand;
        Television(int cost, String brand){
            this.cost = cost;
            this.brand = brand;
        }
        int costInstance(){
            return this.cost;
        }
        static int costStatic(Television tv){
            return tv.cost;
        }
    }   
}
public class ElectronicsChecker{
    public static void main(String[] args) {
        System.out.println("Enter Tv Price: ");
        Scanner scan = new Scanner(System.in);
        int price = scan.nextInt();
        Electronics.Television tv1 = new Electronics.Television(price, "Samsung");
        System.out.println("Non Static Method Price:  "+tv1.costInstance());
        System.out.println("Static Method Price: "+ Electronics.Television.costStatic(tv1));
        scan.close();
    }
}