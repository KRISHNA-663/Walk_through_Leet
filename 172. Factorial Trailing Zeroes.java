class Solution {
    public int trailingZeroes(int n) {
        int num=n;
        int den=5;
        int ans=0;
        while(num>=den)
        {
            ans=ans+num/den;
            den*=5;
        }
        return ans;
    }
}