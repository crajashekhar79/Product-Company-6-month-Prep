public class GoodPairs {

    public static void main(String[] args) {
        int[] arr = {1,1,1,1};

        System.out.println(goodpairs(arr));
    }

    static int goodpairs( int[] arr ){
        int ans = 0;

        for ( int i = 0; i < arr.length ; i++ ){
            for ( int j = i+1 ; j < arr.length ; j++){
                if ( arr[i] == arr[j]){
                    ans ++;
                }
            }
        }

      return ans;

    }
}
