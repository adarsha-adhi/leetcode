class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        int pivot = start;

        // If target is in right half
        if (target >= nums[pivot] && target <= nums[nums.length - 1]) {
            start = pivot;
            end = nums.length - 1;
        } 
        // Otherwise target is in left half
        else {
            start = 0;
            end = pivot - 1;
        }
            
            while(start<=end){
                int mid1 = start+(end-start)/2;
                if(nums[mid1]>target){
                    end=mid1-1;
                }else if(nums[mid1]<target){
                    start= mid1+1;
                }else{
                    return mid1;
                }
            }
            return -1;
    }
}