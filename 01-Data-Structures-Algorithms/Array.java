import java.util.Arrays;

public class Array{

    static int[] buildarray( int [] arr){

        int n = arr.length;

        for ( int i = 0 ; i < arr.length; i++){

            arr[i] = arr[arr[i] % n] % n ;
        }

        return  arr;

    }
    public static void main(String[] args) {

       int[] arr = {1,3,0,2,4,5};

       int[] result = buildarray(arr);

        System.out.println(Arrays.toString(result));

        utility();


    }

    static void utility(){
        int n = 7;
        int old = 3;
        int n_ew = 5;

        int encoded = old + n_ew * n;

        System.out.println(encoded);
        System.out.println(encoded % n);
        System.out.println(encoded / n);


    }

}