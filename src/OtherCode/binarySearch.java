package OtherCode;

public class binarySearch {

    public static int find(int[] arr, int target){
        int n = arr.length;
        int left = 0;
        int right = n-1;
        while(left <=  right){
            int mid = left + (right - left)/2;
            if(arr[mid] == target){
                return mid;
            } else if (target < arr[mid]) { //change the sysmbol from "<" to ">" for decending order or do below step
                right = mid - 1;
                //left = mid + 1; // for decending order
            }else {
                left = mid + 1;
                //right = mid - 1 // for decending order

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 60, 110, 120, 130, 170};
        int ans = find(arr, 120);
        System.out.println(ans);
    }
}
