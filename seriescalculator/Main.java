package seriescalculator;

import java.util.Scanner;

public class Main

{

 static double calculateSumOfSeries(int n)

{
	double sum=0;

// your code here
	for(int i=2;i<=n;i++)
	
	{
		  sum=sum+(1.0/i);
		  
		
	}

	return sum+1;
	

}

public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	double res=Main.calculateSumOfSeries(n);
	System.out.println(res);
	
	

}

}