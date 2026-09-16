class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int count =0;
        int [] ans = new int[friends.length];
        for(int i =0; i<order.length;i++){
            for(int j =0;j<friends.length;j++){
                if(order[i]==friends[j]){
                    ans[count]=friends[j];
                    count++;
                }
            }
        }
        return ans;
    }
}