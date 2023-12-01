package Assingment;

public class bbSearch {
    public static int find(int[] arr, int data){
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = left + (right - left) / 2;
            if(arr[mid] == data){
                return mid;

            }
            else if(arr[mid] < data){
                left = mid + 1;

            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {12, 145, 15 ,61,55 , 489, 666, 1245};
        int data = 666;

        int result = find(arr, data);
        System.out.println(result);
    }
}
