// 1260 - Shift 2D Grid

import java.util.*;

class Solution1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        k = k % (grid.length * grid[0].length);
        
        int[] arr = new int[grid.length * grid[0].length];
        int idx = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                arr[idx++] = grid[i][j];
            }
        }

        reverseArr(arr, arr.length - k, arr.length - 1);
        reverseArr(arr, 0 , arr.length - k - 1);
        reverseArr(arr, 0 , arr.length - 1);

        List<List<Integer>> ans = new ArrayList<>();
        idx = 0;

        for(int i = 0; i < grid.length; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < grid[0].length; j++){
                temp.add(arr[idx++]);
            }
            ans.add(temp);
        }

        return ans;

    }

    public static void reverseArr(int[] arr, int start, int end){

        int i = start, j = end;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}