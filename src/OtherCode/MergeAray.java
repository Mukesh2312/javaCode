package OtherCode;

import java.util.Arrays;
import java.util.Scanner;

public class MergeAray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }
        for(int j=0;j<m;j++){
            arr2[j] = sc.nextInt();
        }

        int[] combined =new int[n+m];

        //System.out.println(Arrays.toString(sortedArr));  printin whole array as it is

        // printing whole array elements
        for (int j=0;j<arr1.length;j++) {
            combined[j] =  arr1[j];
        }
        for (int k=0;k<arr2.length;k++) {
            combined[k + arr1.length] =  arr2[k];
        }


        Arrays.sort(combined);
        for(int i=0; i<combined.length;i++){
            System.out.print(combined[i]+ " ");
        }




    }
}
