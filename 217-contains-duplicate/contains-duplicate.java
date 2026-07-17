class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> abc=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            abc.put(nums[i], abc.getOrDefault(nums[i], 0) + 1);
        }
        for (int value : abc.values()) {
    if (value >= 2) {
        return true;
    }
    }
        return false;

    }
}