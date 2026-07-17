class Solution643 {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        double sum = 0;

        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        
        avg = sum/k;

        double tempAvg = 0;
        
        for(int i = 0; i < nums.length - k; i++){
            sum -= nums[i];
            sum += nums[k + i];
            tempAvg = sum/k;

            if(tempAvg > avg){
                avg = tempAvg;
            }
        }

        return avg;
    }
}