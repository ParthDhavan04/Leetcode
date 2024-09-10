class Solution {
    public boolean squareIsWhite(String coordinates) {
        int p=coordinates.charAt(0)-'a'+1;
        int q=coordinates.charAt(1);

        if(p%2==0 && q%2==0 || p%2!=0 && q%2!=0){ //for both even and odd black
            return false;
        }
        return true;


    }
}// odd odd black,even even black 
