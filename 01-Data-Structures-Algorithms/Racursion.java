import java.util.Scanner;

public class Racursion {

    public static void main(String[] args) {

          int n = 1;
          print(n);





    }

   static void print( int n ){
        if( n == 5 ){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        print(n+1);

    }
}
