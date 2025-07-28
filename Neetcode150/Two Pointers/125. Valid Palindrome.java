class Solution {
    public boolean isPalindrome(String s) {
        //we can apply two pointers approach instead of reversing and storing this string and then comparing it which
        //give time and space as O(n) 
        //but with 2 pointers time O(n) and space O(1)
        
        if(s == null || s.length() == 0) return true;

        int left = 0;
        int right = s.length()-1;

        while(left<right){
            while(left<right && !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left<right && !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
