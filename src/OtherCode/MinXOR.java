package OtherCode;

import java.util.Arrays;
import java.util.Scanner;

public class MinXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int ans = arr[0] ^ arr[1];
        for(int i=0; i<n-1;i++){
            int cur = arr[i] ^ arr[i +1];
            if(cur < ans){
                ans = cur;
            }
        }
        System.out.println(ans);
    }
}
