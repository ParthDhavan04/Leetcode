class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> list = new ArrayList<>();

        for(int i=0; i< queries.length; i++)
        {
            String word = queries[i];
           
            boolean seq = isSubsequence(word.toCharArray(), pattern.toCharArray());
            
            list.add(seq);
        }
        return list;
    }


    public boolean isSubsequence(char[] s, char[] p){
        int i = 0, j = 0;
        while(i < s.length && j < p.length){
            if(s[i] == p[j]){
                i++;
                j++;
            }
            else if(Character.isUpperCase(s[i]))
            return false;
            
            else
            i++;
        }

        while( i<s.length)
        {
         if(Character.isUpperCase(s[i]))
         return false;

         i++;
        }
        //j pointer reaches the end of P string or P char[] then P is a subsequence of S
        return j == p.length;
    }
}

/*class Solution {

    boolean check(String str,String pattern){
        int i=0;
        int cap=0;
        char[] arr=str.toCharArray();
        char[] pat=pattern.toCharArray();

        for(int j=0;j<str.length();j++){
            if(i<pattern.length() && arr[j]==pat[i]){
                i++;
            }
            else if(arr[j]>='A' && arr[j]<='Z'){
                cap++;
            }
        }

        return (i==pat.length && cap==0);
    }

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        int n=queries.length;
        List<Boolean> ans = new ArrayList();

        for(int i=0;i<n;i++){
            ans.add(check(queries[i],pattern));
        }
        return ans;    
    }
}*/
