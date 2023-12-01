package OtherCode;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfArray {

    public static float findMedian(int[] arr1, int[] arr2){
        int i=0, j=0, k=0;
        int[] m = new int[arr1.length + arr2.length];

        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                m[k] = arr1[i];
                i++;
            }
            else{
                m[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i< arr1.length){
            m[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length){
            m[k] = arr2[j];
            j++;
            k++;
        }

         int mid = m.length / 2;
        if(m.length % 2 == 0){
            return  (float) (m[mid] + m[mid - 1]) / 2;
        }
        else{
            return m[mid];
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        for(int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        for(int j=0; j<m; j++){
            arr2[j] = sc.nextInt();
        }

        //System.out.println(Arrays.toString(arr1));
        //System.out.println(Arrays.toString(arr2));

        float result = findMedian(arr1, arr2);
        System.out.println(result);
     }
}