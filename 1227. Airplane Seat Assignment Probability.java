class Solution {
    public double nthPersonGetsNthSeat(int n) {
        if(n==1 || n==2){
         return(double)1/n;   
        }
        return 0.5;
    }
}