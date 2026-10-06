class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int ans =0;
        for(int i =0;i<accounts.length;i++){
            for(int j =0;j<accounts[i].length;j++){
                ans += accounts[i][j];
            }
            if(ans>max){
                max = ans;
            }
            ans =0;
        }
        return max;
    }
}