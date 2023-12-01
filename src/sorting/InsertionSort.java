package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr, int n){
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j = i - 1;
            while(j > -1 && temp < arr[j] ){
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        for(int i=0;i<testCases;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }
            insertionSort(arr, n);

            for(int k=0;k<n;k++){
                System.out.print(arr[k]+" ");
            }

            System.out.println();
        }
    }
}
