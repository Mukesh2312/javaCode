package ArrList;

import java.util.Scanner;

public class twoDArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols]; //cols size is not mendatory

        for(int row = 0; row<rows; row++){
            for(int col=0; col<cols; col++){
                arr[row][col] = sc.nextInt();
            }
        }

        for(int row=0; row<rows; row++){
            for(int col=0; col<cols; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}
