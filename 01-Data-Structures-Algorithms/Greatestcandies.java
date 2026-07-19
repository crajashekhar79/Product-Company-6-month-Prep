import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Greatestcandies {
    public static void main(String[] args) {

    int[] arr = {2,3,5,1,3};
    int excandi = 3 ;

    List<Boolean> a  = greatestcandies(arr,excandi);

    System.out.println(a);


    }

    static List<Boolean> greatestcandies( int[] arr, int excandies){

        List<Boolean> result = new ArrayList<Boolean>(arr.length);

        for ( int i = 0; i < arr.length ; i++){
            int n = arr[i]+ excandies;
            boolean a = true;
            for ( int j = 0 ; j < arr.length ; j++){
                if ( n < arr[j] ){
                    a = false;
                }
            }
            result.add(a);
        }

   return result;
    }
}
