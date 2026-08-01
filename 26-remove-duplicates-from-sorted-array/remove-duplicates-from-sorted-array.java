class Solution {
    public int removeDuplicates(int[] nums) {
        int temp=nums[0];
        int ans=1;
        int k=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]!=temp)
            {
                ans++;
                nums[k]=nums[i];
                k++;
            }
            temp=nums[i];
        }
        return ans;
    }
}