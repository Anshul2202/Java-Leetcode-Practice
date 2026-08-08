class Solution1470 {
    public int[] shuffle(int[] nums, int n) {
        
        int[] result = new int[2*n];
        int idx = 0;

        for(int i = 0; i < n; i++){
            result[idx] = nums[i];
            idx++;

            result[idx] = nums[n + i];
            idx++;
        }

        return result;
    }
}