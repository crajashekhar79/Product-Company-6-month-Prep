import java.util.Scanner;

public class FibanacciNum {

    public static void main(String[] args) {



        int n = 1;

        int a = 0;
        int b = 1;

        for (int i = 1; i < n; i++) {

            int  c = a +b;
            a = b;
            b = c;

        }
        System.out.println(b);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int N = sc.nextInt();

        printfibo(N);

        System.out.println(fact(N));





    }

    static void printfibo( int n ){

        int a = 0;
        int b = 1;

        int count = 5;

        while( count >= a ){

            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;

        }
    }


    static int fact( int n ){

        if( n == 0 ){
            return n;
        }
        int fac = 1;
        while( n >= 1 ){
            fac = fac * n;

            n--;

        }

        return fac;
    }

    static int recurfib( int n ){

        if( n == 0 || n == 1 ){
            return n ;
        }

        return recurfib(n-1)+recurfib(n-2);
    }
}