import java.util.*;

class Solution1859 {
    public String sortSentence(String s) {

        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int order = 0;

        TreeMap<Integer , Integer> map = new TreeMap<>();

        for(int i = 0; i < arr.length; i++){
            sb.setLength(0);
            order = (int) sb.append(arr[i]).charAt(sb.length() - 1);

            map.put(order, i);
        }

        sb.setLength(0);
        for(int key : map.keySet()){
            String str = arr[map.get(key)];
            sb.append(str.substring(0 , str.length() - 1));
            sb.append(" ");
        }

        return sb.toString().trim();
        
    }
}