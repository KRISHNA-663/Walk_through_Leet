class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int [] can = new int[n];
        for(int i=0;i<n;i++){
            can[i]=1;
        }
        for(int i=1;i<n;i++){
            if(ratings[i]>ratings[i-1]){
                can[i]=can[i-1]+1;
            }
        }
        for(int j=n-2;j>=0;j--){
                if(ratings[j]>ratings[j+1] && can[j]<=can[j+1]){
                    can[j]=can[j+1]+1;
                }
            }
        int ans=0;
        for(int i=0;i<n;i++){
            ans+=can[i];
        }
        return ans;
        
    }
}
