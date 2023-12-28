class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1%2==0 && n2%2==0) return 0;
        else if(n1%2==0)
        {
            int n=xor(nums1);
            return n;
        }
        else if(n2%2==0)
        {
            int n=xor(nums2);
            return n;
        }
        else 
        {
            return xor(nums1)^xor(nums2);
        }
    }
    int xor(int x[])
    {
        int co=0;
        for(int i:x)
        {
            co=co^i;
        }
        return co;
    }
}