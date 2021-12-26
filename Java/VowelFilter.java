public class VowelFilter {
    static char[] filterVowel(char[] origarray){
        int j = 0;
        int counter = 0;
        for(int i = 0; i< origarray.length; i++){
            if(origarray[i]=='a'||origarray[i]=='e'||origarray[i]=='i'||origarray[i]=='o'||origarray[i]=='u')
            counter++;
            }
        char[] nonvowels = new char[(origarray.length-counter)];
        for(int i = 0; i < origarray.length; i++){
            if(origarray[i]=='a'||origarray[i]=='e'||origarray[i]=='i'||origarray[i]=='o'||origarray[i]=='u');
            else{
                nonvowels[j] = origarray[i];
                j++;
            }
        }
        return nonvowels;
    }
    static void printArray(char[] arr){
        for(int i = 0; i<arr.length; i++ ){
            System.out.print(" " + arr[i]);
        }
    }
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'a', 'd'};
        char[] filteredarr = filterVowel(arr);
        System.out.println("Original Array is :");
        printArray(arr);
        System.out.println( "\n Vowel filtered Array is :");
        printArray(filteredarr);
    }
}
