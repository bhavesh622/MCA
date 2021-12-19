public class Target {
    public static void main(String[] args) {
        int nums[] = {1,7,7,2,9,11};
        int target = 9;
        boolean fl= false;
        for (int i=0; i<=nums.length-1; i++){
            if(fl){
                break;
            }
            for (int j = i+1; j<=nums.length-1;j++){
                if(nums[i]+nums[j]== target){
                    System.out.println("["+i+","+j+"]");
                    fl=true;
                    break;}}

                }
            }
        }
    
