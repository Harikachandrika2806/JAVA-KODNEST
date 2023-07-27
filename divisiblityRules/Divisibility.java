package divisiblityRules;

import java.util.Scanner;

public class Divisibility {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number range");
		int n=scan.nextInt();
		Divisible divisible = new Divisible();
		divisible.result(n);
		divisible.result1(n);
		divisible.result2(n);
		divisible.result3(n);
		divisible.result4(n);
		
		divisible.result6(n);
		divisible.result7(n);
		
		
		
		
		
	}

}
