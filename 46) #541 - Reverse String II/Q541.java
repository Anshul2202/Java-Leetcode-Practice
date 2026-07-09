import java.util.*;

class Solution541 {
    public String reverseStr(String s, int k) {
        ArrayList<String> list = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        StringBuilder sb = new StringBuilder();
        int i = 0;
        int count = 0;

        while(true){

            if(i == s.length()){
                list.add(sb.toString());
                break;
            }

            sb.append(s.charAt(i));
            count++;

            if(count % (2*k) == 0){
                list.add(sb.toString());
                sb.setLength(0);
                count = 0;
            }

            i++;
        }

        
        for(int j = 0; j < list.size(); j++){
            sb.setLength(0);

            if(list.get(j).length() < k){

                sb.append(list.get(j));
                sb.reverse();
                result.append(sb);
                break;
            }


            sb.append(list.get(j));
            StringBuilder halfStr = new StringBuilder(sb.substring(0 , k));

            halfStr.reverse();

            sb.replace(0 , k , halfStr.toString());
            result.append(sb);
        }

        return result.toString();
    }
}