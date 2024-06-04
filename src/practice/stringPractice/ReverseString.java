package practice.stringPractice;

import java.util.Arrays;

public class ReverseString {
    static void revers(char[] arr){
        int left = 0, right = arr.length - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void main(String[] args){
        String str = "hello";
        char[] arr = str.toCharArray();
        revers(arr);
//        arr.toString()
        System.out.println(Arrays.toString(arr));

    }
}
