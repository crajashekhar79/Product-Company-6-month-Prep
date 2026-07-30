public class Racursion {

    public static void main(String[] args) {
        num(0);
    }

    static void num( int n ){

        System.out.println(n);
        num1(1);
       // System.out.println("This is printing after printing all the other fucnctions");

    }
    static void num1( int n ){

        System.out.println(n);
        num2(2);

    }
    static void num2( int n ){

        System.out.println(n);
        num3(3);

    }
    static void num3( int n ){

        System.out.println(n);
        num4(4);

    }
    static void num4( int n ){

        System.out.println(n);

    }

}
