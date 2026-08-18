class Solution {
    public int maxProduct(int[] nums) {
        long maxpro=Integer.MIN_VALUE;
        long prefix=1;
        
        long suffix=1;

        for(int i=0;i<nums.length;i++){
            prefix=prefix*nums[i];
            suffix=suffix*nums[nums.length-1-i];
            maxpro=Math.max(maxpro,Math.max(suffix,prefix));
            if(prefix==0){
                prefix=1;
            }
            if(suffix==0){
                suffix=1;
            }
        }
        return (int)maxpro;
    }
}