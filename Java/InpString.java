import java.io.*;
class InpString{

    public void readVowelsConsonentsAndSpaces(String s){
        BufferedWriter bw = null;
        BufferedReader br = null;
        String s1=null;
        char ch=' ';
        int con=0;
        int vowels=0, letters=0, spaces=0;
        try{
            bw = new BufferedWriter(new FileWriter(new File("test.txt")));
            for(int i=0;i<s.length();i++){
                con=(int)s.charAt(i);
                bw.write(con);
            }
            bw.close();
        }catch(Exception e){
            System.out.println("Exception found = "+e);
        }

        try{
            br = new BufferedReader(new FileReader("test.txt"));
            while((s1=br.readLine())!=null){
                for(int i=0;i<s1.length();i++){
                    ch=s1.charAt(i);
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                        vowels++;
                        letters++;
                    }
                    else if(ch==' '){
                        spaces++;
                    }
                    else{
                        letters++;
                    }
                }
                System.out.println("Vowels-"+vowels);
                System.out.println("Consonents-"+(letters-vowels));
                System.out.println("Spaces-"+spaces);
                System.out.println("--------------------------------------------------------");
                vowels=0;
                letters=0;
                spaces=0;
            }
            br.close();
        }catch(Exception e){
            System.out.println("Exception found = "+e);
        }
    }

    public static void main(String[] args){
        InpString sc = new InpString();
        String s="Hi this is java"+"\n"+"I like studying it";
        sc.readVowelsConsonentsAndSpaces(s);
    }
}
