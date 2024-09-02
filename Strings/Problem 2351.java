class Solution {
    public char repeatedCharacter(String s) {
//For each character in the string, check if it has already been encountered (by checking the boolean array).
//If it has, return that character as it is the first repeating one.
//if it hasn’t, mark it as seen in the boolean array.
        boolean[] b=new boolean[26];
        for(char ch:s.toCharArray())
        {
            if(b[ch-'a'])
            return ch;
            else
            b[ch-'a']=true; 
        }
        return ' ';
    }
}
