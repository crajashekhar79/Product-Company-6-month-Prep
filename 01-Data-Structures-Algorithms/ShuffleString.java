public class ShuffleString {
    public static void main(String[] args) {

        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};

        System.out.println( shufflestring( s,indices ));

    }

    static String shufflestring( String str , int[] indices ){

        int length=str.length();
        StringBuilder sb=new StringBuilder("");
        char c[]=new char[length];

        for(int i=0;i<length;i++){

            c[indices[i]]=str.charAt(i);

        }
        sb.append(c);
        return sb.toString();
    }
}
