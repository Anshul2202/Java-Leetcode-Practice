import java.util.*;

class Solution387 {
    public int firstUniqChar(String s) {

        HashMap<Character , Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){

            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , i);
            }
            else{
                map.put(s.charAt(i) , -1);
            }
        }

        int result = s.length() - 1;
        boolean condition = false;

        for(char key : map.keySet()){

            if(map.get(key) != -1 && map.get(key) <= result){
                result = map.get(key);
                condition = true;
            }
        }

        if(condition){
            return result;
        }
        else{
            return -1;
        }
        
    }
}