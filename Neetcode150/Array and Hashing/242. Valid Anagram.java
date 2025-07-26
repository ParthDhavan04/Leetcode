class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        //creating an array to count char freq
        int[] charCounts=new int[26];

        //increment counter for each char in 's' and decrement counter for each char in 't'
        for(int i=0;i<s.length();i++){
            charCounts[s.charAt(i) - 'a']++;
            charCounts[t.charAt(i) - 'a']--;
        }

        //check if all the counts are zero
        for(int i=0;i<charCounts.length;i++){
            if(charCounts[i] != 0){
                return false;//all have to be zero but there can be +ve and -ve values present too
            }
        }
        return true;
        // time o(n) and space o(1)
    }
}
