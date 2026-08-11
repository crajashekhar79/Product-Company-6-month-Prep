public class FindThirdMaxNum {
    public static void main(String[] args) {

        int[] arr = {5,2,4,1,3}; // 0,-2,-15
        System.out.println(findmaxnum(arr));

    }

    static int  findmaxnum( int[] nums ){
        long lnum = Long.MIN_VALUE;
        long snum = Long.MIN_VALUE;
        long tnum = Long.MIN_VALUE;
        int i =0;


        while( i <= nums.length-1 ){
            if( nums[i] == lnum || nums[i] == snum || nums[i] == tnum){
                i++;
                continue;
            }
            else if ( nums[i] > lnum ){
                tnum = snum;
                snum = lnum;
                lnum = nums[i];

            }else if  (nums[i] > snum ) {
                tnum = snum;
                snum = nums[i];
            }else if( nums[i] > tnum ){
                tnum = nums[i];
            }
            i++;
        }


        if( tnum == Long.MIN_VALUE ) {
            return (int) lnum;
        }
        return (int) tnum;
    }
}
