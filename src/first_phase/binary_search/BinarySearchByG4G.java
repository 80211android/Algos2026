package first_phase.binary_search;


class GFG {

    static int binarySearch(int arr[], int x) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Check if x is present at mid
            if (arr[mid] == x)
                return mid;

            // If x greater, ignore left half
            if (arr[mid] < x)
                low = mid + 1;

                // If x is smaller, ignore right half
            else
                high = mid - 1;
        }

        // If we reach here, then element was
        // not present
        return -1;
    }

    public static void main(String args[]) {
//        int arr[] = { 2, 3, 4, 10, 40 };
        int arr[] = { 95,698,711,715,732,734,759,778,793,797,802,807,811,816,838,842,858,865,881,889,894,925,947,949,970,983};
//        int x = 10;
        int x = 734;

        int result = binarySearch(arr, x);

        System.out.println("Looking for " + x + " in array");
        if (result == -1)
            System.out.println(
                    "Element is not present in array");
        else
            System.out.println("Element is present at "
                    + "index " + result);
    }
}