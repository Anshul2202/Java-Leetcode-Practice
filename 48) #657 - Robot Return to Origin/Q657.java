import java.util.*;

class Solution657 {
    public boolean judgeCircle(String moves) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(0 , 0));

        for(int i = 0; i < moves.length(); i++){
            char currentMove = moves.charAt(i);

            switch(currentMove){

                case 'R':
                    list.set(0 , list.get(0) + 1);
                    break;
                case 'L':
                    list.set(0 , list.get(0) - 1);
                    break;
                case 'U':
                    list.set(1 , list.get(1) + 1);
                    break;
                case 'D':
                    list.set(1 , list.get(1) - 1);
                    break;
            }
        }

        if(list.get(0) == 0 && list.get(1) == 0){
            return true;
        }

        return false;
    }
}