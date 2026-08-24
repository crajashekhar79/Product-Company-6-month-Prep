import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        pad("","12");

        char[] ch = {'h','e','l','l','o'};

        reversestring(ch,0,ch.length-1);

        for( int i = 0; i < ch.length ; i++ ){
            System.out.print(ch[i]+" ");
        }
        System.out.println();

        System.out.println("Sum of digits :- "+sumofdigits(12345));

        System.out.println("Number of zeros :- "+countnumofzeros(1020205));

        System.out.println("Product of digits :- "+prodofdigits(523));

        System.out.println("Reverse of a number :- "+reveresenum(1234,0));




    }
    // No return type here
    static void skip( String p , String up ){
        if( up.isEmpty() ){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if( ch == 'a' ){
            skip(p,up.substring(1));

        }else{
            skip(p+ch,up.substring(1));
        }
    }
    // To return a String
    static String skip( String up ){
        if( up.isEmpty() ){
            return "";
        }
        char ch = up.charAt(0);
        if( ch == 'a' ){
            return skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }
    }
   static String skipApple ( String up ){
        if( up.isEmpty()){
            return " ";
        }

        if( up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
   }
    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        int i = 1;
        while( i < num ){
            if( num % i == 0 ){
                sum = sum + i;
                i++;
            }else {
                i++;
            }
        }
        return sum == num;
    }
    public static int[] getNoZeroIntegers(int n) {
       int a = 1;
       int b = n - 1;
       int[] result = new int[2];

       while( a > n ){
           int cura = a ;
           int curb = b ;
           while( cura > 0 ){
               int last = cura % 10 ;
               if( last == 0 ){
                   a++;
                   break;
               }else {
                   result[0] = a;
               }
               cura = cura / 10;
           }
           while( curb > 0 ){
               int last = curb % 10 ;
               if( last == 0 ){
                   b--;
                   break;
               }else{
                   result[1] = b;
               }
               curb = curb / 10;
           }

       }

       return result;

    }

    static void permutations( String p , String up ){
        if( up.isEmpty() ){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for( int i = 0; i <= p.length() ; i++ ){
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutations(f+ch+s, up.substring(1));
        }
    }

    static void pad ( String p , String up ){
        if( up.isEmpty() ){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; //converts '2' to 2
        for( int i = (digit-1) * 3; i < digit * 3; i++ ){
            char ch = (char)( 'a'+i );
            pad( p + ch, up.substring(1) );
        }
    }
    static void reversestring( char[] s , int left , int right ){

        if( left >= right ){
            return;
        }
        char temp = s[left];
        s[left ] = s[right];
        s[right] = temp;
        reversestring( s, left+1 ,right-1);


    }
    static int sumofdigits( int num ){
        if( num == 0 ){
            return 0;
        }
        int last = num % 10;
        return  last + sumofdigits(num/10);

    }

    static int countnumofzeros( int num ){
        if( num == 0 ){
            return 0;
        }

        int last = num % 10;

        if( last == 0){
            return 1 + countnumofzeros(num/10);
        }
        else{
            return countnumofzeros(num / 10);
        }


    }

    static int prodofdigits( int num ){
        if( num == 0 ){
            return 1;
        }
        int last = num % 10;
        return last * prodofdigits(num/10);
    }

    static int reveresenum( int num ,int rev ){

        if( num == 0 ){
            return rev;
        }
        int last = (num % 10) ;
         rev = rev * 10 +last;
        return   reveresenum(num/10,rev);
    }

}

