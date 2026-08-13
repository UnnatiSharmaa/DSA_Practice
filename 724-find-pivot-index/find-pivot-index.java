class Solution {
    public int pivotIndex(int[] nums) {
    int s1=0;
    
    
        for(int i=0;i<nums.length;i++){
         int s2=0;
            
            for(int j=i+1;j<nums.length;j++){
            s2=s2+nums[j];}
            if(s1==s2){
                return i;
                
            }
            s1+=nums[i];

            
        }
        return -1;
    }}
