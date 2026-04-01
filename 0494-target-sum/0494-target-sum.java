class Solution {
    public int findTargetSumWays(int[] nums, int target) {
     return solve(nums,target,0,0) ;  
    }
    public int solve(int nums[],int target,int sum,int i){
        if(i==nums.length){
            if(sum==target) return 1;
            else return 0;
        }
       int plus= solve(nums,target,sum+nums[i],i+1);
       int sub= solve(nums,target,sum-nums[i],i+1);
        return plus+sub;
    }
}