class Solution {
    public int dominantIndex(int[] nums) {
        int largest = nums[0];
        int pos = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]>largest){
                largest = nums[i];
                pos = i;
            }


        }
        for(int i = 0; i < nums.length; i++) {
            if(i == pos)
                continue;

            if(nums[i] * 2 > largest)
                return -1;
        }
        return pos;
    }
}

