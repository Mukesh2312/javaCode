package SringBuilder;

public class RervseStringB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");

        for(int i=0; i<sb.length()/2; i++){
            int start = i;
            int end = sb.length() - 1 - i;

            char frontChar = sb.charAt(start);
            char endChar = sb.charAt(end);

            sb.setCharAt(start, endChar);
            sb.setCharAt(end, frontChar);
        }

        System.out.println(sb);

    }
}
