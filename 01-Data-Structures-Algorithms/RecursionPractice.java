public class RecursionPractice {
    public static void main(String[] args) {

//        int n = 5;
//        System.out.println("Sum of n natural numbers:- " + sum(n));
//        System.out.println("Factorial of a Number :- " + factorial(n));
//        printnumsnto1(n);
//        System.out.println();
//        printnums1ton(n);
//        System.out.println();
//        System.out.println(sumofdigitsinanumber(12345));
//        System.out.println(reverseanumber(12345));
////        System.out.println(countdigits(12345,0));
//
//        int[] arr = {1,2,3,0,5,6};
//        System.out.println(sortedArray(arr,0));
//
//        String  s = "abc";
//        subsequences("",s);

        int num = 20202;
        System.out.println("no.of zeroes :- "+countzeros(num,0));
        System.out.println(palindromenum(1250));
//        System.out.println(reverseanum(1250,0));
        System.out.println(proddig(1252));
        System.out.println(sumofn(5));
        System.out.println(powr(2,5));
        System.out.println("count digits:- "+count(1000,0));

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

    static boolean sortedArray( int[] arr, int index ){
        if( index == arr.length -1 ){
            return true;
        }
        return arr[index] <= arr[index + 1] && sortedArray(arr, index+1);

    }
    static void subsequences(String processed, String unprocessed){

        if( unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        subsequences(processed+ch,unprocessed.substring(1) );
        subsequences(processed,unprocessed.substring(1));



    }

    static String reversestr( String str ){
//        if( str.isEmpty() ){
//            return "";
//        }
//        char ch = str.charAt(0);
//      return  reversestr(str.substring(1))+ch;
        String ans = "";
        for( int i = str.length()-1 ; i >= 0 ; i-- ){
            char ch = str.charAt(i);
            ans = ans + ch;
        }
        return ans;
    }

    static String skip( String p,String up, char target ){
        if(up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);
        if( ch == target ){
            return skip(p,up.substring(1),target);
        }

        return skip(p+ch,up.substring(1),target);
    }

    static int countzeros(int num , int count) {
        if (num == 0) {
            return count;
        }
        int last = num % 10;
        if (last == 0) {
            return countzeros(num/10, count + 1);
        }
        return countzeros(num/10,count);
    }

    static boolean palindromenum(int num){

        return num == reverseanum(num,0);
    }

    static int reverseanum( int num,int reverse ){
        if( num == 0 ){
            return reverse;
        }
        int last = num % 10;
        reverse = reverse *  10 + last;

       return   reverseanum(num/10,reverse) ;
    }

    static int proddig( int num ){
        if( num == 0 ){
            return 1;
        }
        int last = num % 10;
        return last * proddig(num/10);
    }

    static int sumofn( int n ){
        if( n == 1 ){
            return 1;
        }
        return n+sumofn(n-1);
    }

    static int powr( int a , int b ){
        if( b == 0 ){
            return 1;
        }

        return a * powr(a, b-1);
    }

    static int count ( int num , int count ){
        if( num == 0 ){
            return count;
        }
        return count(num / 10,count+1);

    }

}
