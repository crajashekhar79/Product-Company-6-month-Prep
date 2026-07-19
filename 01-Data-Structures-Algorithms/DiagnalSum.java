public class DiagnalSum {
    public static void main(String[] args) {

        int[][] matrix = {{2,3,5},
                          {5,4,2},
                          {2,1,3}};

        System.out.println(diagnalsum(matrix));

    }


    static int diagnalsum(int[][] matrix ){

        int sum = 0 ;

        for( int row = 0; row < matrix.length ; row++){
            for( int col = 0; col < matrix[row].length ; col++){
                if( row  == col ){
                    sum += matrix[row][col];
                }
                else if( row + col == matrix.length-1 ){
                    sum += matrix[row][col];
                }
            }
        }
        return sum;
    }
}
