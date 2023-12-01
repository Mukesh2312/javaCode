package OtherCode;

import java.util.Scanner;

public class MaxSubArrSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] arr = {10, 12, 5, 6, 9, 8, 13, 7, 20};
        int[] arr = {20, 30, 40, 50, 60, 70};

        int size = arr.length;
        int k = 3;

        int maxSum = 0;

//        for(int i=0; i<=size - k; i++){
//            int currSum = 0;
//            for(int j=i; j<i+k; j++){
//                currSum = currSum + arr[j];
//            }
//            if(currSum>maxSum){
//                maxSum = currSum;
//            }
//        }

        // 💯❤️ optimize code

        int curSum = 0;
        for(int i=0; i<size; i++){
            curSum = curSum + arr[i];

        }
        for(int i=k; i<size; i++){
            curSum = curSum + arr[i] - arr[i - k];
            if(curSum>maxSum){
                maxSum = curSum;
            }
        }
        System.out.println(maxSum);
    }
}
