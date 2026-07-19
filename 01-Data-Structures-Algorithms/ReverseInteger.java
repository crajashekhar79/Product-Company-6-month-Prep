public class ReverseInteger {

    public static void main(String[] args) {

        int num = 1534236469;

        System.out.println(reverseint(num));

    }

    static int reverseint( int num ){

        int result = 0;

        while( num  != 0 ){

             int last = num % 10;

             result = (result * 10)+ last;

             num = num / 10;
        }

        if( result == Integer.MAX_VALUE / 10 || result == Integer.MIN_VALUE / 10){
            return 0;
        }

        return result ;


    }

}
