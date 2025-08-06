class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if (p.length() > s.length()) return res;

        int[] pCount = new int[26];  // frequency of characters in p
        int[] sCount = new int[26];  // frequency in current window of s

        // Build initial frequency map for p and first window of s
        for (int i = 0; i < p.length(); i++) {
            pCount[p.charAt(i) - 'a']++;
            sCount[s.charAt(i) - 'a']++;
        }

        // Check the first window
        if (Arrays.equals(pCount, sCount)) {
            res.add(0);
        }

        // Slide the window across the string s
        for (int i = p.length(); i < s.length(); i++) {
            // Remove leftmost character of previous window
            sCount[s.charAt(i - p.length()) - 'a']--;
            // Add new character on the right
            sCount[s.charAt(i) - 'a']++;

            // Check for anagram match
            if (Arrays.equals(pCount, sCount)) {
                res.add(i - p.length() + 1);
            }
        }

        return res;
    }
}
