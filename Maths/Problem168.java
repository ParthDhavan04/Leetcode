class Solution {
    public String convertToTitle(int columnNumber) {

       StringBuilder sb= new StringBuilder();
       String alph="ABCDEFGHIJKLMNOPQRSTUVWXYZ";

       if(columnNumber < 27)
       return String.valueOf(alph.charAt(columnNumber-1));

       while(columnNumber > 26)
       {
        int temp = columnNumber % 26;

        if(temp > 0)
        {
            sb.append(alph.charAt(temp-1));
            columnNumber/= 26;
        }
        else{
            sb.append('Z');
            columnNumber/=26;
            columnNumber = columnNumber - 1;
        }
       } 

       sb.append(alph.charAt(columnNumber-1));
       return String.valueOf(sb.reverse());
    }
}
