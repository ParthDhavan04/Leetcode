class Solution {
    public String sortSentence(String s) {
        String str[]= s.split(" ");
         String b[] = new String[str.length];
         for(int i=0; i<str.length; i++)
         {
            char p = str[i].charAt(str[i].length()-1);
            //extract digit at last position so length - 1
            int k = p - 48; // convert char to digit as 48 is ASCII value of '0' 
            b[k-1] = str[i].substring(0,str[i].length()-1);
         }

        String ans="";
        for(int i=0; i<str.length; i++)
            ans = ans + b[i] + " ";

        return ans.trim();
    }
}
