package OtherCode;

import java.util.Scanner;

public class FinalOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int product = 1;
        for(int j=0; j< arr.length; j++){
            product *=  arr[j];
        }

        System.out.println(product);
    }
}
