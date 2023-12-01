package OtherCode;

import java.util.Scanner;

public class MinCutTreesearching {
    public static long solve(int height[], int x){
        int units = 0;

        for(int i=0;i<height.length;i++){
            if(height[i]>x){
                units = units + (height[i]-x);
            }
        }
        return units;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        long ans = 0;
        int left = 0, right = 100000;
        while(left<=right){
            int mid = (left+right)/2;
            long units = solve(arr, mid);
            if(units<=k){
                ans = mid;
                right = mid-1;

            }
            else{
                left=mid+1;
            }
        }
//        for(int cut=0;cut<=100000;cut++){
//            long units = solve(arr, cut);
//
//        }
        System.out.println(ans);
    }
}
