class Solution {
    public int maxArea(int[] height) {
        int start=0;
        int end=height.length-1;
        int ans=0;
        while(start<end)
        {
            if(height[start]<height[end])
            {
                if(height[start]*(end-start)>ans)
                ans=height[start]*(end-start);
                start++;

            }
            else if(height[start]>height[end])
            {
            if(height[end]*(end-start)>ans)
                ans=height[end]*(end-start);
                end--;
            }
            else if(height[start]==height[end])
            {
                if(height[start]*(end-start)>ans)
                ans=height[start]*(end-start);
                start++;
                end--;
            }

        }
        return ans;
    }
}