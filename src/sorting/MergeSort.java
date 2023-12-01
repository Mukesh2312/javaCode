package sorting;

import java.util.Arrays;

public class MergeSort {
        public static int[] Mergesort(int[] arr, int[] arr2){
            int[] combinedArr = new int[arr.length + arr2.length];
            int index = 0;
            int i = 0;
            int j = 0;
            while (i < arr.length && j < arr2.length){
                if(arr[i] < arr2[j]){
                    combinedArr[index] = arr[i];
                    index++;
                    i++;
                }else {
                    combinedArr[index] = arr2[j];
                    index++;
                    j++;
                }
            }
            while (i < arr.length){
                combinedArr[index] = arr[i];
                index++;
                i++;
            }
            while (j < arr2.length){
                combinedArr[index] = arr2[j];
                index++;
                j++;
            }
            return combinedArr;
    
        }
        public static void main(String[] args) {
            int[] arr1 = {2, 4, 6, 9, 15, 22};
            int[] arr2 = {2, 3, 11, 16, 19};
            int[] sortedArr = Mergesort(arr1, arr2);
    
            System.out.println(Arrays.toString(sortedArr)); // printin whole array as it is
    
            // printing whole array elements
            for (int j : sortedArr) {
                System.out.print(j + " ");
            }
    
        }
}
