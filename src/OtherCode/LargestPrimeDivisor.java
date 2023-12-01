package OtherCode;

import java.util.Scanner;

public class LargestPrimeDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = findLarg(n);
        System.out.println(ans);
    }
    public static int findLarg(int n){
        if(n == 2 || n == 3){
            return n;
        }
        int largestPrime = 1;
        for(int i=2; i<=Math.sqrt(n); i++){
            while (n%i == 0){
                n/=i; // n = n / i;
                largestPrime = i;
            }
        }
        if(n > 1){
            largestPrime = n;
        }
        return largestPrime;
    }
}
