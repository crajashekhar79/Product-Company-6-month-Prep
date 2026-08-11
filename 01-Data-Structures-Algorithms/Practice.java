import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {


    public static void main(String[] args) {

       // int n = 5;
//        System.out.println(Arrays.toString(countbits(n)));

        int[] arr = {1,2,4,5,6,8};
        int target = 2;
        System.out.println(sorted(arr,0));
        System.out.println(findindex(arr,target,0));
        int[] arr2 = {2,7,9};

        System.out.println(originalnum(arr2,4));

        int[] nums = {3,6,1,0};
        System.out.println("find largest num:-");
        System.out.println(largestelinarray(nums));
        int[] prices = {98,54,6,34,66,63,52,39};
        System.out.println(chockies(prices,62));

        //mergesortedarrays

        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        mergesortedArrays(nums1,m,nums2,n);








    }
static int[] countbits( int n ){

        int[] ans = new int[n+1];

        int i = 0;
     while( i >= n ){

         int ref = i;
         int count = 0;

        while( ref <= 0 ) {

            if ((ref & 1) == 1) {
                count++;
            }
            ref = ref >> 1;

        }
         ans[i] = count;
            i++;
        }

        return ans;

    }

    static boolean sorted ( int[] arr , int index ){
        if( index == arr.length-1 ){
            return true;
        }


        return arr[index] < arr[index+1] && sorted(arr,index+1);

    }

    static int findindex( int[] arr , int target , int index ){

        if( index == arr.length-1 ){
            return -1;
        }

        if( arr[index] == target ){
            return index;
        }
        else{
            return findindex(arr,target,index+1);
        }
    }
    static int originalnum( int[] nums, int original ){

         int  org = original;

        for (int i = 0; i < nums.length - 1; i++) {

            // Assume the current index has the minimum value
            int minIndex = i;

            // Find the minimum element in the unsorted part
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if a smaller element was found
            if (minIndex != i) {
                int temp = nums[i];
                nums[i] = nums[minIndex];
                nums[minIndex] = temp;
            }
        }

        for( int i = 0; i < nums.length ; i++ ){
            if( nums[i] == org ){
                org = org * 2;
            }
        }

        return org;


    }


    static int largestelinarray( int[] nums ){
         int lar = 0;
         int index = 0;


         for( int i = 0; i < nums.length; i++ ){
             lar = Math.max(lar,nums[i]);
             if( nums[i] == lar ){
                 index = i;
             }
         }

         for( int i = 0; i < nums.length ; i++ ){

             if(i != index && nums[i] * 2 > lar){

                 return -1;

             }
         }

   return index ;
    }


    static int chockies( int[] prices , int money ){

        int sum = 100;

        for( int i = 0; i < prices.length ; i++ ){
            for( int j = i+1 ; j < prices.length ; j++ ){
                if( prices[i] + prices[j] < sum ){
                    sum = prices[i] + prices[j];
                }

            }
        }

        if( (money - sum) >= 0 ){
            return money-sum;
        }

     return money;

    }


    static void mergesortedArrays( int [] nums1, int m , int[] nums2 , int n ){

        if( nums2.length <= 1 ){
            System.out.println(Arrays.toString(nums1));
        }


         for( int i = 0; i < nums2.length-1; i++ ){
             nums1[m+i] = nums2[i];
         }

       for( int j = 0; j < nums1.length ; j++ ){
           for( int k = 0; k < nums1.length-j-1 ; k++ ){
               if( nums1[k] > nums1[k+1]){
                   int temp = nums1[k];
                   nums1[k] = nums1[k+1];
                   nums1[k+1] = temp;
               }
           }
       }



    }
}
