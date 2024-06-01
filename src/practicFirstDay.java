import java.util.Arrays;
import java.util.Scanner;

public class practicFirstDay {

    static int findD(int[] arr, int data){
        for(int i=0; i< arr.length; i++){
            if(arr[i] == data){
                return i;
            }
        }

        return -1;
    }

    static int bnSearch(int[] arr, int data){
        int left = arr[0], right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == data){
                return mid;
            }else if(arr[mid] < data){
                left = mid + 1;
            } else if (arr[mid] > data) {
                right = mid - 1;
            }

        }
        return  -1;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        System.out.println("Enter the Array elements");
        int[] arr = new int[n];



        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the data which you need to find");
        int data = sc.nextInt();


        int resutl = bnSearch(arr, data);
//        int resutl = findD(arr, data);
        System.out.println("The data position in Array is:==> "+resutl);





//        System.out.println(Arrays.toString(arr));
    }

}
