import java.util.*;

class Solution1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        LinkedList<Integer> list = new LinkedList<>(); 
        
        for(int i = 0; i < nums.length; i++){
            list.add(0);
        }

        for(int i = 0; i < nums.length; i++){
            list.add(index[i] , nums[i]);
        }

        int[] result = new int[nums.length];

        for(int i = 0; i < result.length; i++){
            result[i] = list.get(i);
        }

        return result;

    }
}