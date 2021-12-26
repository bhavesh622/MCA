import java.util.Arrays;

public class DuplicateFinder {
    static void duplicates(int[] arr, int n){
        int counter = 0;
        boolean visited[] =  new boolean[n];
        Arrays.fill(visited, false);
        boolean repeated = false;
        for(int i = 0; i < arr.length ; i++){
            counter = 0;
            for(int j = i+1; j < arr.length; j++){
                if (visited[i] == true)
                    continue;
                if(arr[i] == arr[j]){
                    counter++;
                    visited[j] = true;
                    repeated = true;
                }
                if(j == arr.length - 1 && counter != 0){
                    System.out.println(arr[i] + " occurs " + (counter+1)  + " number of times.");
                }
            }
            if (i== arr.length-1 && !repeated){
                System.out.println("No repeated elements found in array." );
            }
        }
    }
    static void printArray(int[] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] duplarray = {1,4,5,13,9,11,24,9,8,9,5,9,10,23,34,66};
        int n = duplarray.length;
        System.out.print("Array elements are = ");
        printArray(duplarray);
        duplicates(duplarray,n);
        
    }
}
