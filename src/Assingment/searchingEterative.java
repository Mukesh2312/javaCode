package Assingment;

public class searchingEterative {
    public static int find(int[] arr, int data){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == data){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,9 , 55, 66, 125564, 645, 645, 32185, 32465, 324654, 33, 88};
        int data = 1;
        int result = find(arr, data);
        System.out.println(result);
    }
}
