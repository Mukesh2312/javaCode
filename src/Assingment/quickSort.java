package Assingment;

import java.util.Arrays;

public class quickSort {

    public static void swap(int[] arr, int firstIndx, int secndIndx){
        int temp = arr[firstIndx];
        arr[firstIndx] = arr[secndIndx];
        arr[secndIndx] = temp;
    }

    public static int pivot(int[] arr, int pivotIndx, int lastIndx){
        int swapIndx = pivotIndx;
        for(int i = pivotIndx + 1; i<=lastIndx; i++){
            if(arr[i] < arr[pivotIndx]) {
                swapIndx++;
                swap(arr, swapIndx, i);
            }
        }
        swap(arr, pivotIndx, swapIndx);

        return pivotIndx;
    }

    public static void quicklSortHelper(int[] arr, int left, int right){
        if(left < right){
            int pivotIndx = pivot(arr, left, right);
            quicklSortHelper(arr, left, pivotIndx - 1);
            quicklSortHelper(arr, pivotIndx + 1, right);
        }
    }

    public static void quickSort1(int[] arr){
        quicklSortHelper(arr, 0,arr.length - 1);
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 2, 10, 3, 1 ,20, 33};
        quickSort1(arr);
        System.out.println(Arrays.toString(arr));


    }
}
