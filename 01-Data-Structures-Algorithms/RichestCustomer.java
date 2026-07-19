public class RichestCustomer {

    public static void main(String[] args) {

        int[][] arr = {{5, 6, 2}, {2, 3, 2}, {1, 4, 5}};

        System.out.println(maximumwealth(arr));


    }
    static int maximumwealth(int[][] accounts ){
        int richest = 0;


        for( int row = 0; row < accounts.length ; row++ ){
            int sum =0;
            for( int col = 0; col < accounts[row].length ; col++){
                sum += accounts[row][col];
            }
            if( sum > richest){
                richest = sum;
            }
        }
        return richest;
    }

    }



