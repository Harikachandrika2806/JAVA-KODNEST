package primeRange;

import java.util.Scanner;

public class PrimalityCheck {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int n=scan.nextInt();
		
		if(n<2) {
			System.out.println("not prime");
		}
		else
		{
			boolean isPrime=true;
			for(int i=2;i*i<=n;i++)
			{
				if(n%i==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime==true)
			{
				System.out.println("prime");
			}
			else
			{
				System.out.println("not prime");
			}
		}
		scan.close();
	}

}
