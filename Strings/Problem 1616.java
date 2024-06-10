//https://leetcode.com/problems/split-two-strings-to-make-palindrome/solutions/3131713/java-solutions-explained/
class Solution {
    public boolean checkPalindromeFormation(String a, String b) {
        // either way of split should give us a palindrome
        //prefix a suffix b or suffix a prefix b
        return cut(a, b) || cut(b, a);
    }

    // method to match letters from both ends
    private boolean cut(String a, String b) {
        int start = 0, end = a.length() - 1;

        // converge from both ends till we have same letters
        while (start < end && a.charAt(start) == b.charAt(end)) {
            start++;
            end--;
        }

        // the case when we surpassed the mid point from both ends
        if (start >= end) return true;


        // the case when there is still a substring left in between
        // or say we didn't reach the mid point
        // we will check if that substring is a palindrome or not
        return isPalindrome(a, start, end) || isPalindrome(b, start, end);
    }

    // method to check if a string is palindrome
    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }

        return true;
    }
}
