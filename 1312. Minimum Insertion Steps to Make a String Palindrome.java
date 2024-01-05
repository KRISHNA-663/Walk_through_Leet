class Solution {
    public int minInsertions(String s) {
        return s.length()-longestPalindromeSubseq(s);
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder s1=new StringBuilder();
        int m=s.length();
        int dp[][]=new int[m+1][m+1];
        for(int i=0;i<m+1;i++)
         {
             for(int j=0;j<m+1;j++)
              dp[i][j]=-1;
         }
        s1.append(s);
        s1.reverse();
        String s3=s1.toString();
        int res=lcs(m,m,s,s3,dp);
        return res;

        
    }
    public int lcs(int m,int n,String text1,String text2,int dp[][])
    {
        if(m==0 || n==0)
            return 0;
        if(dp[m][n]!=-1)
            return dp[m][n];
        if(text1.charAt(m-1)==text2.charAt(n-1))
            return dp[m][n]=1+lcs(m-1,n-1,text1,text2,dp);
        int a=lcs(m-1,n,text1,text2,dp);
        int b=lcs(m,n-1,text1,text2,dp);
        return dp[m][n]=Math.max(a,b);
    }
}