package SortingAssingment;

public class LSearch {
    public static int Lsearching(int[] arr, int data){
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
        int[] arr = {2, 3, 5, 9, 10, 66, 349, 555};
        int data = 64568465;

        int result = Lsearching(arr, data);
        System.out.println(result);
    }
}
