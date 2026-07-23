import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

                int[] arr = {5, 2, 4, 1, 3};

                selectionSort(arr);
        System.out.println("Selection sort:-");

                System.out.println(Arrays.toString(arr));
            }

            static void selectionSort(int[] arr) {

                for (int i = 0; i < arr.length - 1; i++) {

                    // Assume the current index has the minimum value
                    int minIndex = i;

                    // Find the minimum element in the unsorted part
                    for (int j = i + 1; j < arr.length; j++) {

                        if (arr[j] < arr[minIndex]) {
                            minIndex = j;
                        }
                    }

                    // Swap only if a smaller element was found
                    if (minIndex != i) {
                        int temp = arr[i];
                        arr[i] = arr[minIndex];
                        arr[minIndex] = temp;
                    }
                }
            }
}



