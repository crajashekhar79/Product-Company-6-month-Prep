public class RemoveDuplicates {
    public static void main(String[] args) {
    int[] arr = {1,2,1,3,4,5};
        System.out.println(removedupls(arr));



    }

    static int removedupls( int [] nums ){

        if( nums.length == 0 ){
            return  0;
        }

        int w = 1;

        for ( int r = 1; r < nums.length ; r++){
            if( nums[r] != nums[r-1]){
                    nums[w] = nums[r];
                    w++;
            }
        }
        return w;

    }
}
