class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int a=coordinate1.charAt(0)-'a'+1;
        int b=coordinate1.charAt(1);
        int c=coordinate2.charAt(0)-'a'+1;
        int d=coordinate2.charAt(1);
        boolean e=false;
        boolean f=false;

        if(a%2==0 && b%2==0 || a%2!=0 && b%2!=0){
            e=false;
        }
        else{
            e=true;
        }
        
        if(c%2==0 && d%2==0 || c%2!=0 && d%2!=0){
            f=false;
        }
        else{
            f=true;
        }

        if(e==f){
            return true;
        }
        return false;

    }
}
