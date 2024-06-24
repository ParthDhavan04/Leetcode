class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int c=0;
        for(int i=0; i<words.length; i++)
        {
            boolean b = true;
            char[] ch = words[i].toCharArray();
            for(int j=0; j<ch.length;j++)
            {
                if(allowed.indexOf(ch[j])==-1)
                {
                   b = false;
                   break; 
                }
            }

            if(b) c++;
        }
        return c;
    }
}
