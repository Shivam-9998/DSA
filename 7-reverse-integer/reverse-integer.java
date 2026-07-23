class Solution {
    public int reverse(int x) {
        int temp=x;
        int res=0;
        while(temp!=0)
        {
            while (temp != 0) {
    int a = temp % 10;

    if (res > Integer.MAX_VALUE / 10 ||
        (res == Integer.MAX_VALUE / 10 && a > 7))
        return 0;

    if (res < Integer.MIN_VALUE / 10 ||
        (res == Integer.MIN_VALUE / 10 && a < -8))
        return 0;

    res = res * 10 + a;

    temp /= 10;
}
        }
        
        return res;
        
    }
}