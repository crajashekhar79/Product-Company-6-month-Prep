import java.util.Arrays;

public class BubbleandBinary {
    public static void main(String[] args) {


        int[] arr = {2, 1, 4, 5, 3, 8, 7,-1,0};
        //int[] nums = {1,2,3,5,6,7,8};
        int target = 5;
        Bubblesort(arr);
        System.out.println("Bubble sort:-");
        System.out.println(Arrays.toString(arr));
        System.out.println("Binary Search :-");
        System.out.println(BinarySearch(arr,target));
    }

    static void Bubblesort( int[] arr ){

        for( int i = 0; i < arr.length -1; i++ ){
            for( int j = 0; j < arr.length -i-1 ; j++ ){
                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static int BinarySearch( int [] arr , int target ){

        int start = 0;
        int end = arr.length-1;

        while( start <= end ) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;

    }
}
