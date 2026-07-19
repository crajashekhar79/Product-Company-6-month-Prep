public class Countones {

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,0,0,0,0,0,0,0};
        System.out.println(countone(arr));




    }
    static int countone( int[] arr ){

        if( arr.length == 0 ){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;

        while ( start <= end ){

            int mid = start + ( end - start )/2;

            if ( arr[mid] == 0){
                end = mid;
            }else{
                return mid + 1;
            }
        }

        return  -1;

    }







}
