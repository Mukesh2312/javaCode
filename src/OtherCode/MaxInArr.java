package OtherCode;

import java.util.Scanner;

public class MaxInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int maxIdx = 0;

        for(int j=0; j<n; j++){
            if(arr[maxIdx] < arr[j]){
                maxIdx = j;

            }
        }

        System.out.println(maxIdx);
    }
}
