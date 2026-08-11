public class JewelsStones {

    public static void main(String[] args) {
        String jewels = "aAA";
        String stones = "aAAbbb";

        System.out.println(jands(jewels,stones));

    }

    static int jands( String jewels, String stones ) {

        int result = 0;
        int jl = jewels.length();
        int sl = stones.length();

        for( int i = 0; i < jl; i++ ){
            for( int j = 0; j < sl; j++ ){
                if( jewels.charAt(i) == stones.charAt(j)){
                    result++;
                }
            }
        }

      return result;
    }
}
