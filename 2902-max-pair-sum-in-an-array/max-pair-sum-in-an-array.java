class Solution {
    public int maxSum(int[] nums) {
        int max=-1;
        
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(maxdigit(nums[i])==maxdigit(nums[j])){
                        
                   max=Math.max((nums[i]+nums[j]),max);
                }
                
            }
        }

        return max;
    }
    public int maxdigit(int n){
        int max=Integer.MIN_VALUE;
        while(n!=0){
            int rem=n%10;
            max=Math.max(rem,max);
            n=n/10;
        }
        return max;
    }
}