public class OddEvenCount {

    public static void main(String[] args) {

        int[] arr = {8,5,4,0,9,7,3,0};
        int[] arr2 ={};
        oddevencount(arr2);

    }

    static void oddevencount(int[] arr){
        if( arr.length == 0){
            System.out.println("Enter a valid array");
            return;
        }
        int even = 0;
        int odd = 0;

        for( int i = 0; i < arr.length; i++){
            if( arr[i] != 0 && arr [i] % 2 == 0){
                even++;
            }else if ( arr[i] != 0){
                odd++;
            }
        }

        System.out.println("Even Count:- "+even);
        System.out.println("Odd Count :- "+odd);


    }
}
