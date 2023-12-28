class Solution {
    public int xorBeauty(int[] nums) {
        int n=xor(nums);
        return n;
    }
    int xor(int nums[]){
        int co=0;
        for(int i:nums)
        {
            co=co^i;
        }
        return co;
    }
}