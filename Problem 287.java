class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();//doesnt take duplicates
        for(int num : nums) {
            if(!set.add(num)) {// element which does not get added is the duplicate one
                return num;
            }
        }
