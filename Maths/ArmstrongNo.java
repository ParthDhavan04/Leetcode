class Solution {
    static String armstrongNumber(int n) {
        int sum=0;
        int start=n;
        // code here
        while(n!=0){
            int c=n%10;
            sum=sum+c*c*c;
            n=n/10;
        }
        if(sum==start){
            return "true";
        }   
        else
        return "false";
    }
}
