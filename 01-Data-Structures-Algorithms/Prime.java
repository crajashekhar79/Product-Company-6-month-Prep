import  java.util.Scanner;
public class Prime {



    public  static boolean prime ( int n ) {

        if ( n <= 1){
            return false;
        }


        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0) {
                return false;


            }

        }
        return true;
    }

                public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number :- ");

        int num = in.nextInt();

        System.out.println( Prime.prime(num) );



    }
}