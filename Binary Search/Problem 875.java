class Solution {
    //https://leetcode.com/problems/koko-eating-bananas/solutions/1703687/java-c-a-very-very-well-detailed-explanation/
    public int minEatingSpeed(int[] piles, int h) { //refer link for detailed explanation
        int start = 1,r=piles[0];
        for(int i=0;i<piles.length;i++){
            r = Math.max(r,piles[i]);
        }
        int end = r;
        
        while(start < end){
            int mid = start + (end - start) / 2;
            if(canEatInTime(piles, mid, h)) 
            end = mid;
            else 
            start = mid + 1;
        }
        return start;
    }
    public boolean canEatInTime(int piles[], int k, int h){
        int hours = 0;
        for(int pile : piles){
            int div = pile / k;
            hours += div;
            if(pile % k != 0) hours++;
        }
        return hours <= h;
        
    }
}
