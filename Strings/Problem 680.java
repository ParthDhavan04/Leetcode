class Solution {
    public boolean validPalindrome(String s) {
        //Can be palindrome iff
        /*there is only one pair of i, j such that s.charAt(i) != s.charAt(j)
after the different pair hit, we try removing i or j, the characters in middle should be a palindrome.
there is no pair of i, j such that s.charAt(i) != s.charAt(j) */
int start = 0, end = s.length() - 1;
        
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return isPalindrome(s, start + 1, end) || isPalindrome(s, start, end - 1);
            }
            start++;
            end--;
        }

        return true;
    }
    
    /* Check is s[i...j] is palindrome. */
    private boolean isPalindrome(String s, int start, int end) {
        
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        
        return true;
    }
}
