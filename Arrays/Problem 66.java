class Solution {
    public int[] plusOne(int[] digits) {

        // if(digits[digits.length-1]!=9){
        //     digits[digits.length-1] += 1;
        //     return digits;
        // }
        
        for(int i=digits.length-1;i>=0;i--){
            digits[i]++;
            if(digits[i]<=9){
                return digits;
            }
            else{
                digits[i]=0;
            }
        }

        int [] arr=new int[digits.length+1];
        arr[0]=1;

        return arr;
        
    }
}
