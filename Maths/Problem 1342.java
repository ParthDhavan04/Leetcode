class Solution {
    public int numberOfSteps(int num) {
        int c=0;
     while(num!=0){
        if(num%2==0){
            num=num/2;
            c=c+1;
        }
        if(num%2==1){
            num=num-1;
            c=c+1;
        }
     }
        return c;
    }
}
