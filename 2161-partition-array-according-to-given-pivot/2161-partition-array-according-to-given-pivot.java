class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count =0;
        int [] ans = new int [nums.length];
        for(int i = 0; i<nums.length; i++){
                if(nums[i]<pivot){
                    ans[count] = nums[i];
                    count +=1;
                }
        }
            for(int i = 0; i<ans.length; i++){
                if(nums[i]==pivot){
                    ans[count] = nums[i];
                    count +=1;
                }
            }
            for(int i = 0; i<ans.length; i++){
                if(nums[i]>pivot){
                    ans[count] = nums[i];
                    count +=1;
                }
            }
            
        return ans;
    }
}