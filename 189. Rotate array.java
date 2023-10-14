class Solution {
    public static void rev(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if(k>n){
            k=k%n;
        }
        rev(nums,0,n-k-1);
        rev(nums,n-k,n-1);
        rev(nums,0,n-1);
    }
}