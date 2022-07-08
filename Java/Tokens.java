import java.util.Scanner;
import java.io.*;
public class Tokens {
    public void searchTok(String para){
        int count=0;
        String st=null;
        try{
            FileWriter fw = new FileWriter("test1.txt");
            fw.write(para);
            fw.close();
        }catch(Exception e){
            System.out.println("Exception found = "+e);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word to search:");
        String word = sc.nextLine();
        try{
            RandomAccessFile access = new RandomAccessFile(new File("test1.txt"),"rw");
            while((st=access.readLine())!=null){
                String st1[] = st.split(" ");
                for(String a:st1){
                    if(a.equals(word)){
                        count++;
                    }
                }
            }
            System.out.println("Total count of word '"+word+"' in string is "+count);
            access.close();
        }catch(Exception e){
            System.out.println("Execption found = "+e);
        }
    }

    public static void main(String[] args){
        String para = "Dwelling and speedily ignorant any steepest. Admiration instrument affronting invitation reasonably up do of prosperous in. Shy saw declared age debating ecstatic man. Call in so want pure rank am dear were. Remarkably to continuing in surrounded diminution on. In unfeeling existence objection immediate repulsive on he in. Imprudence comparison uncommonly me he difficulty diminution resolution. Likewise proposal differed scarcely dwelling as on raillery. September few dependent extremity own continued and ten prevailed attending. Early to weeks we could."+"\n"+"Unpleasant astonished an diminution up partiality. Noisy an their of meant. Death means up civil do an offer wound of. Called square an in afraid direct. Resolution diminution conviction so mr at unpleasing simplicity no. No it as breakfast up conveying earnestly immediate principle. Him son disposed produced humoured overcame she bachelor improved. Studied however out wishing but inhabit fortune windows.";
        Tokens search = new Tokens();
        search.searchTok(para);
    }
}