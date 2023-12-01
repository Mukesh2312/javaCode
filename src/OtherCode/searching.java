package OtherCode;

public class searching {
    public static int find(int arr[],int target){
            int index = -1;
            for(int i=0;i<arr.length;i++){
                if(arr[i] == target){
                    index = i;
                    break;
                }
            }
            return index;
    }

    public static void main(String[] args){
        int[] arr = {22, 8, 9, 55, 99};
        int ans = find(arr, 55);
        System.out.println(ans);
    }




}
