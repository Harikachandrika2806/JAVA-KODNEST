package sumofNaturalNumbers;

import java.util.Scanner;

public class NaturalNumbers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of "+ n +" natural numbers is "+sum);
		scan.close();
	}

}
