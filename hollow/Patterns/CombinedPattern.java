package hollow.Patterns;

import java.util.Scanner;

public class CombinedPattern {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the rows: ");
	int rows=sc.nextInt(); //get input from user
	System.out.print("Enter the stars in each side of square: ");
	int sideSize = sc.nextInt();
	System.out.println("Hollow Square Star Pattern: ");
	 int stars = 1; // Initialize the number of stars

     for (int i = 1; i <= rows; i++) { // Loop to print each row

         // Print spaces for the left-side of the triangle
         for (int j = 1; j <= rows - i; j++) {
             System.out.print(" ");
         }

         // Print stars for the left-side triangle and hollow center
         for (int k = 1; k <= stars; k++) {
             if (k == 1 || k == stars || i == rows)
                 System.out.print("*");
             else {
                 System.out.print(" ");
             }
         }

         stars += 2; // Increase the number of stars for the next row

         System.out.println(); // Move to the next line
     }
 
    for (int i = 0; i < sideSize; i++ )
    {
      for (int j = 0 ; j < sideSize; j++ )
      {
        if (i == 0 || i == sideSize - 1 || j == 0 || j == sideSize - 1)
        {
          System.out.print("*");
        }
        else {
          
          System.out.print(" ");
        }
      }
      
      System.out.println();
    }

}
}
