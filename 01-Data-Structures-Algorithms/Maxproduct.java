public class Maxproduct {

    public static void main(String[] args) {

        int[] arr = {3,4,5,2};
        System.out.println(maxProduct(arr));

    }

    static int maxProduct(int[] nums) {
   // This is my solution runtime = 5ms;
        /*int prd = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int p = (nums[i] - 1) * (nums[j] - 1);
                if (p > prd) {
                    prd = p;
                }
            }
        }
        return prd;*/

// Leetcode top solutions runtime = 0 ms;
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i:nums){
            if( i>max ){
                smax=max;
                max=i;
            }else if(i>smax){
                smax=i;
            }
        }
        return (max-1)*(smax-1);
    }
}