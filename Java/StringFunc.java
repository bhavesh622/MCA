import java.util.Scanner;

public class StringFunc {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string of at least 8 letters: " );
		String str = scan.nextLine();
		//charAt()
	    System.out.println("Character at position 6 of the string entered is : "+str.charAt(5));
	
	    //length()
	    System.out.println("Length of the string : "+str.length() );
	    System.out.println();

        //contains()
        System.out.println("Enter a string or character to check if its contained in the String: ");
        String str1= scan.nextLine();
        boolean res = str.contains(str1);
        System.out.println("Entered character/string contained in string: "+res);
	   
	    //indexOf()
	    System.out.println();
	    System.out.println("Enter a character/string to check the index of: ");
	    String str2 = scan.nextLine();
		scan.close();
		System.out.println("\n(First) Index of " +str2+ " is " + str.indexOf(str2));
		scan.close();

	    //toUpperCase()
        System.out.println("\nGiven string in all upper case: "+str.toUpperCase());
        System.out.println();
	   
	    //split()
        System.out.println("Splitting the string in separate words: ");
        String [] strArray = str.split(" ");
        for(int i =0; i< strArray.length;i++)
            System.out.println( "Word "+(i+1)+" :"+ strArray[i]);
        System.out.println();
		 
        //equals() and ==
        String s1= new String ("HelloByebye");   
        String s2= new String ("HelloByebye");
        System.out.println(" s1 = "+s1);
        System.out.println(" s2 = "+s2 +"\n");
        System.out.println("Is s1 == s2 ");
        if(s1==s2){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
        System.out.println("Is s1.equals(s2)");
        if(s1.equals(s2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
    

