import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers {

    public static void main(String[] args) {

        int[] arr = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(arr));


    }

   static List<Integer> findDisappearedNumbers(int[] nums){

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
           if( i!= nums[i]-1 ){
               ans.add(nums[i]);
           }
       }

       return ans;










   }
}
