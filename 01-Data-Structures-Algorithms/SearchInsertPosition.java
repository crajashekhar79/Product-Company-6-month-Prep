public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr = {3};
//        int target = 5;
//        int target = 2; // Answer = 1;
          int target = 7; // Answer = 4;
        System.out.println(searchinsertpostion(arr,target)); // Answer = 2;


    }

    static int searchinsertpostion( int[] nums, int target ){

        for ( int i = 0; i < nums.length ; i++ ){
            if (target <= nums[i]) {
                return i;

            }
        }

        return nums.length;

    }

}
