class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int co=0;
        for(int i:derived)
        {
            co=co^i;
        }
        if(co==0) return true;
        else return false;
    }
}