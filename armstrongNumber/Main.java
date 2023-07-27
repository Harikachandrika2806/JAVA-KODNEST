package armstrongNumber;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		 int res=Armstrong.Digits(n);
		int result= ArmNumber.findNumber(n,res);
		if(n==result)
		{
			System.out.println("ArmStrong");
		}
		else
		{
			System.out.println("Not ArmStrong");
		}
		
	}



}

