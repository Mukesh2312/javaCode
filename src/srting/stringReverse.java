package srting;

import java.util.Scanner;

public class stringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int len = s.length() - 1;
        int i = 0;

        char[] c = s.toCharArray();
        while(i < len){
            char temp = c[i];
            c[i] = c[len];
            c[len] = temp;
            i++;
            len--;
        }

        System.out.println(c);
    }
}
