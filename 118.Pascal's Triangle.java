class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> row,prv = null;
        for(int i=0;i<numRows;++i){
            row = new ArrayList<Integer>();
            for(int j=0;j<=i;++j){
                if(j==0 || j== i){
                    row.add(1);
                }
                else{
                    row.add(prv.get(j-1)+prv.get(j));
                }
            }
        prv = row;
        res.add(row);
        }
        return res;
    }
} 