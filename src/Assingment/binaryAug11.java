package Assingment;

// ✅✅✅✅ arr should be sorted for performing binary search  ✅✅✅✅


public class binaryAug11 {
    public static int find(int[] arr, int data){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == data){
                return mid;
            } else if (arr[mid] < data) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 15, 25, 648, 54654, 546485, 65484874, 65800000, 124578922 };
        int data = 15;

        int result = find(arr, data);
        System.out.println(result);

    }
}
