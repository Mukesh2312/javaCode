package SortingAssingment;

public class bSearch {
    public static int seachB(int[] arr, int data){
        int len = arr.length;
        int left = 0;
        int right = len - 1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == data){
                return mid;
            } else if (data < arr[mid]) {
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 9, 11, 55, 245, 300, 999};
        int data = 1111;

         int result = seachB(arr , data);
        System.out.println(result);
     }

}
