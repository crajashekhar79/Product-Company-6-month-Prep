import java.util.Arrays;

public class ProductExceptItself {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};

        System.out.println(Arrays.toString(productarray(arr)));

    }

    static int[] productarray( int[] nums ){

        int[] ans = new int[ nums.length ];

        for( int i = 0 ; i < nums.length ; i ++ ){
            int product = 1 ;

            for( int j = 0 ; j < nums.length ; j ++ ){
                if( i != j ){
                    product = nums[j] * product;
                }

            }
            ans[i] = product;
        }


     return ans;
    }
}
