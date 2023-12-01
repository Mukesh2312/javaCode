package HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<String>();
        h.add("n");
        h.add("2");

        for(String val : h){
            System.out.print(val+" ");
        }
    }
}
