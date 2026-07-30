class Solution1748 {
    public int sumOfUnique(int[] nums) {

        int sum = 0;
        int count = 0;
        boolean isUnique = true;
        
        for(int i = 0; i < nums.length; i++){

            isUnique = true;
            count = 0;
            for(int j = 0; j < nums.length; j++){

                if(nums[i] == nums[j]) count++;

                if(count >= 2){
                    isUnique = false;
                    break;
                }
            }

            if(isUnique) sum += nums[i];
        }

        return sum;
    }
}