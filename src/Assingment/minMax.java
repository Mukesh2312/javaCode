package Assingment;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<n; i++){
            int currMin = arr[i];
            int currMax = arr[i];

            if(currMin < min){
                min = currMin;
            }
            if(currMax > max){
                max = currMax;
            }
        }

        System.out.println(min);
        System.out.println(max);

    }
}
