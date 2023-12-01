package OtherCode;

import java.util.Scanner;

public class MutipleOfNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases

        for(int i=0;i<t;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if(b-a >= a ){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }

}

