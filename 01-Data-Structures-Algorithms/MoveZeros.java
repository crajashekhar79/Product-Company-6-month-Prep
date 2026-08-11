import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int[] arr = {-1,0,2,3,0,-5,8};

        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void moveZeroes(int[] nums){
          // The solution my brain gave
          for( int i = 0 ;i < nums.length ; i++ ){
              for( int j = i + 1; j< nums.length ; j++ ){
                  if( nums[j] != 0 && nums[i] == 0 ){
                      int temp = nums[i];
                      nums[i] = nums[j];
                      nums[j] = temp;
                  }
              }
          }
      // This one is the top answer on leetcode
       /* int i = 0;

        for( int j = 0 ; j< nums.length ; j++ ){
            if( nums[j] != 0 ){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
       i++;
            }
        }*/

    }
}
