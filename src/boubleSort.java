import java.util.Arrays;
import java.util.Scanner;

public class boubleSort {

    static void bbSort(int[] arr){
        for(int i= arr.length - 1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        bbSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
