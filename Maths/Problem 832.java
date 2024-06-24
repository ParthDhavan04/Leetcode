class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i=0;i<image.length;i++){
            reverse(image[i]);
        }

        for(int j=0;j<image.length;j++){
            for(int k=0;k<image.length;k++){
                image[j][k]=image[j][k]^1;
            }
        }
        return image;
        
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while (start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
