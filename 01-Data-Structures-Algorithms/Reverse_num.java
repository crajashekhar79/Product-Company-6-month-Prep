
public class Reverse_num {

    public static int rev_num(int num ){

         int result = 0;

         while( num != 0 ){

             int last = num % 10;

             result = (result * 10) + last;

              num = num / 10 ;





         }
         return result ;

    }

    public static void main(String[] args) {

          int n = 852452;

        System.out.println(rev_num(n));


    }
}