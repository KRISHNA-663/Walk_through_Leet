class Solution {
    public int majorityElement(int[] nums) {
      int vote=0;
      int ans=0;
      int l=nums.length;
      for(int i=0;i<l;i++){
          if(vote==0){
              if(ans!=nums[i]){
                  ans=nums[i];
                  vote+=1;
              }
              else{
                  vote+=1;
              }
          }
          else if(vote!=0){
              if(ans==nums[i]){
                  vote+=1;
              }
              else{
                  vote-=1;
              }
          }
      }
      return ans;
    }
    
}