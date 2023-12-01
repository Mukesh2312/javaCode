package Assingment;

import java.util.Scanner;

public class minmaxeElementinArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=1; i<n; i++){
            int currMin = arr[i];
            int currMax = arr[i];
            if(currMin < min){
                min = currMin;
            }
            if (currMax > max){
                max = currMax;
            }


        }

        System.out.println("Minimum element in array is: "+min);
        System.out.println("Maximum element in array is: "+max);
    }
}
