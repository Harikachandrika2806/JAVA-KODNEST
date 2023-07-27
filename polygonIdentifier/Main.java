package polygonIdentifier;

import java.util.Scanner;

public class Main

{

public static void identifyPolygon(int sides)

{
	if(sides==3)
	{
		System.out.println("Triangle");
	}
	else if(sides ==4)
	{
		System.out.println("Quadrilateral");
	}
	else if(sides==5)
	{
		System.out.println("Pentagon");
	}
	else if(sides==6)
	{
		System.out.println("Hexagon");
	}
	else
	{
		System.out.println("Polygon");
	}
}

// your code here


public static void main(String[] args)
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter number of sides");
int sides=scan.nextInt();
identifyPolygon(sides);
scan.close();
}
}