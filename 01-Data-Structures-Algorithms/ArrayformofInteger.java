import java.util.ArrayList;
import java.util.List;

public class ArrayformofInteger {
    public static void main(String[] args) {
        int[] num = {1,2,0,3};
        int k = 253;
        System.out.println(addToArrayForm(num,k));


    }

    static List<Integer> addToArrayForm(int[] num, int k) {
       List<Integer>  list = new ArrayList<>();

        int sum = 0  ;

        for( int i = 0 ; i < num.length ; i++ ){
            sum = (sum + num[i]) * 10 ;
        }

        int sum2  = sum / 10;
        int sum3 = sum2 + k;

        //System.out.println(sum3);
        String st = Integer.toString(sum3);

        for( int i = 0 ; i < st.length() ; i++ ){

            list.add(st.charAt(i) - '0');
        }

        return list;


    }
}
