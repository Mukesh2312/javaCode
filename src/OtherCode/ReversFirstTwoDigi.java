package OtherCode;

import java.util.Scanner;

public class ReversFirstTwoDigi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = firstTwo(n);
        System.out.println(result);

    }
    public static int firstTwo(int N){
        int firstTwoDi = N / 100;
        return ((firstTwoDi % 10) * 10) + (firstTwoDi / 10);
    }
}
