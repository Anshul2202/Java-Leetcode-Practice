// 1260 - Shift 2D Grid

import java.util.*;

class Solution1260{
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        k = k % (grid.length * grid[0].length);

        for(int i = 0; i < k; i++){
            rightShift(grid);
        }

        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < grid.length; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < grid[0].length; j++){
                temp.add(grid[i][j]);
            }
            list.add(new ArrayList<>(temp));
        }

        return list;
    }

    public void rightShift(int[][] arr){

        int prev = arr[arr.length - 1][arr[0].length - 1];
        int temp = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){

                temp = arr[i][j];
                arr[i][j] = prev;
                prev = temp;
            }
        }
    }
}