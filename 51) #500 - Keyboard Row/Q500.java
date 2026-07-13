import java.util.*;

class Solution500 {
    public String[] findWords(String[] words) {
        
        ArrayList<String> list = new ArrayList<>();

        for(int i = 0; i < words.length; i++){
            String str = words[i].toLowerCase();

            if(str.matches("[qwertyuiop]+")){
                list.add(words[i]);
            }

            if(str.matches("[asdfghjkl]+")){
                list.add(words[i]);
            }

            if(str.matches("[zxcvbnm]+")){
                list.add(words[i]);
            }
        }

        return list.toArray(new String[0]);
    }
} 
