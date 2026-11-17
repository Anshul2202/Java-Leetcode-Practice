// 1380 - Lucky Numbers in a Matrix

import java.util.*;

class Solution1380 {
    public List<Integer> luckyNumbers(int[][] matrix) {

        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < matrix.length; i++){

            int minIdx = findMin(matrix, i);
            int val = matrix[i][minIdx];

            int maxVal = -1;

            for(int j = 0; j < matrix.length; j++){
                
                if(matrix[j][minIdx] > maxVal) maxVal = matrix[j][minIdx];
            }

            if(val == maxVal){
                list.add(val);
            }
        }

        return list;
    }

    public int findMin(int[][] mat, int row){

        int min = Integer.MAX_VALUE;
        int colIdx = -1;

        for(int j = 0; j < mat[0].length; j++){
            
            if(mat[row][j] < min){
                min = mat[row][j];
                colIdx = j;
            }
        }

        return colIdx;
    }
}