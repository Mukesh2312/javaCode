package Assingment;

public class searchi1 {
    public static int find(int[] arr, int data){
        for(int i=0; i<arr.length;i++){
            if(arr[i] == data){
                return i;
            } else if (arr[i] > data) {
                return -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {0, 2 , 5 , 9,  10, 54 , 256, 2220, 4125};
        int data = 4125;

        int result = find(arr, data);
        System.out.println(result);
    }
}
