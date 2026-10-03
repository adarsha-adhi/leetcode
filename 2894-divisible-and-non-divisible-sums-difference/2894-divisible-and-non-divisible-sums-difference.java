class Solution {
    public int differenceOfSums(int n, int m) {
        ArrayList <Integer> a1 = new ArrayList<>();
        int ans = n*(n+1)/2;
        for(int i = 1; i<=n;i++){
            if(i%m==0){
                a1.add(i);
            }
        }
        int sum =0;
        for(int a:a1){
            sum+=a;
        }
        int value = ans-sum;

        return value-sum;
    }
}