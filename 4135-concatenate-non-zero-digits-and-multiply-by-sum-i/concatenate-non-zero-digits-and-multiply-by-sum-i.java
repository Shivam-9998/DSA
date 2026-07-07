class Solution {
    public long sumAndMultiply(int n) {
        long x=0;
        long sum=0;
        long k=0;
        if(n==0)
        {
            return 0;
        }
        while(n!=0)
        {
           long r=n%10;
           if(r!=0)
           {
                x=x*10+r;
                sum+=r;
           }
           n=n/10;
        }
        while(x!=0)
        {
            long r=x%10;
            k=k*10+r;
            x=x/10;
        }
        return k*sum;
    }
}