class Solution {
    public int characterReplacement(String s, int k) {

    /*
        Approach: Sliding Window with Frequency Count
        --------------------------------------------------
        Steps:
        1. Create an array `occurrence[26]` to store frequencies of uppercase letters A-Z.
        2. Initialize a sliding window with two pointers: `left` and `right`.
        3. For each character at `right`:
            a. Increment its count in `occurrence`.
            b. Update `maxOcc`, the count of the most frequent character in the window.
            c. If (window size - maxOcc > k), it means we need more than `k` changes → shrink window by moving `left`.
            d. Else, update the answer with the size of the current valid window.
        4. Return the maximum window length stored in `ans`.

        Time: O(n), where n is the length of the string.
        Space: O(1), since `occurrence` size is fixed at 26.
    */

        int[] occurrence = new int[26];  // Array to store frequency of each uppercase character
        int left = 0;
        int maxOcc = 0;                  // Frequency of the most common character in the current window
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            // Increase the count of the current character
            occurrence[s.charAt(right) - 'A']++;

            // Update maxOcc: max frequency of a single character in the window
            maxOcc = Math.max(maxOcc, occurrence[s.charAt(right) - 'A']);

            // If number of characters to change (window size - maxOcc) > k, shrink the window
            while ((right - left + 1) - maxOcc > k) {
                occurrence[s.charAt(left) - 'A']--;  // Remove the leftmost char
                left++;  // Shrink the window from the left
            }

            // Update the answer with the size of the current valid window
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
