public class ReduceAnumtoZero {
    public static void main(String[] args) {
        System.out.println(reducenumto0(123));

    }
    static int reducenumto0( int n ){

        int count = 0;

        while( n > 0 ){

            if( n > 1 && n % 2 == 0 ){

                n = n / 2;

            }else{
                n = n - 1 ;
            }
            count ++ ;

        }



     return count;
    }
}
