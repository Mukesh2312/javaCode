package OtherCode;

import java.util.Scanner;

public class PirmeNumBfrN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = primeNum(100000);
        for(int i = 0; i < t; i++){
            int n =  sc.nextInt();
            System.out.println(arr[n]);
        }
    }
    public static int[] primeNum(int num){
        boolean[] bool = new boolean[num+1];
        int[] count = new int[num+1];

        bool[0] = true;
        bool[1] = true;

        for(int i=2; i*i<= num; i++){
            if(!bool[i] ){
                for(int j = i*i; j<=num; j+=i){
                    bool[j] = true;
                }
            }
        }
        int counter = 0;
        for(int i=1; i<=num; i++){
            if(!bool[i]){
                counter += 1;
                count[i] = counter;
            }
            else{
                count[i] = counter;
            }
        }
        return count;
    }
}
