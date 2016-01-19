public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        
        if(nums.length == 0)
            return 0;
            
        if(nums.length == 1)
            return nums[0];
        
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        for(int i = 2; i < nums.length; i++){
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        
        return dp[n-1];
    }
}

//����ؼ������ҵ�dp[i]��dp[i-1]�ĵ��ƹ�ϵ