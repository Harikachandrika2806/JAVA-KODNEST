package mathWrapperClass;
import java.lang.Math;
public class MathMethods {
	

	    public static void main(String[] args) {
	        // abs()
	        int absoluteValue = Math.abs(-5);
	        double absoluteValueDouble = Math.abs(-3.14);
	        System.out.println("Absolute value of -5: " + absoluteValue);
	        System.out.println("Absolute value of -3.14: " + absoluteValueDouble);

	        // sqrt()
	        double squareRoot = Math.sqrt(25);
	        System.out.println("Square root of 25: " + squareRoot);

	        // pow()
	        double powerResult = Math.pow(2, 3);
	        System.out.println("2 raised to the power of 3: " + powerResult);

	        // ceil()
	        double roundedUp = Math.ceil(3.25);
	        System.out.println("Ceil of 3.25: " + roundedUp);

	        // floor()
	        double roundedDown = Math.floor(3.85);
	        System.out.println("Floor of 3.85: " + roundedDown);

	        // round()
	        long roundedValue = Math.round(3.5);
	        System.out.println("Rounded value of 3.5: " + roundedValue);

	        // min()
	        int minValue = Math.min(10, 5);
	        System.out.println("Minimum value between 10 and 5: " + minValue);

	        // max()
	        int maxValue = Math.max(10, 5);
	        System.out.println("Maximum value between 10 and 5: " + maxValue);

	        // random()
	        double randomValue = Math.random();
	        System.out.println("Random value between 0 and 1: " + randomValue);
	        
	    }
	}


