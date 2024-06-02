class Solution {
    public int singleNonDuplicate(int[] arr) {//if logn comp wasnt there we could do it by XOR
      //LOGIC USED:
      //for every even index duplicate is on its right and for every odd index duplicate is on its left
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

        if(mid == 0 || mid == arr.length - 1 || (arr[mid] != arr[mid+1])&& (arr[mid]!=arr[mid-1]))
            return arr[mid];
             

            if(mid%2 == 0){  // even index so --> required index on right side
                if( arr[mid] == arr[mid+1] ) //means till here pairs are correct
                    start = mid + 1;

                else if(arr[mid-1] == arr[mid] ) // even ke left me odd obtained so required index on left side
                    end = mid;                 
            }

            else{   //odd index
                // required index on right side
               if( arr[mid-1] == arr[mid] )//checked on left and obtained means correct pairing
                    start = mid + 1;

                // required index on left side
                else if(arr[mid+1] == arr[mid] )
                    end = mid;             
            }
        }



        return -1;
    }
    }
