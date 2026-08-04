class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        int min=nums[0];
        int max=nums[nums.length-1];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=min)
            {
            ans.add(min);
            i--;
            }
            min++;
            
        }
        return ans;
    }
}