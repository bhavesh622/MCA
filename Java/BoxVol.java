import java.util.Scanner;

class Box {
    double h,w,l;
    Box(double height, double width, double length){
        h= height;
        w=width;
        l=length;
    }
    double calcVol(double x, double y, double z){
        return x*y*z;
    }
    double calcVol(){
        return h*w*l;
    }
}

public class BoxVol{
    public static void main(String[] args) {
        double h1,w1,l1, h2,w2,l2 ;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the height, width and length one by one.");
        h1 = scan.nextDouble();
        w1 = scan.nextDouble();
        l1 = scan.nextDouble();
        Box b1 = new Box(h1,w1,l1);
        System.out.println("Now enter new dimensions for the second box.");
        h2 = scan.nextDouble();
        w2 = scan.nextDouble();
        l2 = scan.nextDouble();
        scan.close();
        Box b2 = new Box(h2,w2,l2);
        System.out.println("Sides of the first box :" + "Height: " + h1 + " , Width: " + w1 + ", Length: " + l1 + ", Volume of box: " + b1.calcVol(h1, w1, l1) + " units.");
        System.out.println("Sides of the first box :" + "Height: " + h1 + " , Width: " + w1 + ", Length: " + l1 + ", Volume of box without parameters: " + b1.calcVol() + " units.");
        System.out.println("Sides of the second box :" + "Height: " + h2 + " , Width: " + w2 + ", Length: " + l2 + ", Volume of box: " + b2.calcVol(h2, w2, l2) + " units.");
        System.out.println("Sides of the second box :" + "Height: " + h2 + " , Width: " + w2 + ", Length: " + l2 + ", Volume of box without parameters: " + b2.calcVol() + " units.");
    }
}

