class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        char[] sChar = s.toCharArray();
        char[] pChar = p.toCharArray();
        int l = 0;
        int r = removable.length - 1;
        while(l <= r){
            int mid = l + (r-l)/2;
//check till the mid point of removable array & find whether after removing all those indices from s, p remains a subsequence of s or not? used '* to indicate the removed indices.'
             for(int i = l; i <= mid; i++) 
             sChar[removable[i]] = '*'; //mid is probable ans

             if(isSubsequence(sChar, pChar))
                l = mid+1;  //subseq found so check further

            else{
                for(int i = l; i <= mid; i++) 
                sChar[removable[i]] = s.charAt(removable[i]);
                r = mid - 1;
            }
        }

        return r+1; 
    }

    public boolean isSubsequence(char[] s, char[] p){
        int i = 0, j = 0;
        while(i < s.length && j < p.length){
            if(s[i] == p[j]){
                i++;
                j++;
            }
            else i++;
        }

        //j pointer reaches the end of P string or P char[] then P is a subsequence of S
        return j == p.length;
    }
}
