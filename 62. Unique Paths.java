class Solution {
    public int uniquePaths(int m, int n) {
         long ans = 1;
        for(int i = m+n-2, j = 1; i >= Math.max(m, n); i--, j++) 
            ans = (ans * i) / j;
        return (int)ans;
    }
}