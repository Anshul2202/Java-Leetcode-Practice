import java.util.*;

class Solution389 {
    public char findTheDifference(String s, String t) {
        HashMap<Character , Integer> map = new HashMap<>();
        char ch = ' ';

        if(t.length() == 1){
            return t.charAt(0);
        }

        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);

            map.put(ch , map.getOrDefault(ch , 0) + 1);
        }

        char ch2 = ' ';

        for(int i = 0; i < t.length(); i++){
            ch2 = t.charAt(i);

            if(map.containsKey(ch2) && map.get(ch2) == 0){
                return ch2;
            }

            if(map.containsKey(ch2)){
                map.put(ch2 , map.get(ch2) - 1);
            }
            else{
                return ch2;
            }
        }

        return ch2;
    }
}