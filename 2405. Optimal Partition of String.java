class Solution {
    public int partitionString(String s) {
     int res=1;
     int use=0;
     for (final char c:s.toCharArray()){
         final int i=c-'a';
         if ((use>>i&1)==1){
             use=1<<i;
             ++res;
         }
         else{
             use |=1<<i;
         }
     }
     return res;
    }
}