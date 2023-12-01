package Searching.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class LSearch {

    public static int find(int[] arr, int data){
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == data){
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int[] arr = new int[n];

        for(int i=0; i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int fData  = sc.nextInt();

        //System.out.println(Arrays.toString(arr));

        // find() uses linear search to find data
        int result = find(arr, fData);
        System.out.println(result);

    }
}
