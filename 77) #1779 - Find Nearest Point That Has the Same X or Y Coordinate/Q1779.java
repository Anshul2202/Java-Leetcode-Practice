import java.util.*;

class Solution1779 {
    public int nearestValidPoint(int x, int y, int[][] points) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int dst = Integer.MAX_VALUE;
        int idx = -1;
        
        for(int i = 0; i < points.length; i++){
            int val1 = points[i][0];
            int val2 = points[i][1];

            if(val1 == x || val2 == y){
                list.add(new ArrayList<>(Arrays.asList(val1 , val2 , i)));
            }
        }

        for(int i = 0; i < list.size(); i++){
            int x1 = list.get(i).get(0);
            int y1 = list.get(i).get(1);

            int currentDst = Math.abs(x - x1) + Math.abs(y - y1);

            if( currentDst < dst){
                dst = currentDst;
                idx = list.get(i).get(2);
            }
        }

        return idx;
    }
}