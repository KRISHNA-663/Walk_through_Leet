class Solution {
    public int reverse(int x) {
        long res=0;
        while(x!=0)
        {
            res=res*10+x%10;
            x/=10;
        } 
        return (res<Integer.MIN_VALUE || res>Integer.MAX_VALUE)? 0 : (int)res;

        /* => The ternary operator is used for the case of an input number that might be out of range.
           => So we use res<Integer.MIN_VALUE || res>Integer.MAX_VALUE to overcome such cases!*/
    }
}