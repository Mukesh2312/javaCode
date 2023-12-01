package SortingAssingment;

import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SeparatePositiveNegativeWithMergeSort {
    public static void main (String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i <n; i++){
            a[i] = sc.nextInt();
        }

        int temp[] = new int[n];

        // merge and seperation
        seperationLogic(a, temp, 0, n-1);
        // left --> 0 , mid
        // right --> mid + 1, n-1
        for (int i = 0; i < n; i++){
            System.out.print(a[i] +" ");
        }
    }

    public static void seperationLogic(int a[], int temp[], int start, int end){

        // base case (if no base case , Error -> Stack overflow)
        if (start >= end){
            return; // stop
        }
        int mid = start + (end - start)/2; // (start +end)/2

        // work on left partition
        seperationLogic(a, temp, start, mid);

        // work on right partition
        seperationLogic(a, temp, mid +1, end);

        // merge the partitions
        merge(a, temp, start, mid, end);
    }

    public static void merge(int arr[], int temp[], int start, int mid, int end){
        int ind = start; // starting of my temp array

        // Step-1 : Bring all neg elements in left
        for (int i = start; i <= mid; i++){
            if (arr[i] < 0){
                temp[ind] = arr[i];
                ind++;
            }
        }

        // Step-2 : Bring all neg elements in right
        for (int i = mid + 1; i <= end; i++){
            if (arr[i] < 0){
                temp[ind] = arr[i];
                ind++;
            }
        }
        // Step-3:  Bring all pos elements in left
        for (int i = start; i <= mid; i++){
            if (arr[i] >= 0){
                temp[ind] = arr[i];
                ind++;
            }
        }
        // Step-4:  Bring all pos elements in right
        for (int i = mid + 1; i <= end; i++){
            if (arr[i] >= 0){
                temp[ind] = arr[i];
                ind++;
            }
        }

        for (int i = start; i <= end; i++) {
            arr[i] = temp[i];
        }
    }
}