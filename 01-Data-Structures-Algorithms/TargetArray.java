import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {

    public static void main(String[] args) {
    int[] nums = {0,1,2,3,4};
    int[] indices = {0,1,2,2,1};

    System.out.println(Arrays.toString(targetarray(nums,indices)));
      // output :- [0,4,1,3,2]

    }

    static int[] targetarray( int[] nums , int[] indices ){

        ArrayList<Integer> arr = new ArrayList<>(nums.length);

        for( int i = 0; i < nums.length; i++ ){
             arr.add(indices[i],nums[i]);
        }

        int[] result = new int[nums.length];

        for( int j = 0; j < result.length ; j++){
            result[j] = arr.get(j);
        }

        return result;
    }
}
