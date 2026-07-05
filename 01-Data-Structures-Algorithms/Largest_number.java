import java.sql.SQLOutput;
import java.util.Scanner;
public class Largest_number{


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:-");
        int num = sc.nextInt();

        int c = 2;
        while( (c * c) < num ){

            if(num % c ==0){
                System.out.println("Given number is not a prime");
                break;
            }
           c+=1;


        }
        System.out.println();



    }
}