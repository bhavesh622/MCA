import java.util.*;

class PerfectNumberList{
public static boolean isPerfect(int aPosInt){
	int n1=0;
	boolean b=false;
	for(int i=1;i<aPosInt;i++)
	if(aPosInt%i==0)
	{
		n1+=i;
	}
	if(n1==aPosInt)
		b=true;
	return b; 
}

public static boolean isDeficient(int aPosInt){
	int sum = 0; // Initialize sum of prime factors

    // Note that this loop runs till square root of n
    for (int i = 1; i <= (Math.sqrt(aPosInt)); i++) {
		if (aPosInt % i == 0) {
			// If divisors are equal, take only one
            // of them
            if (aPosInt / i == i) {
                sum = sum + i;
            }
            else // Otherwise take both
            {
				sum = sum + i;
                sum = sum + (aPosInt / i);
            }
        }
    }
	return ((sum)<(2 * aPosInt));
}

public static void main(String[] args){
	System.out.print("\nEnter a Upper bound : ");
	Scanner scan = new Scanner(System.in);
	int n= scan.nextInt();
	System.out.print("\nNumbers which are neither perfect not deficient are : ");
	for(int i=1;i<=n;i++){
		if (isPerfect(i)==false && isDeficient(i)==false)
			System.out.print(i+" ");
		}
		System.out.println("\n");
        scan.close();
	}
    
}
