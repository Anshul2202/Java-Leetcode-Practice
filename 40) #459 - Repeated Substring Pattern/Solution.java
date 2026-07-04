import java.util.*;

class Solution459 {
    public boolean repeatedSubstringPattern(String s) {
        StringBuilder sb = new StringBuilder(s);
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i < s.length(); i++){

            if(s.length() % i == 0){
                list.add(i);
            }
        }

        int len = 0;
        String str = "";
        StringBuilder finalStr = new StringBuilder();

        for(int i = 0; i < list.size(); i++){
            str = sb.substring(0 , list.get(i));
            len = s.length() / str.length();

            for(int j = 0; j < len; j++){
                finalStr.append(str);
            }

            if(finalStr.toString().equals(s)){
                return true;
            }
            else{
                finalStr.setLength(0);
            }
        }

        return false;
    }
}