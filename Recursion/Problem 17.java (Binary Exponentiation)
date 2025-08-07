class Solution {
    public List<String> letterCombinations(String digits) {
        // Edge case: if input is empty, return an empty list
        if (digits.equals("")) {
            return new ArrayList<>();
        }

        // Initial call to recursive function with an empty answer string
        return solve("", digits);
    }

    // Recursive helper function
    // p: the processed part (current combination being built)
    // up: the unprocessed part (remaining digits)
    List<String> solve(String p, String up) {
        // Base case: if no more digits to process, return the current combination
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);  // Add the built string to the result
            return list;
        }

        // Convert current digit (first char of unprocessed) to its integer value
        int digit = up.charAt(0) - '0';

        // Start index for letters corresponding to this digit (based on 'a' offset)
        int i = (digit - 2) * 3;

        // Digits after 7 have a shift in the mapping due to extra letters
        if (digit > 7) {
            i += 1; // shift forward to adjust mapping for digits 8 and 9
        }

        // Determine how many letters this digit maps to
        int len = i + 3;  // by default, 3 letters

        // Digits 7 and 9 have 4 letters (e.g., 7 → "pqrs", 9 → "wxyz")
        if (digit == 7 || digit == 9) {
            len += 1; // so we add 1 extra
        }

        ArrayList<String> list = new ArrayList<>();

        // Loop from start index to end index to get all mapped letters
        for (; i < len; i++) {
            char ch = (char)('a' + i);  // Convert index to actual character
            // Recur for next digit with current letter added to the prefix
            list.addAll(solve(p + ch, up.substring(1)));
        }

        return list;
    }
}
