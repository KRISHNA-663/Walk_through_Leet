class Solution {
    public boolean isReachable(int a, int b) {
        while(a%2==0)
            a/=2;
        while(b%2==0)
            b/=2;
        return gcd(a,b)==1;
    }
    public static int gcd(int a,int b){
        while(!(a==b)){
            if(a>b)
                a-=b;
            else if(b>a)
                b-=a;
        }
        if(a==1 || b==1)
            return 1;
        return 0;

    }
}