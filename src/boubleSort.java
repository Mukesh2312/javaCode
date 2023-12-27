import java.util.Arrays;

public class boubleSort {
    static void bblsort(int[] arr){
        for(int i=arr.length - 1; i>0; i--){
            for(int j=0; j<i; j++){
                while (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2, 6, 1, 0, 45, 1, 3, 55};

        bblsort(arr);

        System.out.println(Arrays.toString(arr));


    }
}
