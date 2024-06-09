class Solution {
    public double average(int[] salary) {

        Arrays.sort(salary);

        if(salary.length==3){
            return salary[1];
        }
        double sum=0.0;
        double c=0;
        for(int i=1;i<salary.length-1;i++){

            sum=sum+salary[i];
            c++;

        }

        return (sum/c);
        
    }
}
