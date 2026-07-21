class Solution1295 {
    public int findNumbers(int[] nums) {
        StringBuilder sb = new StringBuilder();
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            sb.setLength(0);
            sb.append(nums[i]);

            if (sb.length() % 2 == 0) {
                result++;
            }
        }

        return result;
    }
}