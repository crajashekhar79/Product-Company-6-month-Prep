import java.util.Arrays;

public class LargestTwiceofOThers {

    public static void main(String[] args) {

        int[] arr = {3,6,1,0};
        System.out.println(dominantIndex(arr));

    }

    static  int dominantIndex(int[] nums){

       boolean swapped ;

        for( int i = 0; i < nums.length ; i++ ){
            swapped = false;

            for( int j = 1; j < nums.length ; j++ ){
                if( nums[j] < nums[j-1] ){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

       int i  = 0;
        while(i == nums.length){
            i++;
             int count = 0;
             int n = nums.length-1;
             int largest = nums[n];
             int prod = nums[i] * nums[i];
                if( (i != n) &&  ( prod == largest) ){
                    count ++;
                }

             return count ;
        }
        return -1;

    }


}
