class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {

        String[] s1=sentence1.split(" ");
        String[] s2=sentence2.split(" ");


        int i=0;
        int j=0;

        while(i<s1.length && j<s2.length){
            if(!s1[i].equals(s2[j])){
                break;
            }
            i++;
            j++;
        }

        if(i==s1.length || j==s2.length){
            return true;
        }

        int l1=s1.length-1;
        int l2=s2.length-1;
        while(l1>=i && l2>=j){
            if(!s1[l1].equals(s2[l2])){
                return false;
            }
            l1--;
            l2--;
        }
        return l1<i || l2<j;//means whole string is traversed as i and j traversed from front and l1 l2 traversed from back.So it means they have met.
        
    }
}
