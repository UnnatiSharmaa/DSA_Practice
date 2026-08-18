class Solution {
    public int maxSubArray(int[] nums) {
        int Maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++ ){
            sum+=nums[i];
            Maxsum=Math.max(sum,Maxsum);
            if(sum<0){
                sum=0;
            }
        }
      return Maxsum;  
    }
}