class Solution {
    public String reverseVowels(String s) {
        char[] arr=s.toCharArray();
        String ans="aeiouAEIOU";
        int start=0;
        int end=arr.length-1;

        while(start<end){
            char c1=arr[start];
            char c2=arr[end];
            if(ans.indexOf(c1)==-1 ){
                start++;
                continue;
            }
            if(ans.indexOf(c2)==-1 ){
                end--;
                continue;
            }
            swap(arr,start,end);
            start++;
            end--;
        }
        return new String(arr);
    }
    void swap(char arr[],int a,int b){
        char temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
