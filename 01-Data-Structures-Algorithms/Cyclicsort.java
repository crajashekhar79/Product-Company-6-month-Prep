import java.util.Arrays;

public class Cyclicsort {

    public static void main(String[] args) {
        int[] arr = {4,2,3,1,5};
        cycsort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cycsort( int [] nums ){

       int i =0;
       while( i < nums.length ){
           int correct = nums[i] -1;
           if( nums[i] != nums[correct]){
               int temp = nums[i];
               nums[i] = nums[correct];
               nums[correct] = temp;
           }
           else{
               i++;
           }
       }


    }
}
