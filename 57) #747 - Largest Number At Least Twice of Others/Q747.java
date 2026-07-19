class Solution747 {
    public int dominantIndex(int[] nums) {
        int lrgstNum = 0;
        int secLrgstNum = 0;
        int idx = 0;

        for(int i = 0; i < nums.length; i++){
            
            if(nums[i] > lrgstNum){

                secLrgstNum = lrgstNum;
                lrgstNum = nums[i];
                idx = i;

            }

            if(nums[i] > secLrgstNum && nums[i] < lrgstNum){
                secLrgstNum = nums[i];
            }

        }

        if(lrgstNum >= (secLrgstNum * 2)){
            return idx;
        }
        else{
            return -1;
        }
    }
}