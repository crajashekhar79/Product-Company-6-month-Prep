import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int num = sc.nextInt();
        System.out.println("Pattern-1:-");
        pattern1(num);

        System.out.println("Pattern-2:-");
        pattern2(num);

        System.out.println("Pattern-3:-");
        pattern3(num);

        System.out.println("Pattern-4:-");
        pattern4(num);

        System.out.println("Pattern-5:-");
        pattern5(num);

        System.out.println("Pattern-6:-");
        pattern6(num);

        System.out.println("Pattern-7:-");
        pattern7(num);

        System.out.println("Pattern-8:-");
        pattern8(num);

        System.out.println("Pattern-9:-");
        pattern9(num);

        System.out.println("Pattern-10:-");
        pattern10(num);

        System.out.println("Pattern-11:-");
        pattern11(num);

        System.out.println("Pattern-12:-");
        pattern12(num);

        System.out.println("Pattern-13:-");
        pattern13(num);

        System.out.println("Pattern-14:-");
        pattern14(num);


    }

    static void pattern1(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {

        for (int row = 1; row <= 2 * n; row++) {
            int stars = 0;

            if (row <= n) {
                stars = row;
            } else {
                stars = (2 * n) - row;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n; j++) {

                if (j >= n - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if (j <= i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }


    }

    static void pattern8(int n) {

        for (int i = 0; i < n; i++) {
            int mid = ((2 * n) - 1) / 2;
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j >= mid - i && j <= mid + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    static void pattern9(int n) {

        for (int i = n; i > 0; i--) {
            int mid = ((2 * n) - 1) / 2;
            for (int j = 0; j < 2 * n - 1; j++) {
                if (j >= mid - (i - 1) && j <= mid + (i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    static void pattern10(int n) {
        for (int i = 0; i <= n; i++) {

            for (int j = 0; j <= n - 1; j++) {

                if (j >= n - i) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern11(int n) {

        for( int i = n ; i > 0; i-- ){
            int mid = ((2*n)-1)/2;
            for( int j = 0; j < n ; j++ ){
                if( j>= mid-(i-1) && j <= mid+(i-1) ){
                    System.out.print("*"+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern12( int n ){
        for (int row = 0; row < n; row++) {

            for (int space = 0; space < row; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col < n - row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // Lower Half
        for (int row = 0; row < n; row++) {

            for (int space = 0; space < n - row - 1; space++) {
                System.out.print(" ");
            }

            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }

            System.out.println();
        }

    }
    static void pattern13( int n ){
        for (int i = 0; i < n; i++) {
            int mid = ((2 * n) - 1) / 2;
            for (int j = 0; j < 2 * n - 1; j++) {
                if (i == n -1|| j == mid - i || j == mid + i ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void pattern14( int n ){
        for (int i = 0; i < n; i++) {
            int mid = ((2 * n) - 1) / 2;
            for (int j = (2 * n) - 1 ; j > 0; j-- ) {
                if ( n == i ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
