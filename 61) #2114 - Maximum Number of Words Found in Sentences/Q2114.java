import java.util.*;

class Solution2114 {
    public int mostWordsFound(String[] sentences) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < sentences.length; i++){

            String[] arr = sentences[i].split(" ");
            list.add(arr.length);
        }

        int result = 0;
        
        for(int i : list){

            if(i > result){
                result = i;
            }
        }

        return result;
    }
}