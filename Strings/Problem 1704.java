class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0, count2 = 0;
         s = s.toLowerCase();
         String vo = "aeiou";
         for (int i = 0; i < s.length() / 2; i++) {
            if(vo.indexOf(s.charAt(i)) != -1)
            count1++;
         }

         for (int i = s.length() / 2; i < s.length(); i++) {
            if(vo.indexOf(s.charAt(i)) != -1)
                count2++;
        }
         return count1 == count2;
    }
}
