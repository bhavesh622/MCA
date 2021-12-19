import java.util.Scanner;

public class RevWord {
    public static String reversewWord(String s){
        String words[] = s.split("\\s");
        String reverseword="";
        for(String w:words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseword += sb.toString() + " ";

        }
        return reverseword.trim();
    }
    public static void main(String[] args) {
        System.out.println("Enter a sentence");
        Scanner scan = new Scanner(System.in);
        String st = scan.nextLine();
        System.out.println("Reversed sentence: "+ reversewWord(st));
        scan.close();

    }
}
