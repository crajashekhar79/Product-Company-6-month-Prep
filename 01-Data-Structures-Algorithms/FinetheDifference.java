public class FinetheDifference {
    public static void main(String[] args) {

         String s = "abcd";
         String t = "abcde";
        int[] count = new int[26];


        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }


        for (int i = 0; i < t.length(); i++) {
            count[t.charAt(i) - 'a']--;

            if (count[t.charAt(i) - 'a'] < 0) {
                System.out.println(t.charAt(i));
            }
        }

        System.out.println(' ');





    }
}
