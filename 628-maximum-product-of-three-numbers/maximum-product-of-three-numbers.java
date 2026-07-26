class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int maxp=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]*nums[(i+1)%nums.length]*nums[(i+2)%nums.length]>=maxp)
            {
                maxp=nums[i]*nums[(i+1)%nums.length]*nums[(i+2)%nums.length];
            }
        }
        return maxp;
    }
}