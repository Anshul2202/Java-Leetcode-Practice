class Solution392 {
    public boolean isSubsequence(String s, String t) {

        if(s.length() == 0){
            return true;
        }

        StringBuilder sb = new StringBuilder(t);

        char ch = ' ';
        boolean cdn = true;
        int idx = 0;

        for(int i = 0; i < s.length(); i++){
            ch = s.charAt(i);
            cdn = true;

            for(int j = idx ; j < sb.length() && cdn; j++){

                if(ch == sb.charAt(j)){
                    sb.deleteCharAt(j);
                    cdn = false;
                    idx = j;
                }
            }
        }

        if(sb.length() == t.length() - s.length()){
            return true;
        }
        else{
            return false;
        }
    }
}