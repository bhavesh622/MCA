import java.util.Comparator;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

class Students implements Comparable<Students>{
	private String name;
	private int roll_no;
	public int compareTo(Students s){
		return this.roll_no - s.roll_no;
    }
	public Students(String n,int r){  
		this.name = n;
        this.roll_no = r;
    }
    public String getName() {  
		return name; 
	}
    public int getRoll() {  
		return roll_no;  
	}
}
class Name implements Comparator<Students>{

	public int compare(Students m1, Students m2){
		return m1.getName().compareTo(m2.getName());
	}
}
public class StudentCompare{
    public static void main(String[] args){

		ArrayList<Students> list = new ArrayList<Students>();
		Scanner scan=new Scanner(System.in);
		int roll;
		String studname;
		System.out.println("Enter number of students");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++){
			System.out.println("Enter the name of student "+i);
			studname=scan.next();
			System.out.println("Enter the roll no.");
			roll=scan.nextInt();
			list.add(new Students(studname,roll));
		}
		Collections.sort(list);
		System.out.println("Sorting Students roll number wise: ");
		for (Students s1: list){
			System.out.println(s1.getName() + " " +s1.getRoll());
		}
		System.out.println("\nSorted by name");
		Name name1 = new Name();
		Collections.sort(list,name1);
		for (Students s2: list)
		System.out.println(s2.getName() + " "+s2.getRoll());
        scan.close();
	}
}