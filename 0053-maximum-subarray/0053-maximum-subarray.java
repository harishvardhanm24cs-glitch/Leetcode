class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum=nums[0];
        int maxSum=nums[0];
        for(int j=1;j<nums.length;j++){
            currentSum= Math.max(nums[j], currentSum+nums[j]);
            maxSum= Math.max(maxSum , currentSum);
        }
        return maxSum;
    }
}