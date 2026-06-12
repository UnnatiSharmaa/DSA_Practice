class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
       int count[]=new int[26];
       char cht[]=s.toCharArray();
       for(int i=0;i<cht.length;i++){
        count[s.charAt(i)-97]++;
       
       }
       char ch[]=t.toCharArray();
       for(int i=0;i<ch.length;i++){
        count[t.charAt(i)-97]--;
       
       }
       for(int i=0;i<count.length;i++){
        if(count[i]!=0){
            return false;
        }
       }
       return true;

    }
}