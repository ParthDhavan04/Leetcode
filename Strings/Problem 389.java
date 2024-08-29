class Solution {
    public char findTheDifference(String s, String t) {

        char c=t.charAt(0);
        
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }

        for(int j=0;j<t.length();j++){
            freq[t.charAt(j)-'a']--;
            if(freq[t.charAt(j)-'a']<0) 
                c=t.charAt(j);
        }
        return c;
    }
}
