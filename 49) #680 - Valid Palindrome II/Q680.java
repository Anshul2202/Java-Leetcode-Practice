class Solution680 {
    public boolean validPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        Boolean canRemove = true;

        if(sb.reverse().toString().equals(s)){
            return true;
        }

        for(int i = 0; i < s.length()/2; i++){
            char leftCh = s.charAt(i);
            char rightCh = s.charAt(s.length() - 1 - i);

            if(!canRemove && (rightCh != leftCh)){
                return false;
            }

            if(rightCh != leftCh && canRemove){

                canRemove = false;
                sb.setLength(0);
                sb.append(s);
                sb.deleteCharAt(i);
                String testStr1 = sb.toString();

                if(sb.reverse().toString().equals(testStr1)){
                    return true;
                }
                
                sb.setLength(0);
                sb.append(s);
                sb.deleteCharAt(s.length() - 1 - i);
                String testStr2 = sb.toString();

                if(sb.reverse().toString().equals(testStr2)){
                    return true;
                }
                else{
                    return false;
                }

            }


        }

        return true;
    }
}