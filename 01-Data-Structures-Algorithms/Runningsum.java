import java.util.Arrays;

public class Runningsum {

    public static void main(String[] args) {

        int[]  arr = {1,2,3,4};

        System.out.println(Arrays.toString(runningsum(arr)));

    }

    static  int[] runningsum( int[] arr) {
        int n = arr.length;

        int[] result = new int[n];

        for ( int i = 0; i < n ; i++ ){
           if( i == 0){
               result[i] = arr[0];
           }else{
               result[i] = result[i-1] + arr[i];
           }
        }

        return result;

    }

}
