import java.util.Scanner;

class JaggedPattern {
    int emptyspaces;
    int[][] jaggedarr;
    JaggedPattern(int size){
        jaggedarr = new int[size][];
        printDesign(jaggedarr);
        }
    void printDesign(int[][] jaggedarray)
    {   
        for(int i=0;i<jaggedarray.length;i++){
            jaggedarr[i] = new int[i+1];
            for(int k=1;k<jaggedarray.length;k++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                jaggedarr[i][j] = (j+1);
                System.out.print(jaggedarray[i][j]);    
            }
            System.out.println();
        }
        for(int i=0;i<jaggedarray.length;i++){
            for(int k = jaggedarray.length -1;k>i;k--){
                System.out.print(" ");
            }
            for(int j = 0 ; j<=i ; j++ ){
                System.out.print(jaggedarray[i][j]);
            }
            System.out.println();
        }
    }
}
public class PrintJaggedPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int size = scan.nextInt();
        System.out.println("The jagged array pattern for this input is: ");
        new JaggedPattern(size);
        scan.close();
    }

}
