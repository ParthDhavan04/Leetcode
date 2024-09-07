class Solution {
    public int maximum69Number (int num) {
        String a = Integer.toString(num);
        String ans="";
        
        for(int i=0; i<a.length();i++)
        {
            if(a.charAt(i)=='6')
            {
                ans = a.substring(0,i) + '9' + a.substring(i+1,a.length());
                return Integer.parseInt(ans);
            }
        }
        
        return num;	 
    }
}
