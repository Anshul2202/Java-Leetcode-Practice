import java.util.*;

class Solution2215 {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> answer = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        boolean isPresent1 = false;
        boolean isPresent2 = false;
        

        for(int i = 0; i < nums1.length; i++){

            isPresent1 = false;

            for(int j = 0; j < nums2.length; j++){

                if(nums1[i] == nums2[j]) isPresent1 = true;
            }

            if(!isPresent1 && !list1.contains(nums1[i])) list1.add(nums1[i]);
        }


        for(int i = 0; i < nums2.length; i++){

            isPresent2 = false;

            for(int j = 0; j < nums1.length; j++){

                if(nums2[i] == nums1[j]) isPresent2 = true;
            }

            if(!isPresent2 && !list2.contains(nums2[i])) list2.add(nums2[i]);
        }


        answer.add(list1);
        answer.add(list2);

        return answer;

    }
}