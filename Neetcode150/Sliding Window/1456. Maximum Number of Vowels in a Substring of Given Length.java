class Solution {
    public int maxVowels(String s, int k) {
    
        String vowels = "aeiou";
        
        // Initialize current vowel count and max count
        int currCount = 0;
        int maxCount = 0;

        // Count vowels in the first window of size k
        for (int i = 0; i < k; i++) {
            // Check if current character is a vowel
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currCount++; // Increase vowel count
            }
        }

        // Initialize maxCount with the count from the first window
        maxCount = currCount;

        // Slide the window from index k to end of string
        for (int i = k; i < s.length(); i++) {
            // Add the new character at the end of the window
            if (vowels.indexOf(s.charAt(i)) != -1) {
                currCount++; // It's a vowel, increment count
            }

            // Remove the character that is no longer in the window
            if (vowels.indexOf(s.charAt(i - k)) != -1) {
                currCount--; // It was a vowel, decrement count
            }

            // Update the maxCount if current window has more vowels
            maxCount = Math.max(maxCount, currCount);
        }

        // Return the maximum number of vowels found in any window
        return maxCount;
    }
}
