import java.util.*;

// Easy

class Solution169 {
    public int majorityElement(int[] nums) {

        LinkedHashMap<Integer , Integer> map = new LinkedHashMap<>();
        int firstNum = nums[0];
        int count = getCount(firstNum , nums);

        map.put(firstNum , count);

        int finalVal = firstNum;

        int num = 0;
        int tempCount = 0;

        for(int i = 1; i < nums.length; i++){

            if( !(map.containsKey(nums[i])) ){

                num = nums[i];
                tempCount = getCount(num , nums);
                map.put(num , tempCount);

                if(tempCount > count){
                    count = tempCount;
                    finalVal = num;
                }

            }

        }


        
        return finalVal;
    }

    public static int getCount(int n , int[] arr){

        int a = 0;

        for(int i = 0; i < arr.length; i++){

            if(n == arr[i]){
                a++;
            }
        }

        return a;
    }


}