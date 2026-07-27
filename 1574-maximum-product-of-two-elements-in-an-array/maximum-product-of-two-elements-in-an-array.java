class Solution {
    public int maxProduct(int[] nums) {
    //    int maxp=0;
    //    int ans=0;
    //    for(int i=0;i<nums.length;i++)
    //    {
    //     for(int j=i+1;j<nums.length;j++)
    //     {
    //         if(nums[i]*nums[j]>maxp)
    //         {
    //             maxp=nums[i]*nums[j];
    //             ans=((nums[i]-1)*(nums[j]-1));
    //         }
    //     }
    //    } 
    //    return ans;


    //Trying alternate aproach 
    Arrays.sort(nums);
    return ((nums[nums.length-2]-1)*(nums[nums.length-1]-1));
    }
}