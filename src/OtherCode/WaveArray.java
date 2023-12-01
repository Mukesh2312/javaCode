package OtherCode;

import java.util.Scanner;

public class WaveArray {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            quickSort(arr, 0, n-1);

            StringBuilder res = new StringBuilder();

            for(int i=0; i<n-1;i=i+2){
                swap(arr, i, i+1);
                res.append(arr[i] + " ");
                res.append(arr[i+1]+ " ");
            }

            if(n % 2 != 0){
                res.append(arr[n-1]);
            }
            System.out.print(res);
        }

        public static void swap(int[] arr, int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public static void quickSort(int[] arr, int low, int high){
            if(low < high){
                int pivot = partion(arr, low, high);
                quickSort(arr, low, pivot-1);
                quickSort(arr, pivot+1,high);

            }
        }
        public static int partion(int[] arr, int low, int high){
            int pivot = arr[high];
            int i = low - 1;
            for(int j= low; j<=high;j++){
                if (arr[j] < pivot){
                    i++;
                    swap(arr, i, j);
                }

            }
            swap(arr, i+1, high);
            return i+1;
        }
}
