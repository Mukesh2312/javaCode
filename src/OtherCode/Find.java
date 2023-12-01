package OtherCode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Find {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        System.out.println("* ");
//
//        for(int i=1;i<=N;i++){
//            System.out.print("* ");
//            for(int j=2;j<=i-1;j++) {
//
//                System.out.print("^ ");
//            }
//        }
//        System.out.println("* ");
//
//        for(int p=1;p<=N; p++){
//            System.out.print("* ");
//        }

//        int[] myArry = new int[1];
//
//        myArry[0] = 55;


//        🤣🤣🤣🤣🤣🤣
//        System.out.println(myArry[0]);
//        Scanner sc = new Scanner(System.in);
//        int [] arr = new int[5];
//
//
//        for(int i = 0;i<arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
//        System.out.println(arr.length);


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0;i< arr.length;i++){
//            arr[i]= sc.nextInt();
//        }
//        int j = n;
//        System.out.println(j);

//        int[] arr = {10,40,50,60};
//        for(int i=arr.length-1; i>=0;i--){
//            System.out.print(arr[i]+" ");
//        }


//        int[] array = {1, 2, 3, 4, 5};
//        System.out.println("Input Array :" + Arrays.toString(array));
//
//        // In-place reversal of array
//        for(int i = 0; i < array.length / 2; i++) {
//            // Swapping the elements
//            int j = array[i];
//            array[i] = array[array.length - i - 1];
//            array[array.length - i - 1] = j;
//        }
//
//        // Output
//        System.out.println("Reversed Array :" + Arrays.toString(array));


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr= new int[n];
//
//        for(int i=0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
////            System.out.print(arr[i]+" ");
//        }
//
//        Arrays.sort(arr);
//        int size = arr.length;
//
//        for(int i=0; i < arr.length; i++){
////            arr[i] = sc.nextInt();
//            System.out.print(arr[i]+" ");
//
//        }
//        System.out.println("Third largest element is:"+arr[size-3]);
//        int sum = 0;
//        int mean = 0;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr= new int[n];
//
//        for(int i=0; i < arr.length; i++){
//            arr[i] = sc.nextInt();
////            System.out.print(arr[i]+" ");
//        }
//
//
//
//        for(int i=0; i < arr.length; i++){
//             sum = sum + arr[i];
//
//        }
//
//        mean = sum / n;
//        System.out.print(sum + " ");
//        System.out.println(mean);

        //--------------------- hieghest bid -----------------

//          Scanner sc = new Scanner(System.in);
//          int T = sc.nextInt();
//
//
//          for(int i = 0; i<T; i++){
//              int A = sc.nextInt();
//              int B = sc.nextInt();
//              int C = sc.nextInt();
//              if(A >= B && A >= C ){
//                  System.out.println("Alice");
//              } else if (B >= A && B >= C) {
//                  System.out.println("Bob");
//              }
//              else {
//                  System.out.println("Charlie");
//
//              }
//          }


        //--------------------- print one two three ... less than 5  -----------------


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if(n==1){
//            System.out.println("One");
//        } else if (n==2) {
//            System.out.println("Two");
//        }
//        else if (n==3) {
//            System.out.println("Three");
//        }
//        else if (n==4) {
//            System.out.println("Four");
//        }
//        else if (n==5) {
//            System.out.println("Five");
//        }
//        else {
//            System.out.println("Greater than 5");
//        }


        //--------------------- detecting frequency by a dog  -----------------

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        for(int i = 0; i <= n; i++){
//            int a = sc.nextInt();
//            if(a <= 70 && a <=44000){
//                System.out.println("Yes");
//            }
//            else {
//                System.out.println("No");
//            }
//        }
        //--------------------- Leap Year (if else ladder)  -----------------
//        Scanner sc = new Scanner(System.in);
//        int year = sc.nextInt();
//        if(year % 100 == 0) {
//            if(year % 400 == 0)
//                System.out.println("True");
//            else
//                System.out.println("False");
//        }
//        else{
//
//            System.out.println("Ture");
//        }


        //--------------------- Leap Year (Switch case)  -----------------
//        static void LeapYear(int year){
//            //Write code here
//
//            switch(year % 4) {
//                case 0:
//                    if(year % 100 == 0) {
//                        if(year % 400 == 0)
//                            System.out.println("YES");
//                        else
//                            System.out.println("NO");
//                    }
//                    else
//                        System.out.println("YES");
//                    break;
//                default:
//                    System.out.println("NO");
//                    break;
//            }
//    }


        //--------------------- Number of days in a month (Switch case)  -----------------

//        Scanner sc = new Scanner(System.in);
//        int month = sc.nextInt();
//        Switch(month){
//            case 4:
//            case 6:
//            case 9:
//            case 11:
//                System.out.println("30");
//        }

        //umcomplete

        //--------------------- finding younget and oldest (their base) -----------------

//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if (a <= b && a <= c) {
//            System.out.print("1 ");
//        } else if (b <= a && b <= c) {
//            System.out.print("2 ");
//        } else {
//            System.out.print("3 ");
//        }
//
//
//        if (a >= b && a >= c) {
//            System.out.print("1");
//        } else if (b >= a && b >= c) {
//            System.out.print("2");
//        } else {
//            System.out.print("3");
//        }


//
        //--------------------- discount ----------------
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//
//        for(int i=0; i<n; i++){
//            int a = sc.nextInt();
//
//            if(a > 100 && a <= 1000 ){
//                System.out.println(a-25);;
//            } else if (a>=100 && a <= 5000) {
//                System.out.println(a - 100);
//            } else if (a >= 5000) {
//                System.out.println(a - 500);
//            }
//            else if(a<=100){
//                System.out.println(a);
//            }

        //--------------------- find if sum of two number == third number ----------------

//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        if(a + b == c || a + c == b || b + c == a){
//            System.out.println("1");
//
//        }
//        else {
//            System.out.println("0");
//        }


//        int numberOfLines = 5;
//        for(int i=0; i<numberOfLines;i++){
//            for(int j=0; j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //--------------------- find 0 and 1 in an array ----------------

//        int ones = 0, zero = 0;
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[n];
//        int n = sc.nextInt();
//
//
//        for(int i=0; i<n;i++){
//            int num = arr[i];
//
//            if(num == 0){
//                zero++;
//            }
//            else{
//                ones++;
//            }
//        }
//
//        if(ones > zero){
//            System.out.println(ones+" "+zero);
//        }
//        else{
//            System.out.println(zero+" "+ones);
//        }

        //---------------------😍😍 sum of each digits 😍😍----------------

//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        while(n > 0){
//            sum = sum + n % 10;
//            n = n / 10;
//        }
//
//        System.out.println(sum);


        //---------------------😍😍 2D Arrays 😍😍----------------
//
//
//        int[] a1 = {21, 22, 23};
//        int[] a2 = {1, 2, 3};
//        int[] a3 = {7, 8, 90};
//
//        int[][] arr = {a1, a2, a3};
//
//        int rows = 3;
//        int cols = 3;
//
//        for(int row = 0; row < rows ; row++){ // accessing rows
//            for(int col = 0; col<cols;col++){ // accesing col...
//                System.out.print(arr[row][col]+" "); // printing 2d array elements
//            }
//            System.out.println();
//        }

        //---------------------Addition of two matrix----------------
//        int rows = 3;
//        int cols = 3;
//
//        int[] a1 = {2, 4, 6};
//        int[] a2 = {8, 10, 12};
//        int[] a3 = {14, 16, 18};
//
//        int[] b1 = {2, 4, 6};
//        int[] b2 = {8, 10, 12};
//        int[] b3 = {14, 16, 18};
//
//        int[][] mat1 = {a1,a2,a3};
//        int[][] mat2 = {b1,b2,b3};
//
//        int[][] resultMat = new int[rows][cols];
//
//        for(int row = 0; row<rows;row++){
//            for(int col= 0; col<cols;col++){
//                resultMat[row][col] = mat1[row][col] + mat2[row][col];
//            }
//        }
//
//        for(int row = 0; row<rows; row++){
//            for(int col=0; col<cols; col++){
//                System.out.print(resultMat[row][col]+ " ");
//            }
//            System.out.println();
//        }


        //---------------------Boundry Traversal of matrix----------------

//        Scanner sc =new Scanner(System.in);
//        int testCases = sc.nextInt();
//
//        for(int cases = 0; cases < testCases; cases++){
//            int rows = sc.nextInt();
//            int cols = sc.nextInt();
//            int[][] matrinx = new int[rows][cols];
//            for(int row=0; row<rows; row++){
//                for(int col=0; col<cols; col++){
//                    matrinx[row][col] = sc.nextInt();
//                }
//            }
//            for(int row=0; row<rows; row++){
//                for(int col=0; col<cols; col++){
//                    System.out.print(matrinx[row][col]+" ");
//                }
//                System.out.println();
//           }
//
//            for(int col=0; col<cols;col++){
//                System.out.print(matrinx[0][col]+" ");
//            }
//            for(int row = 1; row<rows;row++){
//                System.out.print(matrinx[row][cols-1]+" ");
//            }
//            if(rows != 1){
//                for(int col=cols-2;col>=0;col--){
//                    System.out.print(matrinx[rows-1][col]+" ");
//                }
//            }
//
//            if (cols != 1) {
//                for(int row=rows-2;row>=1;row--){
//                    System.out.print(matrinx[row][0]+" ");
//                }
//            }
//
//        }


        //---------------------Simple determinantes of matrix----------------

//        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
//        int rows = 2;
//        int cols = 2;
//        int[][] matrix = new int[rows][cols];
//
//        for(int row=0;row<rows;row++){
//            for(int col=0;col<cols;col++){
//                matrix[row][col] = sc.nextInt();
//            }
//
//        }
//
//        int ans = matrix[0][0] * matrix[1][1] - matrix[1][0] * matrix[0][1];
//        System.out.println(ans);


//        ArrayList<Integer> l1 = new ArrayList<>(); //dynamic
//
//        l1.add(10);
//        l1.add(52);
//        l1.add(9);
//        l1.add(5);
//
//        l1.add(0, 99); //update or modifify
//        l1.remove(0); // remove value form index
//        l1.set(0, 77); // this will insert in the place of index(add new value and remove previous on)
//        System.out.println(l1);
//        System.out.println(l1.get(2)); // get the value from the index


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i=0; i<arr.length; i++){
//            System.out.print(arr[i]+" ");
//        }
//        int indx = sc.nextInt();
//
//        System.out.println(findIndex(arr, indx));


//

//        ArrayList obj = new ArrayList();
//        obj. add("A");
//        obj. add("B");
//        obj. add("C");
//        obj. add(1, "D");
//
//        System.out.println(obj);


//        String s = "Java String Quiz";
//        System.out.println(s.charAt(s.toUpperCase().length()));


//        Scanner sc = new Scanner(System.in);
//        String word = sc.next();
//        int n = word.length();
//
//        for(int i=1;i<=n;i+=2){
//            if(i%2==1){
//                System.out.print(word.charAt(i-1)+" ");
//            }
//        }

        //---------------------Reverse character string----------------


//        Scanner sc = new Scanner(System.in);
//        String word = sc.next();
//
//        char[] arr = word.toCharArray(); // converting into array
//
//        int n = word.length(); // storing length into n
//
//        for(int i=0;i<n/2;i++){
//            char temp = arr[i];
//            arr[i] = arr[n-i-1];
//            arr[n-i-1] = temp;
//        }
////        String reversed = new String(arr); // --------------both are fine
//        word = new String(arr);              //---------------
//
//        System.out.println(word);


        //---------------------Largest odd number string----------------

//        String word = "6487986545";
//        System.out.println(word.substring(2,5));

        //---------------------Largest odd number string----------------

//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int cols = sc.nextInt();
//
//        int[][] arr = new int[rows][cols];
//
//        for(int row=0;row<rows;row++){
//            for(int col=0;col<cols;col++){
//                arr[row][col]=sc.nextInt();
//            }
//        }


        //---------------------tiny string----------------
//
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        String t = sc.next();
//
//        int min = s.charAt(0);
//        int max = t.charAt(0);
//
//        for(int i=0;i<s.length();i++){
//            if(min>s.charAt(i)){
//                min = s.charAt(i);
//            }
//        }
//        for(int i=0;i<t.length();i++){
//            if(max>t.charAt(i)){
//                max = t.charAt(i);
//            }
//        }
//
//        if(min<max){
//            System.out.println("YES");
//        }
//        else{
//            System.out.println("NO");
//        }


        //---------------------👌👌👌Merging array list👌👌👌----------------


        //worst


//        Scanner sc = new Scanner(System.in);
//        int len1 = sc.nextInt();
//        int len2 = sc.nextInt();
//
//        ArrayList<Integer> arr1 = new ArrayList<>();
//        ArrayList<Integer> arr2 = new ArrayList<>();
//
//        for(int i=0;i<len1;i++){
//            int num = sc.nextInt();
//            arr1.add(num);
//        }
//
//        for(int i=0;i<len2;i++){
//            int num = sc.nextInt();
//            arr2.add(num);
//        }
//
//        int indx = sc.nextInt();
//        arr1.addAll(indx, arr2);
//        int len = arr1.size();
//        for(int i=0;i<len;i++){
//            System.out.print(arr1.get(i)+" ");
//        }


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        ArrayList<Integer> arr = new ArrayList<>();
//        for(int i=0;i<n;i++){
//            int num = sc.nextInt();
//            arr.add(num);
//        }
//        System.out.println(arr);


        //--------------------------Sub array printing--------------------


//        int[] arr = {1, 2, 3};
//        int n = arr.length;
//
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                for (int k = i; k <= j; k++) {
//                    System.out.print(arr[k] + " ");
//                }
//                System.out.println();
//            }
//        }


        //--------------------------Taking input in arraylist--------------------

//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
//        int n = sc.nextInt(); // size of an array
//        for(int i=0;i<n;i++){
//            int num = sc.nextInt(); // declairing new var storing values
//            arr.add(num);           // storing values in arrlist
//        }
//        System.out.println(arr);  //printing


        //--------------------------finding index of element--------------------

//        Scanner sc = new Scanner(System.in);
//        ArrayList<Integer> arr = new ArrayList<>();
//        int n = sc.nextInt(); // size of an array
//        for(int i=0;i<n;i++){
//            int num = sc.nextInt(); // declairing new var storing values
//            arr.add(num);           // storing values in arrlist
//        }
//        int indx = sc.nextInt();
//        System.out.println(arr.indexOf(indx));
//        System.out.println(arr);  //printing


        //--------------------------find min max in array--------------------


//        Scanner sc = new Scanner(System.in);
//        int testCases = sc.nextInt();
//        while (testCases-- > 0){
//            int n = sc.nextInt();
//            int[] arr = new int[n];
//            for(int i=0;i<n;i++){
//                arr[i]= sc.nextInt();
//            }
//            int min = arr[0], max = arr[0];
//            for(int i=1;i<n;i++){
//                if(arr[i] < min){
//                    min = arr[i];
//                }
//                if(arr[i] > max){
//                    max = arr[i];
//                }
//            }
//            System.out.println(max+" "+min);
//        }


        //--------------------------Check wether minus values contains or not in array--------------------

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        boolean isContains = false;
//        for(int i = 0; i < n; i++){
//            if(arr[i] < 0){
//                isContains = true;
//                break;
//            }
//        }
//        if(isContains == true){
//            System.out.println("Yes");
//        }
//        else{
//            System.out.println("No");
//        }


        //--------------------------removing first eleement in array--------------------

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        for(int i=1;i<n;i++){
//            System.out.println(arr[i]+" ");;
//        }


        //--------------------------row with max ones--------------------


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
//
//        int[][] arr = new int[n][m];
//
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                arr[i][j] = sc.nextInt();
//            }
//        }
//        int maxOneIndex = 0, maxOnesCount = 0;
//        for(int row=0;row<n;row++){
//            int ones = 0;
//            for(int col=0;col<m;col++){
//                if(arr[row][col] == 1){
//                    ones++;
//                }
//            }
//            if(ones > maxOnesCount){
//                maxOnesCount = ones;
//                maxOneIndex= row;
//            }
//        }
//        System.out.println(maxOneIndex);

        //--------------------------Transpos of matrix❌❌❌❌--------------------

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[][] arr = new int[n][n];
//
//        for(int row=0;row<n;row++){
//            for(int col=0;col<n;col++){
//                arr[row][col] = sc.nextInt();
//            }
//        }
//        for(int row=0;row<n;row++){
//            for(int col=0;col<n;col++){
//                System.out.println(arr[col][row]);
//            }
//        }


        //--------------------------frequency--------------------


//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        // Read n integers into an array
//        for (int i = 0; i < n; i++) {
//            int val = sc.nextInt();
//            arr[val] = arr[val]+1;
//        }
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]!= 0){
//                System.out.println(i+" "+arr[i]);
//            }
//        }


        //--------------------------Rms--------------------


//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//        double sum = 0;
//
//
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//            sum = sum + (arr[i] * arr[i]);
//        }
//        int len = arr.length;
//        double mean = sum/len;
//        double sqr = Math.sqrt(mean);
//        System.out.printf("%.6f",sqr);


        //--------------------------Sum of sub arrays--------------------

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] nums = new int[n];
//        for(int i=0;i<n;i++){
//            nums[i] = sc.nextInt();
//        }
//        long sum = 0;
//        for(int i=0;i<n;i++){
//            sum += nums[i] * (i + 1) * (n - i);
//        }
//        System.out.println(sum);


        //--------------------------Alternate Sum product even odd--------------------

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        int[] arr = new int[n];
//
//        for(int i=0;i<n;i++){
//            arr[i] = sc.nextInt();
//
//        }
//
//        int sum = 0;
//        int product = 1;
//
//        for(int i=1;i<=n;i++) {
//            if(i % 2 == 0){
//                sum = sum + arr[i-1];
//            }
//            else {
//                product *= arr[i-1];;
//            }
//        }
//
//        System.out.println(sum+" "+product);


        //--------------------------count digits in number--------------------


//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while (t-- > 0) {
//            int num = sc.nextInt();
//            int count = 0;
//            while (num > 0){
//                count++;
//                num /= 10;
//            }
//            System.out.println(count);
//        }

        //--------------------------sum on digits--------------------

//        int sum = 0;
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        while(n > 0){
//            sum = sum + n % 10;//This adds the last digit of n to the sum variable.
//                                // The % operator is the modulus operator,
//                                // which returns the remainder of the division operation.
//                                // So n % 10 gives the last digit of n.
//
//            n = n / 10;//This updates the value of n by removing the last digit. This is done by dividing n by 10.
//        }
//        System.out.println(sum);


        //--------------------------pangram checking string--------------------


//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//
//        for(int i=0;i<t;i++){
//            String str = sc.next();
//            int tcheck = 1;
//            int charcheck = 0;
//
//            for(char ch = 'a'; ch <= 'z'; ch++){
//                charcheck = 0;
//                for(int k=0;k<str.length();k++){
//                    if(str.charAt(k) == ch){
//                        charcheck = 1;
//                    }
//                }
//                if(charcheck == 0){
//                    tcheck = 0;
//                }
//            }
//            System.out.println(tcheck);
//        }


        //--------------------------🫱🫱🫱🫱REcursion🫱🫱🫱🫱--------------------
//          print();
//        for(int i=0;i<3;i++){
//            print();
//            return;
//        }

    }

//    public static void print(){
//        System.out.println("hello");
//        print();
//    }


    //--------------------------🫱🫱🫱🫱Find It🫱🫱🫱🫱--------------------


//        Scanner sc = new Scanner(System.in);
//
//        long k = sc.nextLong();
//
//        long result = -1;
//            for(long x = 1; x*x+3*x <= k; x++){
//            if( k== x*x + 3*x){
//                result=x;
//                break;
//            }
//        }
//            System.out.println(result);






}