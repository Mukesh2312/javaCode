package OtherCode;

import java.util.Scanner;

public class RottedArrLinear {
    public static int rotedSortedarr(int[] arr, int target){
        int start =0;
        int end = arr.length - 1;



        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[start] <= arr[end]){
                if(target > arr[mid] || target < arr[start]){
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
            else {
                if(target < arr[mid] || target > arr[end]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }

        }
        return -1;

    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        int target = 3;
        int[] arr = {1, 2, 3, 4, 9, 11, 55};
        int result = rotedSortedarr(arr, target);
        System.out.println(result);
    }
}
