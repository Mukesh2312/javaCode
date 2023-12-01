package OtherCode;

import java.util.Scanner;

public class assignmet04octo {
    static void reverse(int[] arr){
        int left = 0, right = arr.length - 1;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        reverse(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
