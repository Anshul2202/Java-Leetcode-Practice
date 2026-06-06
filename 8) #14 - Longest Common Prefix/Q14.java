class Solution14 {
    public String longestCommonPrefix(String[] strs) {
        String result = "";
        int i = 0;
        int j = 0;

        String str1 = strs[0];
        String str2 = strs[i];

        for(int k = j; k < str2.length(); k++){

            while(str1.charAt(j) == str2.charAt(j)){
                i++;

                if(i >= strs.length){
                    result += str1.charAt(j);
                    j++;
                    i = 0;
                    str2 = strs[i];
                } else{
                    str2 = strs[i];
                }

                if(j >= str2.length()){
                    return result;
                }

                
            }
        }

        return result;

        
    }
}