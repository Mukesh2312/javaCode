package OtherCode;

public class PrimeFactors {
    public static void main(String[] args) {
//        int n = 42;
//        for(int i=2;i<=n; i++){
//            while (n % i == 0){
//                System.out.print(i+ " ");
//                n = n / i;
//            }
//        }

        int n = 42;
        for(int i=2;i<=(int) Math.sqrt(n); i++){
            while (n % i == 0){
                System.out.print(i+ " ");
                n = n / i;
            }
        }
        if(n > 1){
            System.out.println(n);
        }
    }
}
