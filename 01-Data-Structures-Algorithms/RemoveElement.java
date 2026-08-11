import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

    public static void main(String[] args) {
        int[] arr = {3,2,2,3};
        int value = 2;

        System.out.println(rmelement(arr,value));
        System.out.println(Arrays.toString(arr));
    }

    static int rmelement( int[] nums, int val){

        int i = 0;

        for( int j = 0 ; j< nums.length ; j++ ){
            if( nums[j] != val ){
                nums[i] = nums[j];
                i++;

            }
        }



        return i;


    }

}
