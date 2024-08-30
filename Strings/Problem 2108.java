class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
           if(palindrome(words[i])){
            return words[i];
           }
        }
        return "";
    }
    boolean palindrome(String a){
       int s=0;
       int e=a.length()-1;

       while(s<e){
        if(a.charAt(s)!=a.charAt(e)){
            return false;
        }
        else{
            s++;
            e--;
        }
       }
       return true;
    }
}
