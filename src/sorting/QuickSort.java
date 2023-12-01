//package sorting;
//
//public class QuickSort {
//
//    public static void swap(int[] arr, int fIndex, int sIndex){
//        int temp = arr[fIndex];
//        arr[fIndex] = arr[sIndex];
//        arr[sIndex] = temp;
//    }
//
//     private static int pivot(int[] arr, int pivotIndex, int endIndex){
//        int swapIndex = pivotIndex;
//        for(int i = pivotIndex+1;i <= endIndex; i++){
//            if(arr[i] < arr[pivotIndex]){
//                swapIndex++;
//                swap(arr, swapIndex, i);
//            }
//
//        }
//        swap(arr, pivotIndex, swapIndex);
//
//
//     }
//
//    public static void quickSortHelper(int[] arr, int left, int right){
//        if (left < right){
//            int pivotIndex = pivot(arr, left, right);
//            quickSortHelper(arr, left, pivotIndex-1);
//            quickSortHelper(arr, pivotIndex+1, right);
//        }
//
//    }
//    public static void quickSort(int[] arr){
//        quickSortHelper(arr, 0, arr.length-1);
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {4, 6, 1, 7, 3, 2, 5};
//        quickSort((arr));
//    }
//}
