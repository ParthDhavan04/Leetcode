/**
 * Problem: Check if one string (s1) is a permutation of any substring in another string (s2).
 * 
 * Example:
 *   s1 = "ab"
 *   s2 = "eidbaooo"
 *   → True, because "ba" is a permutation of "ab" and exists in s2
 * 
 * Approach: Sliding Window + Frequency Counting
 * ----------------------------------------------
 * ✅ Why this approach:
 * - A permutation of s1 must have exactly the same character counts as some substring of s2.
 * - Instead of generating all permutations (which is slow), we:
 *     1. Count the frequency of each character in s1.
 *     2. Slide a window of the same length over s2.
 *     3. At each position, compare the frequency of the current window with s1.
 *     4. If they match → permutation found.
 * 
 * ✅ Steps:
 * 1. If s1 is longer than s2 → no match possible → return false.
 * 2. Create an integer array `count[26]` for lowercase letters 'a' to 'z'.
 * 3. For each character in s1, increment count.
 *    For each character in the first window of s2, decrement count.
 *    → This creates a "difference array".
 * 4. If all values in `count` are 0 → first window is a match.
 * 5. Slide the window through s2:
 *      - Subtract the new character entering the window (right end).
 *      - Add back the character exiting the window (left end).
 *      - After each shift, check if count is all zero.
 * 6. If any window matches → return true, else return false.
 * 
 * Time Complexity: O(n) — one pass over s2 with constant 26-letter operations.
 * Space Complexity: O(1) — fixed-size array (26 elements).
 */

public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        
        // Step 1: If s1 is longer, no permutation can exist
        if (len1 > len2) return false;

        // Step 2: Create frequency difference array
        int[] count = new int[26];

        // Step 3: Build the initial difference for s1 and first window of s2
        for (int i = 0; i < len1; i++) {
            count[s1.charAt(i) - 'a']++;   // Add s1 characters
            count[s2.charAt(i) - 'a']--;   // Subtract s2 window characters
        }

        // Step 4: Check if first window matches
        if (allZero(count)) return true;

        // Step 5: Slide the window
        for (int i = len1; i < len2; i++) {
            count[s2.charAt(i) - 'a']--;               // Add new char to window
            count[s2.charAt(i - len1) - 'a']++;         // Remove old char from window
            if (allZero(count)) return true;
        }

        // Step 6: No window matched
        return false;
    }

    // Helper function to check if all values in count are zero
    private boolean allZero(int[] count) {
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}
