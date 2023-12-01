package OtherCode;

import java.util.Scanner;

public class SumOfAllSubArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];

        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        long sum = 0;
        for(int j=0; j<n; j++){
            sum += (long) num[j] * (j+1) * (n-1);
        }

        System.out.println(sum);
    }
}
