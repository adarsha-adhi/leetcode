class Solution {
    public int maxProduct(int[] nums) {
        int fMax = 0;
        int sMax = 1;

        for(int i =1;i<nums.length;i++){
            if(nums[i]>=nums[fMax]){
                sMax=fMax;
                fMax=i;
            }else if (nums[i] > nums[sMax]) {
                sMax = i;
            }
        }
        return (nums[fMax]-1)*(nums[sMax]-1);
    }
}