package occuranceofnumbers;

public class ArrayElementCount {
    // Method to count the occurrences of each element in an array
    public static void printElementCounts(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if (arr[i] == Integer.MIN_VALUE) {
                continue; // Skip if the element is already processed
            }

            int count = 1; // Initialize count to 1 for the current element
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = Integer.MIN_VALUE; // Mark this element as processed to avoid duplicates
                }
            }

            System.out.println("Element " + arr[i] + " occurs " + count + " times in the array.");
        }
    }

    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 2, 2, 5, 6, 2, 7};

        // Call the method to print element counts
        printElementCounts(array);
    }
}
