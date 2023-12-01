package OtherCode;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveIntArena {
    public static void selectionSort(int[] arr){
        for(int i=0;i< arr.length;i++){
            int minIndex = i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            if(i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        selectionSort(arr);

        for (int i = 0; i < n-1; i++) {
            if (Math.abs(arr[i] - arr[i+1]) > 1) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }

}
