class Solution {
    public int numWays(String s) {

        int mod=1000000000+7;
        
        int one=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                one++;
            }
        }

        if(one % 3 != 0){
            return 0;
        }

        if(one==0){
            long n = s.length();
            return (int) ((((n - 1) * (n - 2)) / 2) % mod);   
        }

        // division of one so that can be present equally in each part
        long ones = one / 3;

        char [] ch=s.toCharArray();
        one = 0;
        // ways on which the string can be splitted
        long part1 = 0, part2 = 0;
        for (char c : ch) {
            if (c == '1') {
                one++;
            }
            if (one == ones) {
                part1++;
            }
            if (one == 2 * ones) {
                part2++;
            }
        }
        return (int) ((part1 * part2) % mod);
    }
}
