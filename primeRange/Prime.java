package primeRange;

import java.util.Scanner;

public class Prime {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n=scan.nextInt();
		
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				
				System.out.println("not prime");
				return;
			}
		
			
			
		}
		System.out.println(" prime");
		
		scan.close();
	}
}