import java.util.Arrays;
import java.util. ArrayList;


public class TransposeMatrix {
    public static void main(String[] args) {

        int[][] matrix = {{8,-1,5},
                          {4, 5,2 },
                         {-3,-14,9}};

        System.out.print((transposemat(matrix)));

    }


    static  ArrayList<ArrayList<Integer>> transposemat( int [][] matrix ){
          int n = matrix.length;
        // Create a result matrix of size n x n
        ArrayList<ArrayList<Integer>> tMat = new ArrayList<>();

        // Fill the transposed matrix by
        // swapping rows with columns
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                // Assign transposed value
                row.add(matrix[j][i]);
            }
            tMat.add(row);
        }

        return tMat;
    }

}
