package OtherCode;

import java.util.Scanner;

public class reverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int i=0;
        int len = s.length() - 1;

        char[] chars = s.toCharArray();

        while(i < len){
            char temp = chars[i];
            chars[i] = chars[len];
            chars[len] = temp;
            i++;
            len--;

        }
        System.out.println(chars);

    }
}
