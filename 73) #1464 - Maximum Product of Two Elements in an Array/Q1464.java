class Solution1464 {
    public int maxProduct(int[] nums) {
        int lrgstNum = 0;
        int secLrgstNum = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] > secLrgstNum && nums[i] <= lrgstNum){
                secLrgstNum = nums[i];
            }
            
            if(nums[i] > lrgstNum){
                secLrgstNum = lrgstNum;
                lrgstNum = nums[i];
            }

        }

        return (lrgstNum - 1) * (secLrgstNum - 1);
    }
}