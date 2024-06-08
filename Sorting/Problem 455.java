class Solution {
    public int findContentChildren(int[] g, int[] s) {
        
        Arrays.sort(g);
        Arrays.sort(s);

        int gs=g.length;
        int ss=s.length;
        int c=0;
        //pointer of greed factor array will only be moved ahead if the greed factor of current child is satisfied.

        for(int i=0;i<ss;i++){
            if(c<gs && g[c]<= s[i]){
                c++;
            }

        }
        return c;
    }
}
