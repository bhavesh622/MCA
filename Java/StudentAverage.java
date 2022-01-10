import java.util.Scanner;

public class StudentAverage {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of students in the class: ");
        int numStudents = scan.nextInt();
        int[] grades = new int[numStudents];
        int total=0, min =Integer.MAX_VALUE, max= Integer.MIN_VALUE, minStudent=-1, maxStudent= -1; 
        int i = 0;
        while(i <numStudents){
            System.out.println("Enter Grades for student "+ (i+1) +": ");
            grades[i] = scan.nextInt();
            if(grades[i]>=0 && grades[i]<=100){
                total += grades[i];
                if(min > grades[i]){
                    min = grades[i];
                    minStudent = i+1;
                }
                if(max < grades[i]){
                    max = grades[i];
                    maxStudent = i+1;
                }
                i++;
            }
            else{
                System.err.println("Grade should be between 0 to 100. Retry!");
                continue;
            }    
        } 
        scan.close(); 
        double average = (double) total/numStudents;
        System.out.println("Total Marks: "+total);
        System.out.printf("Average Marks= %.2f%n", average);
        System.out.println("Minimum Marks obtained by Student: "+ "\"" + minStudent + "\""+ " = " + min);
        System.out.println("Maximum Marks obtained by Student: "+ "\"" + maxStudent + "\""+ " = " + max);

    }
}
