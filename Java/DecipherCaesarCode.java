import java.util.Scanner;

public class DecipherCaesarCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Ciphertext (Mixed case alphabets only): ");
        String ciphertext = scan.next();
        System.out.println("Enter Shift used :");
        int s = scan.nextInt();
        System.out.println("Deciphered string is : " + Caesar.decrypt(ciphertext,s).toUpperCase());
        scan.close();
    }    
}
class Caesar{
    static String encrypt(String message, int shift) {
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<message.length(); i++) {
            if(Character.isUpperCase(message.charAt(i))){
                char c = (char)((message.charAt(i)+shift - 65) % 26 + 65);
                temp.append(c);}
            else{
                char c = (char)((message.charAt(i) + shift  - 97) %26 +97);
                temp.append(c);
            }
        }
        return temp.toString();
    }
    static String decrypt(String message, int shift){
        return encrypt(message,26-shift);};
}

