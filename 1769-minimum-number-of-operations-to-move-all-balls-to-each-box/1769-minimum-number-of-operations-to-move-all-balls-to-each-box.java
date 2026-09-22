class Solution {
    public int[] minOperations(String boxes) {
        int[] ans = new int[boxes.length()];
        for(int i = 0; i<ans.length;i++){
            int operations = 0;
            for(int j = 0; j<boxes.length();j++){
                if(boxes.charAt(j)=='1'){
                    operations += Math.abs(j-i);
                }
            }
            ans[i] = operations;
        }
        return ans;
    }
}