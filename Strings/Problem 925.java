class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;
        String res = "";
        
        while(i<name.length() && j<typed.length()){
            if(name.charAt(i)==typed.charAt(j)){
                res+=typed.charAt(j);
                i++;
                j++;
            }
            else if(i>0 && name.charAt(i-1)==typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        while(j<typed.length()){
            if(name.charAt(i-1)==typed.charAt(j)){
                j++;
            }
            else{
                return false;
            }
        }
        return i<name.length()?false:true;
    }
}
