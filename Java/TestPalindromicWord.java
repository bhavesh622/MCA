import java.util.Scanner;

public class TestPalindromicWord {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Input string to check for palindrome: ");
    String pal= scan.next();
    System.out.println(PalindromeChecker.isPalindrome(pal));
    scan.close();
    }
};

class PalindromeChecker{
    static String isPalindrome(String s){
        if(s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())){
            return("\""+ s + "\"" +" is a palindrome");
        }
        else{
            return("\""+ s + "\"" +" is not a palindrome");
        }
    }
}