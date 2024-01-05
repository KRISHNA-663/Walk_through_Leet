class Solution {
    public int longestPalindromeSubseq(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dp[i][j] = -1;
            }
        }
        int i=0;
        int j=n-1;
        return lps(i,j,s,dp);
    }
    public static int lps(int i,int j,String s,int[][]dp){
        if(i>j)
        return 0;
        if(i==j)
        return 1;
        if(dp[i][j]!=-1)
        return dp[i][j];
        if(s.charAt(i)==s.charAt(j))
        return dp[i][j] = 2+lps(i+1,j-1,s,dp);
        int a = lps(i+1,j,s,dp);
        int b = lps(i,j-1,s,dp);
        dp[i][j] = Math.max(a,b);
        return dp[i][j];
    }

}