class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String [] ans = new String[names.length];
        int max =0;
        int k =0;
        while(k<ans.length){
            for(int i =0; i<heights.length;i++){

            if(heights[i]>heights[max]){
                max = i;
            }
            
        }
        heights[max] = 0;
        ans[k]=names[max];
        k++;
        }
        return ans;
    }
}