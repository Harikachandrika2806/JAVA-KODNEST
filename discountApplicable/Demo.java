package discountApplicable;

import java.util.Scanner;

public class Demo
{
	public static void checkDiscount(double purchaseAmount)

	{
	if(purchaseAmount>100)
	{
		System.out.println("Discount Applicable");
	}
	}




	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter amount");
		double purchaseAmount=scan.nextDouble();
		checkDiscount(purchaseAmount);
		scan.close();
		
	}
}

