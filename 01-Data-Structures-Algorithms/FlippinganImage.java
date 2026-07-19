import java.util.Arrays;

public class FlippinganImage {

    //https://leetcode.com/problems/flipping-an-image/description/

    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1},{0,0,0}};

        for( int row = 0; row < image.length ; row++ ){
            int start = 0;
            int end = image[row].length -1;

            while( start < end ){
                int temp = image[row][start];
                image[row][start] = image[row][end];
                image[row][end] = temp;

                start ++;
                end --;
            }

            for ( int col = 0; col < image[row].length ; col ++){
                if( image[row][col] == 1){
                    image[row][col] = 0;
                }else{
                    image[row][col] = 1;
                }

            }
        }
    }
}
