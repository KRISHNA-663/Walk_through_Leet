class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res= new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isself(i)){
                res.add(i);
            }
        }
        return res;
    }
    public boolean isself(int x){
        int num=x;
        while(x>0){
            int digit=x%10;
            if(digit==0 || num%digit!=0){
                return false;
            }
            x=x/10;
        }
        return true;
    }
}