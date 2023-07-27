package randomWrapperClass;

	import java.util.Random;

	public class RandomDemo {

	    public static void main(String[] args) {
	        Random random = new Random();

	        // Generate random integer
	        int randomNumber = generateRandomNumber(random, 1, 100);
	        System.out.println("Random number: " + randomNumber);

	        // Flip a coin
	        boolean isHeads = flipCoin(random);
	        System.out.println("Coin flip result: " + (isHeads ? "Heads" : "Tails"));

	        // Pick a random element from an array
	        String[] fruits = {"Apple", "Orange", "Banana", "Mango", "Grapes"};
	        String randomFruit = pickRandomElement(random, fruits);
	        System.out.println("Randomly picked fruit: " + randomFruit);
	    }

	    // Generate a random integer between min and max (inclusive)
	    public static int generateRandomNumber(Random random, int min, int max) {
	        return random.nextInt(max - min + 1) + min;
	    }

	    // Flip a coin (simulate a true/false outcome)
	    public static boolean flipCoin(Random random) {
	        return random.nextBoolean();
	    }

	    // Pick a random element from an array
	    public static <T> T pickRandomElement(Random random, T[] array) {
	        if (array == null || array.length == 0) {
	            throw new IllegalArgumentException("Array must not be empty or null.");
	        }
	        return array[random.nextInt(array.length)];
	    }
	}


