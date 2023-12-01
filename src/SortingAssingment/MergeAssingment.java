package SortingAssingment;

import java.util.Arrays;

public class MergeAssingment {

    public static int[] mergeDo(int[] arr1, int[] arr2){
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length){
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
        while(i < arr1.length){
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


    //❌ it uses extra space

    public static int[] mersot(int[] arr){
       if(arr.length == 1){
           return arr;
       }

       int mid = arr.length / 2;

       int[] left = mersot(Arrays.copyOfRange(arr, 0, mid));
       int[] right = mersot(Arrays.copyOfRange(arr, mid, arr.length));

       return mergeDo(left, right);
    }


    public static void main(String[] args) {
        int[] arr1 = {5, 0, 3, 55, 10, 99, 3, 4, 10};
        //int[] arr2 = {1,3,4,6,8,9,22,55,111};

        int[] result = mersot(arr1);
        for(int j : result){
            System.out.print(j+" ");
        }
     }
}
