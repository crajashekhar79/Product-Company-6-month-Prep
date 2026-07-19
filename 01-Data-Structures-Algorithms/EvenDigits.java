public class EvenDigits {

    public static void main(String[] args) {

        int[] arr = {1521,15,200,2004};

        System.out.println(evendigits(arr));

    }

    static  int evendigits( int[] nums ){

        int c  = 0;

        for( int i = 0 ; i < nums.length ; i++) {
            int count = 0;
            int num = nums[i];
            while (num != 0) {
                int rm = num / 10;
                num = rm;
                count++;
            }
            if( count % 2 == 0){
                c++;
            }
        }
       return c;
    }
}
