class Solution {
    public boolean isPalindrome(String n) {
        String p=n.toLowerCase();
        String q=p.replaceAll("[^A-Za-z0-9]","");



 for(int i=0;i<(q.length()/2);i++){
            if(q.charAt(i)!=q.charAt(q.length()-1-i)){
               return false;
            }
            

        }

        return true;
    }
}