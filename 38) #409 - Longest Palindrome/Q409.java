import java.util.*;

class Solution409 {
    public int longestPalindrome(String s) {
        
        HashMap<Character , Integer> map = new HashMap<>();

        char ch = ' ';
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);

            if(!map.containsKey(ch)){
                map.put(ch , 1);
            }
            else{
                count = map.get(ch) + 1;
                map.put(ch , count);
            }
        }

        int val = 0;
        int finalLength = 0;
        boolean condition = false;

        for(char key : map.keySet()){
            val = map.get(key);

            if(val % 2 == 0){
                finalLength += val;
            }
            else{
                finalLength += val - 1;
                condition = true;
            }
        }

        if(condition){
            finalLength++;
            return finalLength;
        }
        else{
            return finalLength;
        }
    }
}