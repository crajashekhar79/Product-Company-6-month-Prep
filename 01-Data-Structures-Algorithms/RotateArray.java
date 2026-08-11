import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,18,19,20};
        int k = 3;
        rotatearr(arr,k);
        System.out.println(Arrays.toString(arr));




    }

    static void rotatearr ( int[] arr, int k ){

        int n = arr.length;
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);


    }

    static void reverse( int[] nums , int start , int end ) {

        while (start <= end) {

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

    }
}
