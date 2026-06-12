class Solution {
    public int diagonalSum(int[][] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i][i];
            if(i!=arr.length-1-i){
            sum+=arr[i][arr.length-1-i];}
             
        }
        return sum;
    }
}