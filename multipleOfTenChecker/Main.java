package multipleOfTenChecker;

import java.util.Scanner;

public class Main { 
	public static void checkMultipleOfTen(int num,int n) { 
		if(num%n==0)
		{
		System.out.println("The number "+num+" is multiple of "+ n);
		}
		else
		{
			System.out.println("The number "+num+" is  not multiple of "+ n);
		}
	}
	public static void main(String[] args) 
	{ 
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scan.nextInt();
		int n=scan.nextInt();
		checkMultipleOfTen(num,n); 
		scan.close();
		
	} 
	
	}
