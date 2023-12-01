package OtherCode;

import java.util.Scanner;

public class MinumumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int j=0;j<n;j++){
            arr2[j] = sc.nextInt();
        }

        mergeSort(arr1, 0, n-1);
        mergeSort(arr2, 0, n-1);

        int ans = 0;
        for(int i=0;i<n; i++){
            ans += arr1[i] * arr2[n-i-1];
        }
        System.out.println(ans);


    }
    public static void mergeSort(int[] arr, int l, int r){
        if(l < r){
            int m = l+(r-l)/2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);
            merge(arr, l, m, r);
        }
    }
    public static void merge(int[] arr, int l, int m, int r){
        int n1 = m - l + 1;
        int n2 = r - m;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i] = arr[l + i];
        }
        for(int j=0;j<n2;j++){
            R[j] = arr[m + 1 + j];
        }

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
