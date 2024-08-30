class Solution {
    public int addDigits(int num) {
        int b=num;
        while(b>9){
            int sum=0;
            int a=0;
            while(b!=0){
                a=b%10;
                sum=sum+a;
                b=b/10;
            }
            b=sum;
        }
        return b;
    }
}
