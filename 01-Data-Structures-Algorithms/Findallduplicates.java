import java.util.ArrayList;
import java.util.List;

public class Findallduplicates {

    public static void main(String[] args) {

        int[] arr = { 4,3,2,7,8,2,3,1 };

        System.out.println(finddups(arr));

    }
    static List<Integer> finddups(int[] nums ) {

        int i = 0;

        while (i <= nums.length) {

            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }

        }
        List<Integer> list = new ArrayList<>();
        /*for( int j = 0; j < nums.length ; j ++ ){



            if( nums[j] != {
                list.add(nums[j]);
            }
        }*/

    return list;
    } 
    
}
