class Solution {
    public int smallestIndex(int[] nums) {
        int ans = 0;
        
        for(int i =0; i<nums.length;i++){
            int sum= 0;
            
            while(nums[i]!=0){
                    
            int digit = nums[i]%10;
            sum +=digit;
            nums[i]/=10;
                    
            }
            if(sum==i){
                return i;
            }
        }
        
        return -1;
    }
}