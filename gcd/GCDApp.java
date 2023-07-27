package gcd;

import java.util.Scanner;

public class GCDApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter m and n values");
		int m=scan.nextInt();
		int n=scan.nextInt();
		scan.close();
		int res=Gcd.findGcd(m, n);
		System.out.println("Gcd of "+m+" and "+n+" is "+res);
		
	}

}
