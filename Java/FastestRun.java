public class FastestRun {
    static String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane"};
    static int[] times = new int[]{341,273,278,329,445,402,388,275,243,334,412};
    
    int[] calcfastest() {
        int fastest,secondfastest;
        fastest = secondfastest = times.length - 1;
        for(int i = 0; i< times.length; i++){
            if(times[i] < times[fastest] && times[i] < times[secondfastest]){
                secondfastest = fastest;
                fastest = i;
            }
            else if(times[i] < secondfastest){
                secondfastest = i;
            }
        }
            int[] arr = new int[2];
            arr[0] = fastest;
            arr[1] = secondfastest;
            return arr;
    };
    public static void main(String[] args) {
        FastestRun runtimes = new FastestRun();
        int[] runs = runtimes.calcfastest();
        System.out.println("Fastest time is: " + times[runs[0]] + " by " +  names[runs[0]] +  ", Second fastest : " + times[runs[1]] + " by " + names[runs[1]]);
    }
}



