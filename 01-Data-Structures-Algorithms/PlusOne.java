import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public static void main(String[] args) {

        int[] arr = {1,2,9};

        System.out.println(Arrays.toString(plusone(arr)));


    }

    static int[] plusone( int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {

            // If digit is less than 9, simply add 1 and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            // If digit is 9, make it 0 and carry to the left
            digits[i] = 0;
        }

        // If all digits were 9, create a new array
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }
}
