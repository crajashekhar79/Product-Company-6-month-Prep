import java.util.Arrays;

public class BubbleSort {


    public static void main(String[] args) {

        int[]  arr = { 0,1,0,2,0,1,2,2};
        bubble(arr);
        System.out.println("Bubble Sort :-");
        System.out.println(Arrays.toString(arr));

    }

    static void bubble( int[] nums ){

        boolean swapped;

        for( int i = 0; i < nums.length ; i++ ){
            swapped = false;

            for( int j = 1; j < nums.length-i ; j++ ){

                if( nums[j] < nums [ j -1]){
                    int temp = nums[j];
                    nums[j]  = nums[j-1];
                    nums[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }

    }
}
