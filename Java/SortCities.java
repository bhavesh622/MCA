import java.util.Arrays;

public class SortCities {
    public static void citySort(String[] cities){
        boolean valid =true;
        for(String i :cities){
            if(i.equals("Kolkata")||i.equals("Chennai")||i.equals("Mumbai")||i.equals("Delhi")||i.equals("Bangalore")||i.equals("Ahmedabad"));
            else    {   
                System.err.println(i + " is not a valid input. Please enter valid city names.");
                valid = false;
                break;
            }
        }
        if(valid){
            Arrays.sort(cities);
            System.out.println("Cities in Sorted order: ");
            for(String j : cities){
                System.out.print(j + " ");
            }
        }                
    }
    public static void main(String[] args) {
        citySort(args);
    }
}
    

