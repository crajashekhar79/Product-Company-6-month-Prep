public class Pangram {


    public static void main(String[] args) {

        String sent = "thequickbrownfoxjumpsoverthelazydog";
        String sent2 = "leetcode";

        System.out.println(pangrm(sent2));


    }

    static boolean pangrm( String sent ){

           boolean[] seen = new boolean[26];

           for( int i = 0; i< sent.length(); i++){
               char ch = sent.charAt(i);
               int index = ch -'a';
               seen[index] = true;
           }
           for( int i = 0 ; i < seen.length ; i++ ){
               if ( seen[i] == false)
                   return false;
           }

return  true;

    }
}
