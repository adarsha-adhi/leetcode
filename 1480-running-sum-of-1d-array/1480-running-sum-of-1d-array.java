class Solution {
    public int[] runningSum(int[] nums) {
        int ans[] = new int[nums.length];
        int count = 0;
        for(int i = 0; i<nums.length;i++){
            ans[i] = count+ nums[i];
            count = ans[i];
        }
        return ans;
    }
}