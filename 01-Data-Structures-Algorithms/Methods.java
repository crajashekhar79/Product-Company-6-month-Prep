import java.util.Scanner;
public class Methods {

    static int Maximum(int a , int b, int  c){

        if( a > b && a > c){

            return a;
        }else  if ( b > a && b > c){
            return b;
        }else{
            return c;
        }
    }

    static int Minimum ( int a , int b , int c){

        if( a < b && a < c){
            return a ;

        }else if ( b < a && b < c)
        {
            return b;
        }else {
            return c;
        }
    }
    static void even_odd(int num){

        if ( num % 2 == 0){

            System.out.println( num+" is an  EVEN number " );
        }else{

            System.out.println( num+" is an ODD number " );
        }

    }
static void voteeligitbility( int age ){

        if ( age <= 0 ){

            System.out.println( "Please Enter valid age of the voter " );
        }else if ( age >= 18 ){

            System.out.println( "You are eligible to vote " );
        }else {
            System.out.println( "You are not eligible to vote , wait till you turn 18 " );
    }
    }

 static int sum( int a , int b ){
        return a + b;
 }
 static int product ( int a , int b ){

        return a * b;
 }
static void grades( int marks ){

        /*Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */

        if ( marks <= 40 ){
            System.out.println("Fail");
        }else if ( marks >= 91 && marks <= 100  ){
            System.out.println("AA");
        }else if ( marks >= 81 && marks <= 90){
            System.out.println("AB");
        }else if ( marks >= 71 && marks <= 80){
            System.out.println("BB");
        }else if ( marks >= 61 && marks <= 70 ){
            System.out.println("BC");
        }else if ( marks >= 51 && marks <= 60){
            System.out.println("CD");
        }else {
            System.out.println("DD");
        }



}











    public static void main(String[] args) {

        Scanner sc = new Scanner( System.in );

        System.out.println( "Enter your marks :-" );

        int marks  = sc.nextInt();
        //int b = sc.nextInt();
        //int c = sc.nextInt();

        //System.out.println("The Maximum  of three numbers :- "+Maximum(a,b,c));
       // System.out.println("The Minimum of three numbers :- "+ Minimum(a,b,c));
       // System.out.println();
       // even_odd(a);

       // voteeligitbility(a);

        // System.out.println("The sum of "+a+" and "+ b + " = "+ sum( a, b ));
        //System.out.println("The product of "+a+" & "+b+" ="+ product(a,b));
        grades(marks);







    }
}
