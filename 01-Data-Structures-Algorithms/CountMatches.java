import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class CountMatches {
    public static void main(String[] args) {


    }
    static int countmatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int column ;
        int count = 0;

        if(ruleKey.equals("type")){
            column = 0;
        }else if( ruleKey.equals(("color"))){
            column = 1;
        }else{
            column = 2;
        }
        for (int i = 0; i < items.size(); i++) {

            if (ruleKey.equals(items.get(i).get(column))) {
                count++;
            }
        }


        return count;

}}
