class Solution2574 {
    public int[] leftRightDifference(int[] nums) {
        int leftSum = 0;
        int rightSum  = 0;
        int [] answer = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            
            // for leftSum
            leftSum = 0;
            for(int j = 0; j < i; j++){
                leftSum += nums[j];
            }

            // for rightSum
            rightSum = 0;
            for(int j = i + 1; j < nums.length; j++){
                rightSum += nums[j];
            }

            answer[i] = Math.abs(leftSum - rightSum);

        }
        
        return answer;
    }
}