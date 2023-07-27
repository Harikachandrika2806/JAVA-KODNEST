package reverseNumber;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		 int res=Reverse.ReverseDigits(n);
		 System.out.println(res);
		scan.close();
		if(res==n)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not palindrome");
		}
		
		
	}

}
