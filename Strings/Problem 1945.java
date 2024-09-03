class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int temp = s.charAt(i) - 'a' + 1 ;

            while (temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }
        }

        k--;
        int num = sum;

        while (k!=0) {
            sum = 0;
            int temp = num;

            while (temp!=0) {
                sum += temp%10;
                temp /= 10;
            }
            num = sum;
            k--;
        }
        return sum;
    }
}
