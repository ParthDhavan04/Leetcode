class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // Edge case: empty input array
        if (strs.length == 0) {
            return new ArrayList();
        }

        // This map will group anagrams under the same key
        Map<String, List> ansMap = new HashMap<>();

        // Temporary array to count letter frequency
        int[] count = new int[26];

        // For each string in the input
        for (String s : strs) {

            // Reset the count array for each new string
            Arrays.fill(count, 0);

            // Count frequency of each character
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                count[c - 'a']++;
                // used to convert a character into a zero-based index between 0 and 25, which corresponds to its position in the English alphabet.
            }

            // Build a unique key from the count array
            // Example: "#1#0#0#1..." means 'a' appears once, 'b' 0 times, 'c' 0, 'd' once, etc.
            StringBuilder sb = new StringBuilder("");//same as new StringBuilder()
            for (int i = 0; i < 26; i++) {
                sb.append("#"); // Delimiter to avoid ambiguity like "11" vs "1#1"
                sb.append(count[i]);
            }
            //We use "#" to separate numbers, because without it:
            //#11 could mean: 1 occurrence of 'a', and 1 of 'b', or 11 of 'a'?

            // Key example for "eat" → "#1#0#0#0#1#0...#1" (for 'a'=1, 'e'=1, 't'=1)
            String key = sb.toString();

            // If key not seen before, initialize a new list
            if (!ansMap.containsKey(key)) {
                ansMap.put(key, new ArrayList());
            }

            // Add the current string to the corresponding anagram group
            ansMap.get(key).add(s);
        }

        // Return the grouped anagrams as a list of lists
        return new ArrayList(ansMap.values());
    }
    //Time: O(n * k)
}
