package Assingment;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bubSort {
    public static void find(int[] arr){
        for(int i=arr.length - 1; i>0; i--){
            for(int j=0; j<i; j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 0, 3, 5 , 10, 55, 66 ,102, 254};

        find(arr);
        System.out.println(Arrays.toString(arr));
    }
}
