class Solution9 {
    public boolean isPalindrome(int x) {

        if(x < 0){
            return false;
        }


        int i = 0;
        String str = x + "";
        char forward = ' ';
        char backward = ' ';
        
        while(i < str.length()/2){
            forward = str.charAt(i);
            backward = str.charAt(str.length() - 1 - i);

            if(forward != backward){
                return false;
            }

            i++;
        }

        return true;
    }
}