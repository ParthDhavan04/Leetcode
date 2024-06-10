class Solution {
    public boolean isPalindrome(String s) {
        if(s==null || s.length() == 0)
        return true;

        s = s.toLowerCase();
        String rev = "", s1 = "";

        //removing all spaces and special characters from string s
         for(int i=0; i<s.length(); i++)
        {
           if (Character.isLetterOrDigit(s.charAt(i)))
           s1 = s1 + s.charAt(i); 
        }


        for(int i=s1.length()-1; i>=0 ; i--)
        {
           if (Character.isLetterOrDigit(s1.charAt(i)))
           rev = rev + s1.charAt(i); 
        }

        if(s1.equals(rev))
        return true;
        else return false;
    }
}






/*class Solution {
    public boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int start = 0;
        int last = s.length() - 1;
        while(start <= last) {
        	char currFirst = s.charAt(start);
        	char currLast = s.charAt(last);
        	if (!Character.isLetterOrDigit(currFirst )) {
        		start++;
        	} else if(!Character.isLetterOrDigit(currLast)) {
        		last--;
        	} else {
        		if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
        			return false;
        		}
        		start++;
        		last--;
        	}
        }
        return true;
    }
}*/
