package SringBuilder;

public class StringB {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mike");
        System.out.println(sb.charAt(1));
        sb.insert(0, 'j');
        System.out.println(sb);
        sb.delete(0, 1);
        System.out.println(sb);
        sb.append("j");
        System.out.println(sb);
        System.out.println(sb.length());



    }
}
