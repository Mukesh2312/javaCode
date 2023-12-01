package OtherCode;

public class naturalsum {

    public static void findsum(int num){
        int i =0,sum=0;
        if(i==num){
            sum += i;
            System.out.println(sum);
            return;
        }

        sum += i;
        findsum(num);


    }
    public static void main(String[] args) {
        findsum(5);
    }
}
