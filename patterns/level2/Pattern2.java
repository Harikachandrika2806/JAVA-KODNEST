package patterns.level2;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		for(int i=1;i<=n;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println();

}
}
