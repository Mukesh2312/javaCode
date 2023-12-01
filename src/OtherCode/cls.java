package OtherCode;

import java.util.Arrays;
import java.util.Scanner;

public class cls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        long maxSum = Integer.MIN_VALUE;

        for(int i=1; i<=rows;i++){
            for(int j=1; j<=cols; j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j] > maxSum){
                    maxSum = arr[i][j];
                }
                arr[i][j] = arr[i][j] + arr[i-1][j];
            }
        }

        for(int i=1; i<=rows; i++){
            System.out.println(Arrays.toString(arr[i]));


        }


        for(int i=1; i<=rows; i++){
            for(int j=i; j<=rows; j++){
                long sum = 0;
                for(int k=1; k<=cols; k++){
                    sum =  sum + arr[j][k] - arr[i-1][k];
                    if(maxSum < sum){
                        maxSum = sum;
                    }
                    if(sum <= 0){
                        sum = 0;
                    }
                }
            }
        }

        System.out.println(maxSum);
    }
}
