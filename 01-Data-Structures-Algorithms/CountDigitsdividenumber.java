public class CountDigitsdividenumber {

    public static void main(String[] args) {
         int num = 785 ;
        System.out.println(countdigits(num));

    }

    static  int countdigits( int num ){
        int ref = num ;

        int count  = 0;

        while( num > 0 ){

            int last = num % 10 ;

            if( ref % last  == 0){
                count ++;
            }
            num /= 10;
        }

       return count ;
    }

}
