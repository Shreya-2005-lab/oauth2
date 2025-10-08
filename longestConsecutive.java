class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest =1;
        int lastShort = Integer.MIN_VALUE;
        int count = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]-1 == lastShort){
                count =count+1;
                lastShort = nums[i];
            }
            else if(nums[i] != lastShort){
                count =1;
                lastShort = nums[i];
            }
            longest = Math.max(longest, count);
        }
        return longest;
    }
}
