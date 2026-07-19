import  java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        // This code demonstrates the implementation of switch case.

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a your id number:-");

       // String fruit = in.next();

        //Enhanced Switch case

       /* switch( fruit ){
            case "Mango"  -> System.out.println("King of fruits!");
            case "Orange" -> System.out.println("Orange colour fruit which tastes sweet!");
            case "Apple"  -> System.out.println("Red colour sweet fruit!");
            case "Cherry" -> System.out.println("Red colour small fruit1");
            case "Pomegranate" -> System.out.println("A fruit with hard outer layer and contains red colour seeds inside!");
            default -> System.out.println("Please enter a valid fruit name");



        } */

        // Traditional  switch case

      /*  switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("Red colour fruit with sweet taste");
                break;
            case "Banana":
                System.out.println("Yellow/Green colour fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit name");
        } */

        // Nested switch case

        int empid = in.nextInt();
        String dep =  in.next();

        switch (empid){
            case 1:
                System.out.println("Rajendra");
                break;
            case 2:
                System.out.println("Rajasekhar");
                break;
            case 3:
                switch (dep){
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Please Enter a valid department name");
                }

                break;
            default:
                System.out.println("Enter a valid id number");


        }








    }

}