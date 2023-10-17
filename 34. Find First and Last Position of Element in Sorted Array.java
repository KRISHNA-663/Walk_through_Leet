class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int c=0;
        int [] arr= new int[2];
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                arr[c]=i;
                c++;
                break;
            }
        }
        for(int i=n-1;i>=0;i--){
            if(nums[i]==target){
                arr[c]=i;
                break;
            }
        }
        if(c==0){
           arr[0]=-1;
           arr[1]=-1;
        }
        return arr ;
    }
}