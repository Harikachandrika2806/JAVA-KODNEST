package vendingMachineStimulator;

import java.util.Scanner;

public class Main

{

public static void getProduct(String product)

{
	switch(product)
	{
	case "p01":System.out.println("COCO COLA");
	break;
	case "p02":System.out.println("MOUNTAIN DEW");
	break;
	case "p03":System.out.println("MAAZA");
	break;
	case "p04":System.out.println("MILKSHAKE");
	break;
	default:
		System.out.println("stock unavailable");
		break;
	}

// your code here

}

public static void main(String[] args)

{
Scanner scan=new Scanner (System.in);
System.out.println("Enter product code");
String product =scan.nextLine();
scan.close();
getProduct(product);

}

}