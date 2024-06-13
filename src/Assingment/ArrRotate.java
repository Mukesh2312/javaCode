package Assingment;

import java.util.Arrays;

public class ArrRotate {

//    static int[] rotateArr(int[] arr, int data){
//
//
//    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int data = 4;

        int len = arr.length;
        int d = data % len;

        int[] temp = new  int[len];
        int tempIndex = 0;

        for(int i=d; i<len; i++){
            temp[tempIndex] = arr[i];
            tempIndex++;
        }

//        System.out.println(Arrays.toString(temp));
        for(int i=0; i<d; i++){
            temp[tempIndex] = arr[i];
            tempIndex++;
        }
        System.out.println(Arrays.toString(temp));


    }
}
