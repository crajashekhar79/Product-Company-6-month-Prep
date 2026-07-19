import java.util.Arrays;

public class ReverseArray{
    public static void main(String[] args) {

        int[] arr = {5,4,2,1,3,4};
        System.out.println(Arrays.toString(reversearray(arr)));

    }

    static int[] reversearray( int[] arr ) {

        int start = 0;
        int end = arr.length-1;

        while( start <= end ){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;

        }
      return arr;
    }

}
