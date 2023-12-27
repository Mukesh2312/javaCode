package Assingment;

import java.util.Arrays;
import java.util.Scanner;

public class firstNonReapeating {
    static int findFirstAppeance(String s){

        char[] lin = s.toCharArray();
        int x = 0;

           for(char i=0; i<lin.length-1; i++){
               if(lin[x] == lin[i+1]){
                   return i;
               }
               else{
                   x++;
               }
           }
           return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

      int result = findFirstAppeance(s);
        System.out.println(result);
    }
}
