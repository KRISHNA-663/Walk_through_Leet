class Solution {
    public int reverse(int x) {
        int sum = 0;
        int mod = 0;
        int f = 0;

        if (x < 0) {
            x = -x;
            f = 1;
        }

        while (x != 0) {
            mod = x % 10;
            if (sum > (Integer.MAX_VALUE - mod) / 10) {
                return 0; 
            }
            sum = sum * 10 + mod;
            x = x / 10;
        }

        if (f == 1) {
            return -sum;
        }
        return sum;
    }
}
