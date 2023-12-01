package OtherCode;

import java.util.Scanner;

public class NumberOfMerge {
    static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        mergeSort(arr, 0, n-1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n" + count);
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = (l+r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int[] arr, int l, int mid, int r) {
        int[] left = new int[mid-l+1];
        int[] right = new int[r-mid];

        for (int i = 0; i < left.length; i++) {
            left[i] = arr[l+i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = arr[mid+1+i];
        }

        int i = 0, j = 0, k = l;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
                count += (mid - l + 1 - i);
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }
}
