package OtherCode;

import java.util.Scanner;

public class MaxFrq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();

        }
        int[] freq = new int[101];
        int maxfreq = 0;
        for(int num : arr){
            freq[num]++;
            maxfreq = Math.max(maxfreq, freq[num]);
        }

        int maxNum = 0;

        for(int i=1; i <=100; i++){
            if(freq[i] == maxfreq){
                maxNum = Math.max(maxfreq, i);
            }
        }

        System.out.println(maxNum);
    }
}
