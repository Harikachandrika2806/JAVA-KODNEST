package fibonacci;

import java.util.Scanner;

public class Fibonaaci {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scan.nextInt();
		int fib1=0;
		int fib2=1;
			
				if(n==1)
				{
					System.out.println(fib1+" ");
				}
				else if(n==2)
				{
					System.out.println(fib1+" "+fib2);
				}
				//System.out.println(fib1+" "+fib2);
				else
				{
					System.out.print(fib1+" "+ fib2+" ");
					for(int i=3;i<=n;i++)
					{
					int nextno=fib1+fib2;
					System.out.print(nextno+" ");
					fib1=fib2;
					fib2=nextno;
				}
					//System.out.println();
				
			}
		}
	}

	


