package practice;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {2, 7, 11, 5};
        int target = 16;

        for(int i=0; i<arr.length - 1; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i +" "+j);
                }
            }

        }
    }
}
