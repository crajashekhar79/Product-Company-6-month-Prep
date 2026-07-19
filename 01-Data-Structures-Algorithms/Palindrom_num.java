

public class Palindrom_num {

    public static boolean ispalindrom(int n) {
        int original = n;
        int ref = 0;

        while (n != 0) {

            int last = n % 10;
            ref = (ref * 10) + last;

            n = n / 10;

        }

        return ref == original;


    }

// count no.of digit in a number

    public static int count(int n) {

        if ( n <= 0){
            return  0 ;
        }

        int c = 0;

        while ( n != 0 ){
            int last = n % 10;
            c ++;
            n = n / 10;

        }
        return c ;

    }

// To check if the given number is Armstrong number or not

    public static boolean armstrong(int  n ){
          int original = n ;

          int ref = 0;

          while ( n != 0 ){

              int last = n % 10;

              ref = ( last * last * last ) + ref ;

              n = n / 10;


          }

          return  ref == original;

    }

    // sum of the digits in a number

    public static int sumOfDigits(int n){

        int sum = 0;

        while ( n!= 0){

            sum += ( n % 10);
            n = n / 10;
        }
        return sum;

    }

  // Product of digits

  public static int product( int  n ){

        int product = 1;

        while( n != 0 ){

            product *= n % 10;

            n = n / 10;


        }
        return product;
  }







    public static void main(String[] args) {

        int n = 1001;
        int arrm = 235;

        System.out.println("Palindrome:- "+ispalindrom(n));

        System.out.println("No.of digits :- "+count(n));

        System.out.println("Armstrong number :- " +armstrong(arrm));

        System.out.println("Sum of digits:- "+sumOfDigits(arrm));

        System.out.println("Product of the digits in a given number:-"+ product(arrm));

    }
}