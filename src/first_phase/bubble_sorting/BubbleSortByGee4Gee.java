package first_phase.bubble_sorting;

// Optimized java implementation of Bubble sort
import java.io.*;
import java.util.Arrays;

public class BubbleSortByGee4Gee {


    // An optimized version of Bubble Sort
    static void bubbleSort(int arr[], int length){
        int counter = 0;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < length - 1; i++) {
            swapped = false;
//            for (j = 0; j < length - i - 1; j++) {
            for (j = 0; j < length - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    counter++;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }

        System.out.println("Counter is: " + counter);
    }

    // Function to print an array
    static void printArray(int arr[], int size){
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[]){
//        int arr[] = { 64, 34, 25, 12, 22, 11, 90 };
        int arr[] = { 83, 17, 42, 95, 6, 61, 28, 74, 39, 52, 11, 88, 33, 67, 24, 79, 45, 13, 56, 91, 38, 72, 5, 49, 84, 21, 63, 97, 30, 58, 14, 76, 47, 22, 69, 35, 81, 9, 54, 93, 26, 48, 71, 16, 60, 37, 85, 43, 8, 66};
        int n = arr.length;

        printArray(arr, n);

        bubbleSort(arr, n);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}
