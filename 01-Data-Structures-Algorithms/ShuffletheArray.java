import java.util.Arrays;

public class ShuffletheArray {

    public static void main(String[] args) {

        int[] arr = {5,2,3,1,4,6,7,8};
        int n = 4;

        System.out.println(Arrays.toString(shufflearray(arr,n)));

    }

    static int[] shufflearray( int[] arr , int n){

        int[] result = new int[arr.length];

        for ( int i =0; i < n; i++){
            result[2*i] = arr[i];
            result[(2 * i )+1] = arr[n+i];

        }
        return result;
    }

}
