import java.util.*;

class Solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set1 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            set1.add(nums1[i]);
        }

        HashSet<Integer> set2 = new HashSet<>();

        for(int i = 0; i < nums2.length; i++){
            set2.add(nums2[i]);
        }

        set1.retainAll(set2);

        int intersection[] = new int[set1.size()];

        int j = 0;
        
        for(int i : set1){
            intersection[j] = i;
            j++;
        }

        return intersection;
    }
}