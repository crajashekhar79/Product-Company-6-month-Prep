public class TwoPow {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(twopow(n));

    }

    static boolean twopow( int n ){

        if ( n == 1 ){
            return true;
        }

        int ans = 0 ;

        while( n <= 0 ){
            int ref = n / 2;
            ans = ref;
            n = n/2;
        }


     return ans == 0;
    }
}
