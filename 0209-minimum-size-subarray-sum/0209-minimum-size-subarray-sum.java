class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int low = 0;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum += nums[i];
            while(sum >= target) {
                min = Math.min(min,i-low+1);
                sum -= nums[low];
                low++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}