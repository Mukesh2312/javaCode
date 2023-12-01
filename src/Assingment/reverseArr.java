package Assingment;

import java.util.Scanner;

public class reverseArr {
    public static void doReverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[left] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int j=0; j<n; j++){
            arr[j] = sc.nextInt();
        }
        doReverse(arr);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
