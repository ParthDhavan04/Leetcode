class Solution {
    public boolean detectCapitalUse(String word) {
        char a=word.charAt(0);
        for(int i=1;i<word.length();i++){
            char ch=word.charAt(i);

            if(Character.isLowerCase(a))
            {    //checking if first letter is small 
                if(Character.isUpperCase(ch)){
                    return false;
                }
            }
            else                               //First letter is capital
            {
               char b=word.charAt(1);
               if(Character.isLowerCase(b)){
                 if(Character.isUpperCase(ch))
                    return false;
                }
                else{
                    if(Character.isLowerCase(ch))
                        return false;
                }
                
            }
        }
        return true;
    }
}
