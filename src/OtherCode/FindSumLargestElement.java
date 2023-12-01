package OtherCode;

import java.util.Arrays;
import java.util.Scanner;

public class FindSumLargestElement {
    public static int findFourLargestSum(int[] arr) {

        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0;


        for (int i = n - 1; i >= Math.max(n - 4, 0); i--) {
            sum += arr[i];
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result = findFourLargestSum(arr);
        System.out.println(result);
    }
}
