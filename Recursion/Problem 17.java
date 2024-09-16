class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.equals(""))
        return new ArrayList<>();
        String ans="";
        return solve(ans,digits);
    }

     List<String> solve(String p, String up) {
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        int digit = up.charAt(0) - '0';

        int i=(digit-2)*3;

        if(digit > 7) 
        i+=1;
        
        int len = i+3; //end limit 

        if(digit == 7 || digit == 9) 
        len+=1;
        
        
        ArrayList<String> list = new ArrayList<>();
                
        for(; i<len; i++) {
            char ch = (char)('a' + i);
            list.addAll(solve(p+ch, up.substring(1)));
        }
        return list;  
    }
}
