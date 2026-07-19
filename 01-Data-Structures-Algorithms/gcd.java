public class gcd {

    public static int GCD(int a, int b){

        int gcd  = 0;

        for( int i = b ; i > 0 ; i--  ){

            if ( a % i == 0 && b % i == 0){
                gcd = i;
                break;
            }

        }

        return gcd;



    }

    public static void main(String[] args) {

        int a = 12;
        int b = 18;

        System.out.println(GCD( a , b));




    }
}