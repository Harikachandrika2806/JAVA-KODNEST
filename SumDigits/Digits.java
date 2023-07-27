package SumDigits;

import java.util.Scanner;

public class Digits {
	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		int n=scan.nextInt();
		int res=SumDigits.addSum(n);
		System.out.println(res);
		scan.close();
	}

}
