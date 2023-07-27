package arrayMethodsWrapperClass;
import java.util.Arrays;

public class ArrayMethods {
	
	    public static void main(String[] args) {
	        int[] arr = {9, 3, 7, 1, 5, 2, 6, 4, 8};

	        //  Arrays.toString()
	        String arrayAsString = Arrays.toString(arr);
	        System.out.println("Array as String: " + arrayAsString);

	        //  Arrays.sort()
	        Arrays.sort(arr);
	        System.out.println("Sorted Array: " + Arrays.toString(arr));

	        //  Arrays.binarySearch()
	        int searchKey = 6;
	        int index = Arrays.binarySearch(arr, searchKey);
	        System.out.println("Index of " + searchKey + ": " + index);

	        //  Arrays.copyOf()
	        int[] copyArr = Arrays.copyOf(arr, 5);
	        System.out.println("Copied Array: " + Arrays.toString(copyArr));

	        //  Arrays.fill()
	        int[] filledArr = new int[5];
	        Arrays.fill(filledArr, 10);
	        System.out.println("Filled Array: " + Arrays.toString(filledArr));
	       
	        //isEqual
	        int[] array1 = {1, 2, 3};
	        int[] array2 = {1, 2, 3};
	        boolean isEqual = Arrays.equals(array1, array2); // true
	        System.out.println(isEqual);
	        
	       


	    }
	}



