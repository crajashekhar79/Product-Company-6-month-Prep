
public class Reverse_num {

    public static int rev_num(int x ){

         int result = 0;

         while( x != 0 ){

             int last = x % 10;

             if(result > Integer.MAX_VALUE / 10 ||
                     result < Integer.MIN_VALUE / 10 ||
                     (result == Integer.MAX_VALUE / 10 && last > 7) ||
                     (result == Integer.MIN_VALUE / 10 && last < -8)){
                 return 0;
             }

             result = (result * 10) + last;

              x = x / 10 ;





         }
         return result ;

    }

    public static void main(String[] args) {

          int n = 852452;

        System.out.println(rev_num(n));


    }
}