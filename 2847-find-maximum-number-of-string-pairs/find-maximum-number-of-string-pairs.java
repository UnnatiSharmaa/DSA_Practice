class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count =0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(rev(words[i]).equals(words[j])){
                    count++;
                }
            }
        }
        return count;
    }
    public String rev(String s){
       return new StringBuilder(s).reverse().toString();
    }
}