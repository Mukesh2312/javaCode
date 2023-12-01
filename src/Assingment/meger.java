package Assingment;

import java.util.Arrays;

public class meger {
    public static int[] merge(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length + arr2.length];

        int index = 0;
        int i = 0;
        int j = 0;

        while (i< arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                combined[index] = arr1[i];

                index++;
                i++;
            }else{
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
        while (j < arr2.length){
            combined[index] = arr2[j];
            index++;
            j++;
        }

        return combined;
    }

    public static int[] mert(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mert(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mert(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);


    }
    public static void main(String[] args) {
        int[] arr = {2, 55, 2,66,8, 9, 10,11, 55, 1564, 990};
        int[] result = mert(arr);

        System.out.print(Arrays.toString(result));

    }
}
