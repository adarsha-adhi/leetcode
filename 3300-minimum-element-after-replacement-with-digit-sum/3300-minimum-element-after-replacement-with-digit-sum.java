class Solution {
    public int minElement(int[] nums) {
        for(int i = 0; i< nums.length ; i++){
            int digit =0;
            int sum =0;
            while(nums[i]!=0){
                digit = nums[i]%10;
                nums[i]/=10;
                sum +=digit;
            }
            
            nums[i] = sum;

        }
        int min =100;
        for(int i =0; i<nums.length;i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}