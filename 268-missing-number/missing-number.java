class Solution {
    public int missingNumber(int[] nums) {
        int range = nums.length;
        int actualsum = (range * (range + 1))/2;
        int current = 0;
        for(int i = 0; i<nums.length; i++){
            current = current + nums[i];
        }
        int ans = actualsum - current;
        return ans;
    }
}