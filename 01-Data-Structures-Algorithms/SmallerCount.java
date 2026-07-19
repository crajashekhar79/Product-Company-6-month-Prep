import java.util.Arrays;

public class SmallerCount {

    public static void main(String[] args) {

        int[] arr = {7,7,7,7,7};

        int[] count = new int[ arr.length ];

        for ( int i = 0 ; i < arr.length ; i++  ){
            int c = 0;
            for (int k : arr) {
                if (k < arr[i]) {
                    c = c +1;
                }
            }
            count[i] = c;
        }
        System.out.println(Arrays.toString(count));
    }
}