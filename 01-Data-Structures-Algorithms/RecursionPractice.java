public class RecursionPractice {
    public static void main(String[] args) {

        int n = 5;
        System.out.println("Sum of n natural numbers:- " + sum(n));
        System.out.println("Factorial of a Number :- " + factorial(n));
        printnumsnto1(n);
        System.out.println();
        printnums1ton(n);
        System.out.println();
        System.out.println(sumofdigitsinanumber(12345));
        System.out.println(reverseanumber(12345));
//        System.out.println(countdigits(12345,0));

    }

    static int sum( int n ){
        if( n == 0 ){
            return 0;
        }

        return n+sum(n-1);
    }

    static int factorial ( int n ){
        if( n == 1 ){
            return 1;
        }

        return n * factorial(n-1);
    }

    static void printnumsnto1( int n ){
        if( n == 0 ){
            return;
        }
//        Before recursion = work happens while going DOWN.
        System.out.print(n+" ");
        printnumsnto1(n-1);


    }

    static void printnums1ton( int n ){
        if( n == 0 ){
            return;
        }
//        After recursion = work happens while coming BACK UP.
        printnums1ton(n-1);
        System.out.print(n+" ");
    }

    static int sumofdigitsinanumber( int num ){

          if( num == 0 ){
              return 0;
          }
          int last = num % 10;
          num = num / 10;

          return last + sumofdigitsinanumber(num);
    }

    static  int countdigits( int num,int count ){

        if ( num == 0 ){
            return count ;
        }
        num = num / 10;

        return countdigits( num ,count+1 );
    }

    static int powerOf10(int count) {

        if (count == 0) {
            return 1;
        }

        return 10 * powerOf10(count - 1);
    }


   static int  reverseanumber( int num ){

            // 1234

            if( num == 0 ){
                return 0 ;
            }
            int last = num % 10;
            num = num /10;
            int count = countdigits(num,0);

           return last * powerOf10(count) + reverseanumber(num);
    }
}
