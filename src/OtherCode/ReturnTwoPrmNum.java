package OtherCode;

import java.util.Scanner;

public class ReturnTwoPrmNum {
    public static boolean checkPrime(int n){
        boolean flag = true;
        if(n==1){
            return  false;
        }
        for(int i=2; i<=n/2; i++){
            if(n%i == 0){
                flag =  false;
                return flag;
            }
        }

    return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            for(int j=1;j<=n;j++){
                int first = j;
                int second = n - j;
                if(checkPrime(first) == true && checkPrime(second) == true){
                    System.out.println(first+" "+second);
                    break;
                }
            }
        }
    }

}
