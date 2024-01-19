class Solution {
    public String addBinary(String a, String b) {
        StringBuilder out = new StringBuilder();
        int carry=0;
        int i = a.length()-1;
        int j = b.length()-1;

        while(i>=0 || j>=0 || carry!=0){
            int digitA = i>=0 ? a.charAt(i)-'0':0;
            int digitB = j>=0 ? b.charAt(j)-'0':0;
            int currentSum = digitA + digitB + carry;
            out.insert(0,currentSum%2);
            carry = currentSum/2;
            i--;
            j--;
        }
        return out.toString();
        
    }
}