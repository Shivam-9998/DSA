class Solution {
    public int maxProduct(int n) {
        int c=n;
        int dig=0;
        while(c!=0)
        {
            c=c/10;
            dig++;
        }
        String str=n+"";
         char[] arr = str.toCharArray();
        Arrays.sort(arr);

        int a=arr[dig-1]-'0';
        int b=arr[dig-2]-'0';
        return a*b;
        
    }
}