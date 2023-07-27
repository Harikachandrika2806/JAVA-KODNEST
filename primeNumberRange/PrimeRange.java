package primeNumberRange;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        Prime p = new Prime();
        int count = 0; // Initialize a counter variable to keep track of prime numbers

        for (int i = a; i <= b; i++) {
            boolean res = p.CheckPrime(i);
            if (res) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal prime numbers within the range: " + count);
    }
}

class Prime {
    public static boolean CheckPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
