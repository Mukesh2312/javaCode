package Assingment;

public class lSEarch {
    public static int find(int[] arr, int data){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,12, 0, 3, 54, 325, 35, 354, 34, 36,5};
        int data = 3250;

        int result = find(arr, data);
        System.out.println(result);
    }
}
