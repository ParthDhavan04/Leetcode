class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // To return the TOP K FREQUENT ELEMENTS, the best and most efficient approach (in terms of time and space) is usually
        /* Approach: Frequency Map + Min Heap (PriorityQueue)
           Steps:
           - Count frequencies using a HashMap.
           - Push entries into a min-heap (priority queue) of size k.
             - Heap keeps only the top k most frequent elements.
           - Extract elements from the heap.
        */

        // Edge case: if k equals the total number of elements, return the input directly
        if (k == nums.length) {
            return nums;
        }

        // Step 1: Count frequency of each element using HashMap
        Map<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            // Increase count for current number, or start from 0 if not present
            count.put(n, count.getOrDefault(n, 0) + 1);
            /*
            count.getOrDefault(n, 0)
            → This checks if the map already contains the key n.
            → If it does, it returns the current count.
            → If it doesn’t, it returns 0 as the default value.

            + 1
            → Adds 1 to the current (or default) count → to increment the frequency.

            count.put(n, ...)
            → Updates the map with the new frequency count for key n
            */
        }

        // Step 2: Create a min-heap (priority queue) where we sort by frequency (lowest freq at the top)
        // Create a Min-Heap (PriorityQueue) where elements are ordered by their frequency from the count map.
        // The lambda comparator (a, b) -> count.get(a) - count.get(b) means:
        // - If 'a' has lower frequency than 'b', 'a' comes before 'b' in the heap.
        // - This helps us keep the k most frequent elements by removing the least frequent one when the size exceeds k.
        Queue<Integer> min_heap = new PriorityQueue<>((a, b) -> count.get(a) - count.get(b));

        /* 
        For a Max-Heap (PriorityQueue) where elements with higher frequency come first.
         we use the comparator (a, b) -> count.get(b) - count.get(a) 
        - If 'b' has higher frequency than 'a', 'b' comes before 'a' in the heap.
        - This helps us directly get the most frequent elements from the top of the heap.
        Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> count.get(b) - count.get(a));
        */

        // Step 3: Add all numbers to the heap, and keep only top k frequent elements
        for (int n : count.keySet()) { //returns a Set containing all the keys of the map.
            min_heap.add(n); // Add number to the min-heap based on its frequency (heap uses custom comparator)

            // If the heap size exceeds k, remove the element with the lowest frequency
            // This ensures that only the k most frequent elements remain in the heap
            if (min_heap.size() > k) {
                min_heap.poll(); // poll() removes the element at the top (i.e., least frequent in min-heap)
            }
        }

        // Step 4: Build the result array from the heap
        int[] ans = new int[k];

        // Now, extract elements from the heap and put them into the result array
        // We fill the result array from the end to start because we’re polling the least frequent of the top k first
        for (int i = k - 1; i >= 0; i--) {
            ans[i] = min_heap.poll(); // poll top element from heap and assign to result
        }

        return ans; // Return the array containing the top k frequent elements

    }
}
