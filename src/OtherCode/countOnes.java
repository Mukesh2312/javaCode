package OtherCode;

import java.util.Scanner;

public class countOnes {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=0;t<test;t++){
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int left = 0, right = n - 1;
            int count = 0;
            while(left<=right){
                int mid = (left+right)/2;
                if(arr[mid]==1){
                    left = mid + 1;
                    count = left;
                }
                else {
                    right = mid - 1;
                }
            }
            System.out.println(count);
        }

    }


}
