import java.util.Scanner;

public class BitwiseOperators {
    public static void main(String[] args) {

//        int a = 5; // 101
//        int b = 4; // 100
//        System.out.println("Bitwise AND :- "+ (a & b) ); //o/p = 100
//        System.out.println("Bitwise OR :- "+ (a | b )); // O/P = 101
//        System.out.println("Bitwise XOR :- "+ ( a ^ b )); // O/P = 001
//        System.out.println("Any number XOR by 0 gives number it self:- "+( 0^a ));
//        System.out.println(a^a);
//        System.out.println(~a); // ~x = -(x+1) ~5 = -(5+1)
//        System.out.println(a << 1 );
//        System.out.println(a << 2);
//        System.out.println(a >> 1 );
//
//        a = a ^ b;
//        b = a ^ b ;
//        a = a ^ b;
//        System.out.println( a+" "+b) ;
//
//        int n = 8; // Even numbers binary ends always with 0 and odd with 1
//
//        if ((n & 1) == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//
// The most commonly tested bitwise tricks are:
//
//Check if a number is even: (n & 1) == 0
//Multiply by powers of 2: n << k
//Divide by powers of 2 (positive numbers): n >> k
//
//Swap two numbers without a temporary variable using XOR:
//a = a ^ b;
//b = a ^ b;
//a = a ^ b;
        // checks if the number is power of 2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number:-");
//        int n = sc.nextInt();
//        System.out.println(Integer.toBinaryString(n));
//        System.out.println(Integer.toBinaryString(n-1));
//        System.out.println(n & (n-1));
//        boolean ans = (n & (n-1)) == 0;
//        System.out.println(ans);
//
//        if( (n & 1) == 0){
//            System.out.println("Even");
//        }else{
//            System.out.println("Odd");
//        }
//        int m = 5;
//
//        m = m ^n ;
//        n = m ^n;
//        m = m ^n;
//
//        System.out.println("m: "+m+" n:"+n);

//      Calculate power of a number
        int base = 2;
        int power = 5;

        int ans = 1;

        while( power > 0 ){
            if( (power & 1) == 1 ){
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }

        System.out.println(ans);


        int a = 8 >> 1;

        System.out.println(a);
        System.out.println(8/2);


    }
}
