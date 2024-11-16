class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));//this lambda function/comparator is creating a MAX HEAP

        for(int key:map.keySet()){
            pq.add(key);
        }

        int[] res=new int[k];

        for(int i=0;i<k;i++){
            res[i]=pq.remove();
        }

        return res;
    }
}
