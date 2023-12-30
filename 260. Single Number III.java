class Solution {
    public int[] singleNumber(int[] nums) {
        int z = nums[0];
        for(int i = 1; i < nums.length; ++i)
        {
            z ^= nums[i];
        }
        int pos = 0;
        for(int i = 0; i < 32; ++i)
        {
            if((z & (1 << i)) != 0)
            {
                pos = i;
                break;
            }
        }
        int res[] = new int[2];
        for(int i = 0; i < nums.length; ++i)
        {
            if((nums[i] & (1 << pos)) != 0)
                res[0] ^= nums[i];
            else
                res[1] ^= nums[i];
        }
        return res;
    }
}

