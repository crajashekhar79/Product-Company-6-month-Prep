public class DefangingIP {
    public static void main(String[] args) {

        String str = "1.1.1.1";
        System.out.println(defandip(str));

    }

    static String defandip( String address ){

        /*String answer = "";
        for( int i = 0; i < address.length() ; i++ ){
            char ch = address.charAt(i);
            if( ch == '.'){
                answer = answer +"[.]";
            }else{
                answer = answer+ch;
            }
        }
        return  answer ;*/

        address = address.replace(".","[.]");

        return address;
    }
}
