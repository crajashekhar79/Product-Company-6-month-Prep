public class LengthOftheLastWord {

    public static void main(String[] args) {

        String str = "Hello World";
        System.out.println("Length of str: "+str.length());
        System.out.println(lenoflastword(str));


    }

    static int lenoflastword( String s ){

        int r = s.length() - 1;
        int l = 0;

        while( l < r ){
            char c = s.charAt(r);
            if( c == ' '){
                r--;
            }else{
                break;
            }
        }
        int x = r;
        while( l <= r ){
            char c = s.charAt(r);
            if( c == ' '){
                break;
            }else{
                r--;
            }
        }

        int y = r ;
        return x - y;

    }

}
