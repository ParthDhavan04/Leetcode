class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr,1);

        int currProduct = 1;

        for(int i=0;i<nums.length;i++){  //left product (prefix of num[i])
            arr[i] = currProduct;
            currProduct *= nums[i];//this statement comes later to exclude current index
        }

        currProduct = 1;

        for(int i = nums.length-1;i>=0;i--){ //left * right product (suffix of num[i])
            arr[i] *= currProduct;
            currProduct *= nums[i];//this statement comes later to exclude current index
        }

        return arr;
    }
}
