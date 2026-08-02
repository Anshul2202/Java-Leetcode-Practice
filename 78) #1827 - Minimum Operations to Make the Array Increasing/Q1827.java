class Solution1827 {
    public int minOperations(int[] nums) {
        int opCount = 0;
        
        for(int i = 1; i < nums.length; i++){
            while(nums[i - 1] >= nums[i]){
                nums[i] += 1;
                opCount++;
            }
        }

        return opCount;
    }
}