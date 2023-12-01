package OtherCode;

import java.util.Scanner;

public class Graycode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i=0; i<t; i++){
            int num = sc.nextInt();
            System.out.println(num ^ (num >> 1));
        }
    }
}
