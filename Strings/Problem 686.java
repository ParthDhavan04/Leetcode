class Solution {
    //repeatedly append the string a to itself until its length is greater than or equal to the length of string b
    public int repeatedStringMatch(String a, String b) {
        StringBuilder s = new StringBuilder(a);
        int count = 1;// as a has an element

        while (s.length() < b.length()) {
            s.append(a);
            count++;
        }

        if (s.indexOf(b) != -1) {
            return count;
        }

        s.append(a);
        count++;

        if (s.indexOf(b) != -1) {
            return count;
        }

        return -1;
    }
}
