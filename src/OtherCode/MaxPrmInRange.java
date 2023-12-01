package OtherCode;

import java.util.Scanner;

public class MaxPrmInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int[] prime = new  int[r +1];
        for(int i = 0; i<= r; i++){
            prime[i] = 1;
        }
        prime[0] = 0;
        prime[1] = 0;

        for(int i = 2; i <= r; i++){
            if(prime[i] == 1){
                for(int j = 2 * i; j <= r; j+= i){
                    prime[j] = 0;
                }
            }
        }

        int output = r;

        while(output >= l && prime[output] == 0){
            output--;
        }

        if(output < l){
            output = -1;
        }

        System.out.println(output);
    }

}
