package first_phase.sliding_windows;

public class SlidingWindowG4Gone {

    static int maxSum(int array[], int arraySize, int sizeOfCounter){
        // arraySize must be greater
        if (arraySize <= sizeOfCounter) {
            System.out.println("Invalid");
            return -1;
        }

        // Compute sum of first window of size sizeOfCounter
        int max_sum = 0;
        for (int i = 0; i < sizeOfCounter; i++)
            max_sum += array[i];

        // Compute sums of remaining windows by
        // removing first element of previous
        // window and adding last element of
        // current window.
        int window_sum = max_sum;
        for (int i = sizeOfCounter; i < arraySize; i++) {
            window_sum += array[i] - array[i - sizeOfCounter];
            max_sum = Math.max(max_sum, window_sum);
        }

        return max_sum;
    }

    public static void main(String[] args){
//        int arr[] = {5, 2, -1, 0, 3};

        int arr[] = {5, 7, 1, 4, 3, 6, 2, 9, 2};

//        int k = 3;

        int k = 5;

        int n = arr.length;
        System.out.println(maxSum(arr, n, k));
    }
}
