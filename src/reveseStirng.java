public class reveseStirng {
    public static void main(String[] args) {
        String s = "mukesh";
        String newString = "";
        char ch ;
        char[] newS = s.toCharArray();

        for(int i=0; i<s.length(); i++){
           ch = s.charAt(i);
           newString = ch + newString;
        }

        System.out.println(newString);



    }
}
