package search;

import java.util.Scanner;

public class basicSearch {
    static int findData(int[] arr, int data){
        for(int i=0; i<arr.length; i++){
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

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int data = sc.nextInt();
        int result = findData(arr, data);
        System.out.println(result);
    }
}
