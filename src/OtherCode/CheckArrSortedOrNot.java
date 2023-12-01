package OtherCode;

public class CheckArrSortedOrNot {
    public static int Check(int[] arr, int size){
        for(int i=1; i<size; i++){
            if(arr[i] < arr[i-1]){
                return -1;
            }

        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 5, 6};
        int size = arr.length;
        int result = Check(arr, size);
        System.out.println(result);
    }
}
