import java.util.Arrays;

public class SquareRootOfsortedArray {
    public static void main(String[] args) {

        int[]  arr = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(squrerootsorted(arr)));

    }

    static int[] squrerootsorted( int[] nums ){

        for( int i = 0; i < nums.length;i++ ){
            nums[i] = nums[i] * nums[i];
        }

        for(int i = 0; i <= nums.length - 1; i++ ){
            for( int j = 0; j < nums.length-i-1; j++ ){
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;



    }


}
