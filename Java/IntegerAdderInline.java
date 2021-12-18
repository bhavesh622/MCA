public class IntegerAdderInline {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        System.out.println("First Integer- " + a);
        System.out.println("Second Integer- " + b);
        System.out.println("Third Integer- " + c);
        System.out.println("Fourth Integer- " + d);
        System.out.println("Fifth Integer- " + e);
        intAddition(a, b, c, d, e);
    }
    static void intAddition(int u,int w,int x,int y,int z) {
        int sum= u + w + x + y + z;
        System.out.println("Sum of integers inputted is: " + sum);
    }
}
