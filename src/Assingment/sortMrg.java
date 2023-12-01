package Assingment;

import java.util.Arrays;

public class sortMrg {

    public static int[] merge(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length + arr2.length];
        int index  = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]) {
                combined[index] = arr1[i];
                index++;
                i++;
            }else {
                combined[index] = arr2[j];
                index++;
                j++;
            }
        }

        while (i < arr1.length){
            combined[index] = arr1[i];
            index++;
            i++;
        }

        while(j < arr2.length){
            combined[index] = arr2[j];
            index++;
            j++;
        }

        return combined;
    }
    public static int[] mersot(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mersot(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mersot(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    public static void main(String[] args) {
        int[] arr = {1, 55 ,6, 654, 54,87, 8,66,44,124,84};
        int[] result = mersot(arr);
        for(int j=0; j<result.length; j++){
            System.out.print(result[j]+" ");
        }
    }
}
