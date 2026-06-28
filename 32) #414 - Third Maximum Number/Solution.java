import java.util.*;

class Solution414 {
    public int thirdMax(int[] nums) {

        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        int max = 0;

        for(int i = 0; i < nums.length; i++){
            set.add(nums[i]);

            if(nums[i] > max){
                max = nums[i];
            }
        }

        int n = 0;
        for(int i : set){
            n++;
            if(n == 3){
                return i;
            }
        }

        return max;
    }
}