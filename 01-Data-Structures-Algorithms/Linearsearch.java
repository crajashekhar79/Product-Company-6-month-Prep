import java.sql.SQLOutput;

// This program demonstrates how Linear search algorithm works.
public class Linearsearch {

    public static void main(String[] args) {

        int[] arr = {5,3,9,3,82,2,15};
        int target = 3;

        System.out.println(Find_an_Element(arr,target));
        element_exists(arr,target);
        System.out.println(occurences(arr, target));
        System.out.println(largest(arr));
        System.out.println(smallest(arr));
        System.out.println(first_even_number(arr));
        System.out.println("All indices");
        find_all_indices(arr,target);
       second_largest(arr);



    }

    static int Find_an_Element(int[] arr , int target){

        if( arr.length == 0){
            return -1;
        }

        for( int i = 0; i < arr.length ; i++){
            if( arr[i] == target){
                return i;
            }
        }
        return -1;





    }

    static void element_exists(int [] arr , int target){
        if( arr.length == 0){
            System.out.println("Array is empty");
        }

        int result = 0;

        for( int i =0 ; i < arr.length; i ++ ){
            if( arr[i] == target){
                result = arr[i];
            }

        }

        if( result == target){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }
    }

    static int occurences( int[] arr , int target){

        if ( arr.length == 0){
            return -1;
        }

        int count = 0;

        for( int i = 0 ; i < arr.length ; i++){
            if( arr[i] == target){
                count ++;
            }
        }
        return count;


    }

    static int largest ( int[] arr ){

        if ( arr.length == 0){
            return -1;
        }

        int largest = arr[0];

        for( int i = 1 ; i < arr.length ; i++){
            if( arr[i] > largest){
                largest = arr[i];
            }
        }

        return largest;
    }

    static int smallest ( int[] arr){
        if ( arr.length == 0){
            return -1;
        }
        int smallest = arr[0];

        for( int i = 0; i < arr.length ; i++ ){
            if( arr[i] < smallest){
                smallest = arr[i];
            }

        }

        return smallest;
    }

    static  int first_even_number(int[] arr) {
        if (arr.length == 0) {
            return -1;
        }
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                index = i;
                break;
            }
        }
    return index;
    }

    static void find_all_indices( int[] arr , int target  ){

        if ( arr.length == 0){
            System.out.println("Array is empty");
        }

        for( int i = 0 ; i < arr.length ; i++ ){
            if( arr[i] == target){
                System.out.println(i);
            }
        }

    }

    static void second_largest( int[] arr ) {

        if (arr.length == 0) {
            System.out.println("invalid Array");
            return;
        }
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {

                sec_largest = largest;

                largest = arr[i];

            } else if ((arr[i] > sec_largest) && (arr[i] != largest))
            {
                sec_largest = arr[i];
            }
        }


        if (sec_largest == Integer.MIN_VALUE) {
            System.out.println("No second largest element");
        } else {
            System.out.println("Second largest: " + sec_largest);
        }


    }

}
