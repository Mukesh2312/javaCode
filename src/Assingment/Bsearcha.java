package Assingment;

public class Bsearcha {
    public static int find(int[] arr, int data){
        int n = arr.length;
        int left = 0;
        int right = n -1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == data){
                return mid;
            } else if (arr[mid] < data) {
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 55, 88, 99,111, 222, 333, 555};
        int data = 9;
        int result = find(arr, data);
        System.out.println(result);
    }
}
