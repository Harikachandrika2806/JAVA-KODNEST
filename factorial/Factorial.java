package factorial;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		long factorial=1;
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i;
		}
		scan.close();
		System.out.println("Factorial of "+ n +" is "+factorial);
	}

}
