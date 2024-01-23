class Solution {
    int count=0;
     public void solve(int row,int board[][],int n)
    {
        if(row==n)
        {
            count++;
            return;
        }

        for(int i=0;i<n;i++)
        {
            int flag=0;
            int tr=row;
            int tc=i;
            while (tr>0 && tc>0)
            {
                tr--;
                tc--;
                if(board[tr][tc]==1)
                {
                    flag=1;
                    break;
                }
            }
            tr=row;
            tc=i;
            if(flag!=1)
            {
                while(tr>0)
                {
                    tr--;
                    if(board[tr][tc]==1)
                    {
                        flag=1;
                        break;
                    }
                }
            }
            tr=row;
            tc=i;
            if(flag!=1)
            {
                while(tr>0 && tc<n-1)
                {
                    tr--;
                    tc++;
                    if(board[tr][tc]==1)
                    {
                        flag=1;
                        break;
                    }
                }
       
            }
             if(flag!=1)
        {
            board[row][i]=1;
            solve(row+1,board,n);
            board[row][i]=0;
        }
             
        }
       
    }
    public int totalNQueens(int n) {
        int board[][]=new int[n][n];
        solve(0,board,n);
        return count;
    }
   
}