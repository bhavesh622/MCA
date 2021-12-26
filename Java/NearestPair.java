public class NearestPair {
    public static double calcDist( double x1, double x2, double y1, double y2){
        return Math.sqrt(Math.pow(y1- x1, 2) + Math.pow(y2 - x2,2));
    }
    public static void main(String[] args) {
        double[][] coordinates = {  {1,2.5}, {2.5,6}, {1.5,5}, {1.5,3},{1.25,6} };
        double x1 = 0 , y1 = 0, x2 = 0 , y2 = 0;
        double min = calcDist(coordinates[0][0], coordinates[0][1],coordinates[1][0], coordinates[1][1]);
        for(int i = 2; i < coordinates.length; i++){
            for(int j = i+1; j <coordinates.length; j++){
                if(calcDist(coordinates[i][0],coordinates[i][1], coordinates[j][0], coordinates[j][1]) < min){
                    min = calcDist(coordinates[i][0],coordinates[i][1], coordinates[j][0], coordinates[j][1]);
                    x1 = coordinates[i][0];
                    y1 = coordinates[i][1];
                    x2 = coordinates[j][0];
                    y2 = coordinates[j][1];
                }
            }
        }
        System.out.println("The closest pair of points are " + " (" + x1 + ", " + y1 + ") "+ " and " + " ("+ x2 + ", " + y2 + ")");
    }
}
