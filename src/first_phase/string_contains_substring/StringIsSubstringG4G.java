package first_phase.string_contains_substring;


// Java program to check if a string is substring of other
// using nested loops
public class StringIsSubstringG4G {


    // Function to find if pat is a substring of string
    static int findSubstring(String string, String pattern) {
        int n = string.length();
        int m = pattern.length();

        // Iterate through string
        for (int i = 0; i <= n - m; i++) {

            // Check for substring match
            int j;
            for (j = 0; j < m; j++) {

                // Mismatch found
                if (string.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // If we completed the inner loop, we found a match
            if (j == m) {

                // Return starting index
                return i;
            }
        }

        // No match found
        return -1;
    }

    public static void main(String[] args) {
        String txt = "geeksforgeeks";
        String pat = "eks";
        System.out.println(findSubstring(txt, pat));

    }
}
