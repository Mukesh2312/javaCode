package OtherCode;

import java.util.Scanner;

public class EvenlyDivisibleNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tempLCM = 1;
        for(int i=1; i<=n; i++){
            tempLCM = (tempLCM*i) / checkEvendDiv(tempLCM, i);
        }

        System.out.println(tempLCM);
    }

    public static long checkEvendDiv(long a, long b){
        if(a < b){
            long temp = a;
            a = b;
            b = temp;
        }
        if(b == 0){
            return a;

        }
        else {
            return checkEvendDiv(b, a%b);

        }
    }
}
