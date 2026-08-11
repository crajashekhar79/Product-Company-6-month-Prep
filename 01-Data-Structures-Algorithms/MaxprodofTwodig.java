import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxprodofTwodig {

    public static void main(String[] args) {

        int n = 315425145;
        System.out.println(maxprod(n));
        System.out.println(digitprod(n));


    }

    static int maxprod( int num ){


        List<Integer> ls = new ArrayList<>();

        while( num >= 1 ){
            int rem = num % 10;
            ls.add(rem);
            num = num / 10;
        }

        int[] arr = ls.stream().mapToInt(Integer::intValue).toArray();

        int ans = 0;

        for ( int i = 0; i < arr.length ; i++ ){
            for( int j = i+1; j < arr.length ; j++  ){
                int prod = arr[i] * arr[j];

                if( prod > ans ){
                    ans = prod;
                }
            }
        }

        return ans ;

    }


    static int digitprod( int num ){
         int largest = 0;
         int seclarge = 0;

         while(  num > 0 ){
             int curr = num % 10;

             if ( curr > largest ){
                 seclarge = largest;
                 largest = curr;
             }else if( curr > seclarge ){
                 seclarge = curr;
             }
             num = num /10;
         }

         return largest * seclarge;



    }
}
