import java.util.Arrays;

public class OddValuesMatrix {
//Leetcode problem no.1252
    public static void main(String[] args) {
        int[][] indices = {{0,1},{1,1}};
        int m = 2;
        int n = 3;


        System.out.println(countodd(indices, m , n ));

    }

    static  int countodd(int[][] indices , int m, int n ){
            int[][] matrix = new int[m][n];
        for(  int i = 0 ; i < indices.length; i ++ ){
            int rowindex = indices[i][0];
            int colindex = indices[i][1];

            for( int col = 0 ; col < matrix[rowindex].length ; col++ ){
                matrix[rowindex][col] += 1;
            }

            for( int row  = 0; row < matrix.length ; row++){
                matrix[row][colindex] += 1;
            }
        }
        int count = 0;
        for( int row = 0 ; row < matrix.length ; row ++ ){
            for( int col = 0 ; col < matrix[row].length ; col ++){
                if(matrix[row][col] % 2 != 0){
                    count ++;
                }
            }
        }

    return count;
    }

}
