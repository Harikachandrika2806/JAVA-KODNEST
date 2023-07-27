package patterns.level4;

import java.util.Scanner;

public class Pattern2 
{
	public static void main(String[] args) {
		
	
	Scanner scan=new Scanner(System.in);
    int n = scan.nextInt(); // Number of '#' symbols
    int m = scan.nextInt(); // Number of '*' symbols
    scan.close();
    // Print '#' symbols
    for(int j=1;j<=m;j++)
    {
    for (int i = 1; i <= n; i++) {
        System.out.print("#");
    }

    // Print '*' symbols
    for (int i = 1; i <= n; i++) {
        System.out.print("*");
    }

    System.out.println(); // Move to the next line
}
}
	

}
