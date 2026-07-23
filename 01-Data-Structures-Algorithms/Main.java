import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        int[] arr = { 4,3,2,7,8,2,3,1 };

        cyclicsort(arr);
        System.out.println(arr);


    }
 static List<Integer> cyclicsort(int[] nums ){


     int index  = 0;
     while( index < nums.length ){
         int correct = nums[index] -1;

         if( nums[index] != nums[correct] ){
             int temp = nums[index];
             nums[index] = nums[correct];
             nums[correct] = temp;
         }
         else{
             index ++ ;
         }
     }

    List<Integer> ans = new ArrayList<>();

     for( int i = 0; i < nums.length ; i ++){
         if( nums[i] != i-1 ){
             ans.add(i+1);
         }
     }

     return ans;

 }

}

