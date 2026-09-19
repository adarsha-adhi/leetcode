class Solution {
    public int countPartitions(int[] nums) {
        int totalSum =0;
        int leftSum =0;
        int count =0;
        
        for(int i =0;i<nums.length;i++){
            totalSum +=nums[i];
        }
        for(int j =0;j<nums.length-1;j++){
            leftSum+=nums[j];
            int rightSum = leftSum-totalSum;
            int diff = leftSum-rightSum;
            if(diff%2==0){
                count++;
            }
        }
        return count;
    }
}