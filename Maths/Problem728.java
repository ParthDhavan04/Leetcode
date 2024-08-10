class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for(int i=left;i<=right;i++)
        {
            boolean b = divideNum(i);
            if(b)
            result.add(i);
        }
        return result;
    }

    boolean divideNum(int n)
    {
        int k = n;
        while(n!=0)
        {
            int d = n%10;
            if(d==0) return false;
            if(k%d!=0)
            return false;
            n/=10;
        }
        return true;
    }
}
