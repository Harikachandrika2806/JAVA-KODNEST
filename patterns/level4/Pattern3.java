package patterns.level4;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
    int m = scan.nextInt(); // Number of '*' symbols
    scan.close();
    // Print '#' symbols
    for(int i=1;i<=m;i++)
    {
    	for(int j=1;j<=i;j++)
    	{
    	System.out.print("#");
    	}
    	for(int j=1;j<=m;j++)
    	{
    		System.out.print("*");
    	}
    	System.out.println();
    }
	}
}
    	