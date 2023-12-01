package OtherCode;

import java.util.Scanner;

public class SumOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Check if a is sum of b and c
        if (a == b + c ) {
            System.out.println("YES");
        }
        // Check if b is sum of a and c
        else if (b == a + c) {
            System.out.println("YES");
        }
        // Check if c is sum of a and b
        else if (c == a + b) {
            System.out.println("YES");
        }
        // None of them is sum of the other two
        else {
            System.out.println("NO");
        }
    }
}
