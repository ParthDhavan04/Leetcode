class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        //range :
        //min=greatest element of arr
        //max=sum of all elements of arr


        int max=0;
        int sum=0;

        for(int i=0;i<weights.length;i++){
            sum=sum+weights[i];
            max=Math.max(max,weights[i]);
        }
        
        if(days==1){
            return sum;
        }

        if(days==weights.length){
            return max;//one item is shipped one day each
        }

        int start=max;
        int end=sum;
        int result=0;


        while(start<=end){
            int mid=start+(end-start)/2;

            if(isPossible(weights,mid,days)==true){
                result=mid;//here mid has weight
                end=mid-1;//so that we can find a better solution also
            }
            else{
                start=mid+1;
            }
        }
        return result;
    }

    boolean isPossible(int weight[],int wt,int days){

        int d=1;
        int sum=0;
        //here wt that is weight is mid


        for(int i = 0;i<weight.length;i++){
            sum=sum+weight[i];//adding all weights less than wt(the weight for which we check elements)
            if(sum>wt){
                d++;
                sum=weight[i];//sum should have last weight where we stopped
            }
        }
        if(d<=days){
            return true;
        }
        else
            return false;

    }
}
