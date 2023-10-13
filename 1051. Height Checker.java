class Solution {
    public int heightChecker(int[] heights) {
        int len=heights.length;
        int c=0;
        int arr[]=Arrays.copyOf(heights,len);
        Arrays.sort(heights);
        for(int i=0;i<len;i++){
            if(heights[i]!=arr[i]){
                c+=1;
            }
        }
        return c;
    }
}