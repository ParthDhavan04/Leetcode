class Solution {
    public boolean isHappy(int n) {
        if(n==7)
        return true;
        int c=0;
      while(c<10) 
      {
        int s = 0;
        while(n!=0){
            int d = n%10;
            s = s + d*d;
            n/=10;
        }
        n = s; 
        c++;
      } 
      if(n==1) return true;
      else 
      return false;
}
}
