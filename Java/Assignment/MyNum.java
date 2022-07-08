package Assignment;

import java.util.Scanner;
public class MyNum
{
public static void main(String args[])
{
		double num,numRound,numCeil,numFloor;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		num=sc.nextDouble();
		int numInteger=(int)num;
		if(num>=0)                                   // For positive numbers
		{
		if(num<numInteger+0.5)
			numRound=numInteger;
		else
			numRound=numInteger+1;
		System.out.println("The round value of "+num+" = "+numRound);
		if(num>numInteger&&num<numInteger+1)
		{
			numCeil=numInteger+1;
			numFloor=numInteger;
		}
		else
			numCeil=numFloor=numInteger;
		}
		else                                                         // For negative numbers
		{
			if(num>numInteger-0.5)
				numRound=numInteger;
			else
				numRound=numInteger-1;
System.out.println("The round value of "+num+" = "+numRound);
			if(num<numInteger&&num>numInteger-1)
			{
				numCeil=numInteger;
numFloor=numInteger-1;
			}
			else
				numCeil=numFloor=numInteger;
		}
System.out.println("The ceil value of "+num+" = "+numCeil+"\n"+"The floor value of "+num+" = "+numFloor);
}
}
