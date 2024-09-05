class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int totalSum = mean * (n + rolls.length);
        for(int i : rolls) totalSum -= i;

        int[] res = new int[n];

        if(n * 6 < totalSum || n > totalSum) return new int[0];
        
        int expectedAvg = totalSum/n;
        int remainder = totalSum % n;

        for(int i = 0; i < n; i++){
            if(i < remainder) res[i] = expectedAvg + 1;
            else res[i] = expectedAvg;
        }

        return res;
    }
}
