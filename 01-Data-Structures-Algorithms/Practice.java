import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

     int[] arr = {1,8,6,2,5,4,8,3,7};
     System.out.println(maxArea(arr));
     String ransomNote = "aa";
     String magazine = "aab";
        System.out.println(ransom(ransomNote,magazine));

    }

    static  int maxArea( int[] height ){

        int left = 0;
        int right = height.length-1;

        int area = 0;


        while( left < right ){
            int w = right - left ;
            int h = Math.min(height[left] ,height[right]);

            if( w * h > area ){
                area = w * h;
            }
            if ( height[left] < height[right] ){
                left++;
            }
            else {
                right--;
            }

        }

        return area ;

    }

    static boolean ransom( String ransomNote, String magazine ){

        String ref ="";
        //boolean ans ;
        int i = 0;

        while( i < magazine.length()){

            if( ref.equals(ransomNote) ){
                return true;

            }

            ref = ref+magazine.charAt(i);
            i++;
        }


        return false;
    }
}
