public class AlternatedigitSum {

    public static void main(String[] args) {

        System.out.println(alternatesum(10));
    }

    static int alternatesum( int n ){

       int sum = 0;
       int count = 1 ;
       while(n > 0 ){
           int last = n % 10 ;

           if( count % 2  == 0 && last != 0 ){
               sum += ( last * -1 );
           }else{
               sum += last;
           }
           n /= 10;
           count ++;

       }

       return sum ;

    }

}
