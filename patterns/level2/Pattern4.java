package patterns.level2;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		scan.close();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
