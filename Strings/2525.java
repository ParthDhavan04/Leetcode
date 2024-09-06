class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int c1=10000;
        long volume = (long) length * (long) width * (long) height;
        long c2=(long)Math.pow(10,9);
        int c3=100;
        boolean bulky=false;
        boolean heavy=false;

        if(length>=c1 || width>=c1 || height>=c1 || volume>=c2){
           bulky=true;
        }
        if(mass>=c3){
            heavy=true;
        }

        if(heavy==true && bulky==true){
            return "Both";
        }
        else if(heavy==true && bulky==false){
            return "Heavy";
        }
        else if(heavy==false && bulky==true){
            return "Bulky";
        }
        else{
            return "Neither";
        }
    }
}
