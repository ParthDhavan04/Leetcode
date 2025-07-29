class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // Edge case: if string is null or empty
        if (s == null || s.length() == 0) {
            return 0;
        }

        // Edge case: single character string
        if (s.length() == 1) return 1;

        int left = 0;  // Start of window
        int right = 0; // End of window
        int ans = 0;   // Maximum length of unique substring

        HashSet<Character> set = new HashSet<>(); // To store unique characters in current window

        // Slide the window
        while (right < s.length()) {
            char c = s.charAt(right);  // Current character

            // If character already in window, move left pointer to remove duplicates
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character and update answer
            set.add(c);
            ans = Math.max(ans, right - left + 1); // Update maximum length
            right++;
        }

        return ans; // Final result
    }
}
