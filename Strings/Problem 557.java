class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String temp[]=s.split(" ");

        for(int i=0;i<temp.length;i++){
            StringBuilder sb=new StringBuilder(temp[i]);
            ans.append(sb.reverse());
            if(i!=temp.length-1)  //space after every word
            ans.append(" ");
    }
     return ans.toString();
     
    }
}
