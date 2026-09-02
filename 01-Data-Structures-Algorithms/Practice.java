import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.Scanner;
class Human{
    String name;
    int age ;
    static long population;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        Human.population +=1;
    }
}

public class Practice {
    public static void main(String[] args) {
        Human h = new Human("Raj",27);
        Human h1 = new Human("Vinod",25);
        System.out.println(h.name+":"+h.age+":"+Human.population);
        System.out.println(h1.name+":"+h1.age+":"+Human.population);


//        pad("","12");
//
//        char[] ch = {'h','e','l','l','o'};
//
//        reversestring(ch,0,ch.length-1);
//
//        for( int i = 0; i < ch.length ; i++ ){
//            System.out.print(ch[i]+" ");
//        }
//        System.out.println();
//
//        System.out.println("Sum of digits :- "+sumofdigits(12345));
//
//        System.out.println("Number of zeros :- "+countnumofzeros(1020205));
//
//        System.out.println("Product of digits :- "+prodofdigits(523));
//
//        System.out.println("Reverse of a number :- "+reveresenum(1234,0));
//
//       int[] nums = {8,2,3,4,6};
//        System.out.println(smallestk(nums,2));
//
//        System.out.println(romantoInt( "LVIII"));
//        Scanner sc = new Scanner(System.in);
//        sc.nextDouble();

//        int n = 4;
//        boolean[][] board = new boolean[n][n];
//        System.out.println(queens(board, 0));

//        int[] arr = {3,4,-1,1};
//        int[] arr1 = {1,2,0};
//        System.out.println(misspos(arr1));
        String str = "Raja";
        //System.out.println(largestOddNumber(str));
        System.out.println(reversestr(str));

        String s = "banana";
        System.out.println(skip("",s,'a'));


    }

    // No return type here
    static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            skip(p, up.substring(1));

        } else {
            skip(p + ch, up.substring(1));
        }
    }

    // To return a String
    static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return " ";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    public static boolean checkPerfectNumber(int num) {
        int sum = 0;
        int i = 1;
        while (i < num) {
            if (num % i == 0) {
                sum = sum + i;
                i++;
            } else {
                i++;
            }
        }
        return sum == num;
    }

    public static int[] getNoZeroIntegers(int n) {
        int a = 1;
        int b = n - 1;
        int[] result = new int[2];

        while (a > n) {
            int cura = a;
            int curb = b;
            while (cura > 0) {
                int last = cura % 10;
                if (last == 0) {
                    a++;
                    break;
                } else {
                    result[0] = a;
                }
                cura = cura / 10;
            }
            while (curb > 0) {
                int last = curb % 10;
                if (last == 0) {
                    b--;
                    break;
                } else {
                    result[1] = b;
                }
                curb = curb / 10;
            }

        }

        return result;

    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutations(f + ch + s, up.substring(1));
        }
    }

    static void pad(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; //converts '2' to 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch = (char) ('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static void reversestring(char[] s, int left, int right) {

        if (left >= right) {
            return;
        }
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        reversestring(s, left + 1, right - 1);


    }

    static int sumofdigits(int num) {
        if (num == 0) {
            return 0;
        }
        int last = num % 10;
        return last + sumofdigits(num / 10);

    }

    static int countnumofzeros(int num) {
        if (num == 0) {
            return 0;
        }

        int last = num % 10;

        if (last == 0) {
            return 1 + countnumofzeros(num / 10);
        } else {
            return countnumofzeros(num / 10);
        }


    }

    static int prodofdigits(int num) {
        if (num == 0) {
            return 1;
        }
        int last = num % 10;
        return last * prodofdigits(num / 10);
    }

    static int reveresenum(int num, int rev) {

        if (num == 0) {
            return rev;
        }
        int last = (num % 10);
        rev = rev * 10 + last;
        return reveresenum(num / 10, rev);

    }

    static int smallestk(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ans = k;
        while (set.contains(ans)) {
            ans = ans + k;
        }
        return ans;
    }

    static int romantoInt(String s) {

        Map<Character, Integer> mp = new HashMap<>();
        mp.put('I', 1);
        mp.put('V', 5);
        mp.put('X', 10);
        mp.put('L', 50);
        mp.put('C', 100);
        mp.put('D', 500);
        mp.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < s.length(); i++) {

            int curr = mp.get(s.charAt(i));
            int next;

            if (i == s.length() - 1) {
                next = curr;
            } else {
                next = mp.get(s.charAt(i + 1));
            }

            if (curr < next) {
                ans = ans - curr;
            } else {
                ans = ans + curr;
            }

        }
        return ans;

    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        // placing the queen and checking for every row and col
        for (int col = 0; col < board.length; col++) {
            // place the queen if it is safe
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // check vertical row
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }

        // diagonal left
        int maxLeft = Math.min(row, col);
        for (int i = 1; i <= maxLeft; i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }

        // diagonal right
        int maxRight = Math.min(row, board.length - col - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }

        return true;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    static int misspos(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        int ans = 1;
        while (true) {
            if (!hs.contains(ans)) {
                return ans;
            }
            ans++;
        }
    }

//    static String largestOddNumber(String num) {


//        String ans = "";
//
//        while ( true ) {
//            int num1 = 0;
//            for( int i = num.length()-1; i >0 ; i-- ){
//                char ch = num.charAt(i);
//                int ref = ch - '0';
//                if( i == num.length()-1  && ref % 2 != 0 ){
//                    ans = ans + num;
//                }
//                else if( ref == 0 ){
//                    num1 =
//                }
//                else if( ref % 2 != 0 && ref > num1 ){
//                    num1 = ref;
//                }
//            }
//            if( num1 != 0 ){
//                ans= ans + num1;
//                break;
//            }else {
//                break;
//            }
//        }
//        return ans;
//    }
    static String reversestr( String str ){
//        if( str.isEmpty() ){
//            return "";
//        }
//        char ch = str.charAt(0);
//      return  reversestr(str.substring(1))+ch;
        String ans = "";
        for( int i = str.length()-1 ; i >= 0 ; i-- ){
            char ch = str.charAt(i);
            ans = ans + ch;
        }
        return ans;
    }
    static String skip( String p,String up, char target ){
        if(up.isEmpty()){
            return p;
        }
        char ch = up.charAt(0);
        if( ch == target ){
            return skip(p,up.substring(1),target);
        }

        return skip(p+ch,up.substring(1),target);
    }
}

