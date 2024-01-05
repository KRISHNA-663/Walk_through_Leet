class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int pos=0;i<n && i<=pos;++i)
        {
            pos=Math.max(pos,i+nums[i]);
        }
        return i==n;
    }
}