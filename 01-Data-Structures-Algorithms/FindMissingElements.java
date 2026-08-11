import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMissingElements {

    public static void main(String[] args) {

//        int[] arr = {1,5,2,4};
       int[] arr1 = {7,8,9,12};

       System.out.println( findMissingElements(arr1));
       // System.out.println(Arrays.toString(arr));




    }

    static List<Integer> findMissingElements(int[] nums) {



        for(int i = 0; i <= nums.length - 1; i++ ){
            for( int j = 0; j < nums.length-i-1; j++ ){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
        List<Integer> ls = new ArrayList<>();


        int first = nums[0];
        int last = nums[nums.length - 1];

        for (int i = first; i <= last; i++) {

            boolean found = false;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                ls.add(i);
            }
        }

        return ls;
    }
}
