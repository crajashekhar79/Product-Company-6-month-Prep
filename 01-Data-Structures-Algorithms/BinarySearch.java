public class BinarySearch {

    public static void main(String[] args) {
       // System.out.println("This program Demonstrates how binary search works.");

        int[] arr = {2,3,5,6,8,11,14,17};
        int target = 52;

        System.out.println( binarysearch( arr,target ));
    }

    static int binarysearch( int[] arr , int target ){

        int start = 0;
        int end = arr.length - 1;

        while(start <= end ){
            int mid = start + ( end - start )/2;
            if( arr[mid] > target ){
                end = mid - 1 ;
            }
            else if( target > arr[mid] ){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
