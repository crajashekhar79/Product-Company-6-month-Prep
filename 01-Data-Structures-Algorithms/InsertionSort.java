import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {3,4,6,1,5,2};
        insertionsort( arr);
        System.out.println("Insertion sort :-");
        System.out.println(Arrays.toString(arr));
    }
    static void insertionsort ( int[] arr ){

        for( int i = 0; i < arr.length - 1  ; i ++ ){
            for( int j = i + 1 ; j > 0 ; j -- ){
                if( arr[j] < arr[j-1]){
                    int temp = arr[j];
                     arr[j] = arr[j-1];
                     arr[j-1] = temp;

                }

                else{
                    break;
                }
            }
        }


    }
}
