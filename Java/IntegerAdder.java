public class IntegerAdder {
    public static void main(String[] args) {
        System.out.println("First Integer- " + Integer.parseInt(args[0]));
        System.out.println("Second Integer- " + Integer.parseInt(args[1]));
        System.out.println("Third Integer- " + Integer.parseInt(args[2]));
        System.out.println("Fourth Integer- " + Integer.parseInt(args[3]));
        System.out.println("Fifth Integer- " + Integer.parseInt(args[4]));
        IntAdd.intAddition(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]));
    }
}

class IntAdd {
    static void intAddition(int u,int w,int x,int y,int z) {
        int sum= u + w + x + y + z;
        System.out.println("Sum of integers inputted is: " + sum);
    }
}