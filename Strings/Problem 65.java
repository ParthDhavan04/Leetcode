class Solution {
    public boolean isNumber(String s) {

        boolean numberSeen = false;
        boolean eSeen = false;//if e or E has been seen
        boolean decSeen = false; //decimal encountered or not

        
        for(int i=0; i<s.length(); i++){

            char ch=s.charAt(i);

            if(Character.isDigit(ch)){
                numberSeen=true;
            }
            else if(ch=='e' || ch=='E'){//need another number now after E / e

                if(eSeen || !numberSeen){
                    return false;
                }
                eSeen=true;
                numberSeen=false;
            }
            else if(ch=='.'){//if dot has been seen, cannot see another dot & cannot have E/e followed by decimal 99e2.5
                if(decSeen || eSeen){
                    return false;
                }
                decSeen=true;
            }
            else if(ch=='-' || ch =='+'){//if 3e+7 then e followed by +/- is allowed or e should never be any other place except start
                if(i>0 && s.charAt(i-1)!= 'e' && s.charAt(i - 1) != 'E')
                return false;
            }
            else{
                return false;
            }

        }
        return numberSeen; //number has to be seen once ie true

    }
}
