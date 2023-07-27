package patterns.level4;
import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		for(int i=1;i<=m;i++)
	    {
	    	for(int j=i+1;j<=i;j++)
	    	{
	    	System.out.print("*");
	    	}
	    	for(int j=1;j<=m;j++)
	    	{
	    		System.out.print(" ");
	    	}
	    	System.out.println();
	    }
		}

		
	}


