package Searching.LinearSearch.binarySearch;

import java.util.Scanner;

public class Bseach {
    public static int BinarySearchItrative(int[] arr, int data){
        int left = 0, right = arr.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == data){
                return mid;
            } else if (arr[mid] < data) {
                left  = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return  -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int data = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int result = BinarySearchItrative(arr, data);
        System.out.println(result);
    }
}
