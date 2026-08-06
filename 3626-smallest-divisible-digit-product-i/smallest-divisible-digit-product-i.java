class Solution {
    public int smallestNumber(int n, int t) {
        int p=1;
        int temp=0;
        int k=0;
        if(n%10==0)
        return n;
        
        else
        {
            for(int i=n;i<=n+10;i++)
            {
                temp=i;
                while(temp!=0)
                {
                    k=temp%10;
                    p=p*k;
                    temp=temp/10;
                }
                
                if(p%t==0)
                return i;
                p=1;
            }
            return 0;
        }
    }
}