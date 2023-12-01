package OtherCode;

import java.util.Scanner;

public class SubtractWithoutOprator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int borrow;
        while (b != 0) {
            borrow = (~a) & b;
            a = a ^ b;
            b = borrow << 1;
        }

        System.out.println(a);
    }
}
