//import java.util.Scanner;

public class Nested_Loops{
    public void printpattern(){
        int num = 5;
        for (int i = 1; i <= num; i++){
            for(int k = 1; k <= i; k++){
                System.out.print(k);
            }

            System.out.println();
        }


    }

    public void printpatternrev(){
        int num = 5;
        for (int i =num; i>=1; i--){
            for (int k = 1; k<=i; k++){
                System.out.print(k);
            }
            System.out.println();
        }

    }
    public static void main(String[] args){

        Nested_Loops obj = new Nested_Loops();
        obj.printpattern();
        obj.printpatternrev();

    }



}