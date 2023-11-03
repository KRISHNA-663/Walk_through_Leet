class Solution {
    public boolean isPalindrome(int x) {
        int sum=0;
        int mod=0;
        int y=x;
        if(y<0){
            return false;
        }
        while(y!=0){
            mod=y%10;
            sum=sum*10+mod;
            y=y/10;
        }
        if(x==sum){
            return true;
        }
        else{
            return false;
        }
    }
}