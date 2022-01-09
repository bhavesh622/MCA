public class JaggedPattern {
    int emptyspaces;
    int[][] jaggedarr;
    JaggedPattern(int size){
        jaggedarr = new int[size][];
        for(int i=0;i<size;i++){
            for(int j = 0; j<(size/2); j++){
                jaggedarr[i] = new int[]{j};
            }
        }
    }
}
