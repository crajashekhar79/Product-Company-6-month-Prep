public class AddDigits {
    public static void main(String[] args) {

        int num = 27;
        System.out.println(adddigits(num));

    }

    static int adddigits( int num ){

        if( num < 10 ){
            return num;
        }


        while( num > 9 ){
            int ans = 0;

            while( num > 0) {
                int last = num % 10;
                ans = last + ans;
                num = num / 10;
            }
            num = ans;

        }


        return num;

    }

}
