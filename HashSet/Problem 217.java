class Solution {
    public boolean containsDuplicate(int[] nums) {
        //"Seen Before" using HashSet
        //We use a HashSet because it: 
        //Stores only unique elements
        //Allows O(1) average time for add() and contains()
        Set<Integer> set=new HashSet<>();

        for(int num:nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
