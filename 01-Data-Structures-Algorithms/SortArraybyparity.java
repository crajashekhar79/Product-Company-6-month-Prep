import java.util.Arrays;

public class SortArraybyparity {

    public static void main(String[] args) {

        int[] arr = {3,1,2,4};

        System.out.println(Arrays.toString(sortarraybypar(arr)));

    }


    static int[] sortarraybypar( int[] nums ){
        int slow = 0;

        for (int fast = 0; fast < nums.length; fast++) {

            if (nums[fast] % 2 == 0) {

                int temp = nums[slow];
                nums[slow] = nums[fast];
                nums[fast] = temp;

                slow++;
            }
        }

        return nums;
    }
}



