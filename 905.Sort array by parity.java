class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++){
                if(nums[j]%2==0 && nums[i]%2!=0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}