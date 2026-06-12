class Solution {
    public int maxProduct(int[] nums) {
        long maxpro=Integer.MIN_VALUE;
        long pref=1;
        long suff=1;
        for(int i=0;i<nums.length;i++){
            if(pref==0) pref=1;
            if(suff==0) suff=1;
            pref = pref * nums[i];
            suff = suff * nums[nums.length-1-i];
            maxpro=Math.max(maxpro,Math.max(pref,suff));
        }
        return (int)maxpro;
    }
}