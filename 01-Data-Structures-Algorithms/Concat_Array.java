import java.util.Arrays;

public class Concat_Array {

    static int[] concat( int[] nums ){
        int n = nums.length;
        int[] arr = new int[n * 2];

        for( int i = 0 ; i < nums.length ;i++){

            arr[i] = nums[i];
            arr[i+n] = nums[i];
        }

        return arr;

    }

    public static void main(String[] args) {

        int[] arr = {2,3,5,6};

        System.out.println(arr.length);

        int[]  result = concat(arr);

        System.out.println(Arrays.toString(result));

    }
}
