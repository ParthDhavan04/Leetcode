class Solution {
    public int myAtoi(String s) {

        // Step 1: Remove leading and trailing whitespaces
        s = s.trim();
        if (s.isEmpty()) 
            return 0; // Return 0 if string is empty after trimming

        int i = 0;            // Pointer to iterate through the string
        int sign = 1;         // By default, assume number is positive

        // Step 2: Check for sign character
        if (s.charAt(0) == '-') {
            sign = -1;        // If '-' is found, set sign to negative
            i++;
        } else if (s.charAt(0) == '+') {
            i++;              // If '+' is found, continue without changing sign
        }

        int result = 0;       // This will store the final integer value

        // Step 3: Iterate through characters while they are digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';  // Convert character to integer

            // Step 4: Check for overflow/underflow before adding digit
            // If result * 10 + digit > Integer.MAX_VALUE, it will overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit; // Add digit to result
            i++;                          // Move to next character
        }

        // Step 5: Apply sign to result and return
        return result * sign;
    }
}
