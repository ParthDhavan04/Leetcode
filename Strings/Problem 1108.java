class Solution {
    public String defangIPaddr(String address) {

        if (address == null || address.length()==0) 
            return "";

        
        StringBuilder str1=new StringBuilder();

        for(char ch:address.toCharArray()){
            if(ch=='.'){
                str1.append("[.]");
            }
            else
            str1.append(ch);
        }

        return str1.toString();
    }
}
