class Solution {
    public int mostWordsFound(String[] sentences) {
        int max =0;
        for(int i =0; i<sentences.length;i++){
            int count =1;
            String ans = sentences[i];
            for(int j =0;j<ans.length();j++){
                if(ans.charAt(j)==' '){
                    count++;
                }
            }
            if(count>max)
            max=count;
        }
        return max;
    }
}