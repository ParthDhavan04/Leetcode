class Solution {
    public boolean checkIfExist(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) 
            for (int j = 0; j < n; j++) 
                if (i != j && arr[i] == 2 * arr[j]) 
                    return true;
        return false;
    }

     /*Arrays.sort(arr);
        for (int j = 0; j < arr.length; j++) {
            int target = 2 * arr[j];
            int start = 0, end = arr.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target && mid != j) 
                    return true;
                if (arr[mid] < target) 
                    start = mid + 1;
                else 
                    end = mid - 1;
            }
        }
        return false;*/

}
