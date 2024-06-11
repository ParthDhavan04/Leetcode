class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str= new StringBuilder();
        int k;
        for(int i = s.length()-1 ; i >= 0 ; i-- ) {
            k = 0;
            if(s.charAt(i) == '#'){
                k = Integer.parseInt(s.substring(i - 2, i));//converts 2 digit value before # into int like 10#
                i -= 2; 
            } else {
                char ch = s.charAt(i);
                int a = ch - '0';
                k = a;
            }
            k += 96; //decryption algo, for eg '2' an integer + 96 changes to 98 ie 'b'
            str.append((char) k);
        }
        return str.reverse().toString();
    }
}
