package OtherCode;

import java.io.*;
import java.util.*;

public class PrimeSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        for (int i=0;i<t;i++){
            int n = sc.nextInt(); // input number
            int[] primes = getPrimePair(n); // get prime pair
            System.out.println(primes[0] + " " + primes[1]); // print the prime pair
        }

    }

    // Function to get a prime pair whose sum is equal to the given number
    public static int[] getPrimePair(int n) {
        int[] primes = new int[2]; // array to store the prime pair
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && isPrime(n - i)) { // check if both i and n-i are prime
                primes[0] = i;
                primes[1] = n - i;
                break;
            }
        }
        return primes;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
