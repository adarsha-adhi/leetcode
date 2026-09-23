class Solution {
    public int minOperations(int[] nums, int x) {
        int left =0;
        int sum = 0;
        int op = -1;
        int Winsum =0;
        for(int n : nums){
            sum+=n;
        }
        int target = sum -x;
        if(target<0){
            return -1;
        }
        for(int i =0; i<nums.length;i++){
            Winsum+=nums[i];

            while(Winsum>target){
                Winsum-=nums[left];
                left++;
                
            }
            if(Winsum==target){
                int len = i-left+1;
                int operations = nums.length-len;

                if(op==-1||operations<op){
                    op = operations;
                }
            }
        }
        return op;

    }
}