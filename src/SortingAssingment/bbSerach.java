package SortingAssingment;

public class bbSerach {

    public static int bbfind(int[] arr, int data){
        int len = arr.length;
        int left = 0;
         int right = len- 1;

         while(left <= right){
             int mid = left + (right - left) / 2;
             if(arr[mid] == data){
                 return mid;
             }
             else if(data < arr[mid] ){
                 right = mid - 1;

             }
             else{
                 left = mid + 1;
             }
         }
         return -1;

    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 8, 10, 45, 82};
        int data = 82;

        int result = bbfind(arr, data);
        System.out.println(result);
    }
}
