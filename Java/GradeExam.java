public class GradeExam {
    static void calcResults(char[][] arr,char[] ans){
        char[][] submissions = arr;
        char[] key = ans;
        int[] results = new int[arr.length];
        for(int i = 0; i < submissions.length; i++){
            for(int j = 0; j< submissions[i].length; j++){
                if(submissions[i][j] == key[j]){
                    results[i]++;
                }
            }
        }
        for(int i = 0; i< results.length; i++){
            System.out.println("Student " + i + " scored " + results[i]);
        }
    }
    public static void main(String[] args) {
        char[][] subs = {{'D', 'C', 'C', 'C', 'C', 'D', 'D', 'C', 'B', 'D'}, {'A', 'C', 'B', 'B', 'B', 'E', 'B', 'A', 'B', 'A'}, {'C', 'D', 'B', 'D', 'D', 'B', 'B', 'E', 'B', 'C'}, 
        {'E', 'A', 'A', 'B', 'A', 'D', 'E', 'B', 'E', 'D'}, {'D', 'C', 'B', 'E', 'A', 'B', 'B', 'E', 'B', 'C'}, {'D', 'D', 'E', 'B', 'C', 'B', 'E', 'D', 'C', 'D'}, {'C', 'A', 'D', 'B', 'B', 'B', 'B', 'B', 'E', 'D'},
        {'E', 'E', 'B', 'D', 'D', 'A', 'A', 'C', 'B', 'B'}, {'C', 'E', 'B', 'B', 'D', 'D', 'C', 'A', 'C', 'D'}, {'C', 'B', 'B', 'B', 'A', 'A', 'C', 'B', 'D', 'A'}};
        char[] ans = {'A', 'C', 'C', 'C', 'C', 'D', 'D', 'C', 'B', 'D'};
        System.out.println("Results for the class: ");
        calcResults(subs, ans);

    }


    
}
