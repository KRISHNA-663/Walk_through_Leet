class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int res=0;
        for (final String op:operations)
            res+=op.charAt(1)=='+'?1:-1;
        return res;
    }
}