import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static void main(String[] args) {

        int[] arr = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(arr));


    }

    static List<List<Integer>> threeSum(int[] nums){


        List<List<Integer>> ans = new ArrayList<>();

        for( int i = 0; i < nums.length ; i++ ){
            for( int j = i+1; j < nums.length ; j++ ){
                for( int k = j+1; k < nums.length ; k++  ){
                    int sum = nums[i] + nums[j] + nums[k];

                    if( sum == 0  ){
                        ans.add(Arrays.asList(
                                nums[i],
                                nums[j],
                                nums[k]
                        ));

                    }
                }
            }
        }





   return ans;
    }


}