package OtherCode;

import java.util.Scanner;

public class LargstEleTwice {

    public static int check(int[] arr, int n){
        int maxIdx = 0;
//        int mxVal = arr.length;

        for(int j=1; j<n; j++){
            if(arr[maxIdx] < arr[j]){
                maxIdx = j;
            }
        }

        int maxVal = arr[maxIdx];
        int ans = maxIdx;
        for(int i=0; i<n; i++){

            if( i != maxIdx && arr[i] * 2 > maxVal){
                ans = -1;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int rsu = check(arr, n);
        System.out.println(rsu);


    }
}
