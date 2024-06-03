class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int start = 1, end = maxSum;
        int emptyL = index; //number of elements on left of index
        int emptyR = n-index-1; //elements on right of index
        long result = 0;
        while(start<=end){
            int mid = start + (end-start)/2;
            long leftSum = 0, rightSum = 0, el = mid - 1;

            long x = el-emptyR; long y = el-emptyL;

            if(emptyR <= el)
            rightSum = (el * (el+1))/2 - (x * (x+1))/2;
            else
            rightSum = (el * (el+1))/2 + (emptyR - el);

            if(emptyL <= el)
            leftSum = (el * (el+1))/2 - (y * (y+1))/2;
            else
            leftSum = (el * (el+1))/2 + (emptyL - el);

            long sum = leftSum + mid + rightSum; //mid contains maximized index

            if(sum <= maxSum){
            start = mid + 1;
            result = mid;
            }

            else
            end = mid - 1;
        }
        return (int)result;
    }
}
