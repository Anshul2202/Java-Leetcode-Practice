import java.util.*;

class Solution345 {
    public String reverseVowels(String s) {

        ArrayList<Character> list = new ArrayList<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                list.add(ch);
            }
            else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                list.add(ch);
            }
        }

        StringBuilder sb = new StringBuilder(s);
        int idx = list.size() - 1;

        for(int i = 0; i < sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.setCharAt(i , list.get(idx));
                idx--;
            }
            else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                sb.setCharAt(i , list.get(idx));
                idx--;
            }

        }

        return sb.toString();

    }


}
