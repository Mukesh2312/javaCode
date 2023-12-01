package OtherCode;

public class firstTwo {
    public static void main(String[] args) {
        int n = 1234;

        int firstDigi = n / 10;
        int secondDigi = firstDigi / 10;

//        System.out.println(firstDigi);
//        System.out.println(secondDigi);
        int reverse = 0;
        while(secondDigi != 0)
        {
            int remainder = secondDigi % 10;
            reverse = reverse * 10 + remainder;
            secondDigi = secondDigi/10;
        }
        System.out.println(reverse);
    }
}
