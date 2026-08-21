public class RotateImage {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        rotate(arr);
        for (int[] nums : arr) {
            for (int num : nums) {
                System.out.print(num+" ");
            }
            System.out.println();
        }


    }
    public static void rotate(int[][] matrix){
       int n = matrix.length;

        for( int r = 0; r < n ; r++ ){
            for( int c = r+1 ; c < n ; c++ ){

               int temp = matrix[r][c];
               matrix[r][c] = matrix[c][r];
               matrix[c][r] = temp;

            }
        }

        for (int r = 0; r < n; r++) {

            int left = 0;
            int right = n - 1;

            while (left < right) {

                int temp = matrix[r][left];
                matrix[r][left] = matrix[r][right];
                matrix[r][right] = temp;

                left++;
                right--;
            }
        }
    }


    }

