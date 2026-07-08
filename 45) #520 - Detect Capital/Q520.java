class Solution450 {
    public boolean detectCapitalUse(String word) {

        if(word.matches("[A-Z]+")){
            return true;
        }

        if(word.matches("[a-z]+")){
            return true;
        }

        String firstChar = word.charAt(0) + "";

        if(firstChar.matches("[A-Z]")){

            for(int i = 1; i < word.length(); i++){
                String str = word.charAt(i) + "";

                if(!str.matches("[a-z]")){
                    return false;
                }
            }

            return true;
        }

        return false;
        
    }
}