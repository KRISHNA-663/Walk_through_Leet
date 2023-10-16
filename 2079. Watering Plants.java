class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n = plants.length;
        int d=1;
        int bucket=capacity;
        for(int i=0;i<n-1;i++){
            d+=1;
            bucket-=plants[i];
            if(bucket<plants[i+1]){
                d+=(i+1)*2;
                bucket=capacity;
            }
        }
        return d;
    }
}