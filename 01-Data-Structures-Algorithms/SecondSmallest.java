public class SecondSmallest {
    public static void main(String[] args) {

        int[] arr = {-5,-2,-8,-1};
        System.out.println(secondsmallest(arr));



    }
    static int secondsmallest( int[] arr ){

        if( arr.length == 0){
            return  -1;
        }

        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;

        for( int i = 0; i < arr.length ; i++){
             if( arr [i] < smallest){
                 second_smallest = smallest;
                 smallest = arr[i];
             }else if ( arr[i] < second_smallest && arr[i] != smallest){
                 second_smallest = arr[i];
             }


        }
        if( second_smallest == Integer.MAX_VALUE){
            return -1;
        }
return second_smallest;

    }
}
