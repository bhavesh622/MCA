interface GeoAnalyzer{
    double pi = 3.14;
    double area(double x,double y);
    double perimeter(double x,double y);
}

class circle implements GeoAnalyzer{
    public double area(double x,double y){
        return(pi*x*x);
    }
    public double perimeter(double x,double y){
        return(pi*2*x);
    }
}

class rectangle implements GeoAnalyzer{
    public double area(double x,double y){
        return(x*y);
    }
    public double perimeter(double x,double y){
        return(2*y*x);
    }
}
class ellipse implements GeoAnalyzer{
    public double area(double x,double y){
        return(pi*x*y);
    }

    public double perimeter(double x, double y){
        return 0;
    }
}

public class Geometry {
    public static void main(String arg[]){
        rectangle r = new rectangle();
        circle c = new circle();
        ellipse e=new ellipse();
        GeoAnalyzer a;

        a = r;
        System.out.println("\nArea of Rectangle is : " +a.area(10,20));

        a = c;
        System.out.println("\nArea of Circle is : " +a.area(15,15));
        
        a = e;
        System.out.println("\nArea of Ellipse is : "+ a.area(10, 5)); 
    }
}
