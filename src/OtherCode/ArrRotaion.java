package OtherCode;

import java.util.Arrays;
import java.util.Scanner;

public class ArrRotaion {

    static void revers(int[] arr, int start, int end){
        while (start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotatArr(int[] arr, int k){
        k = k % arr.length;
        if(k < 0){
            k = k + arr.length;
        }

        revers(arr, 0, k-1);
        revers(arr, k, arr.length - 1);
        revers(arr, 0, arr.length - 1);

//      leetcode problem working with this code
        // Reverse entire array
//        reverse(nums, 0, nums.length - 1);
//        // Reverse first k elements
//        reverse(nums, 0, k - 1);
//        // Reverse remaining elements
//        reverse(nums, k, nums.length - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(5);
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        rotatArr(arr, k);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
