class Solution1903 {
    public String largestOddNumber(String num) {
        StringBuffer sb = new StringBuffer(num);
        char ch = ' ';
        int val = 0;
        String result = "";

        for(int i = 0; i < num.length(); i++){

            ch = num.charAt(num.length() - 1 - i);
            val = Integer.parseInt(ch + "");

            if(val % 2 != 0){
                result = sb.toString();
                return result;  
            }

            sb.deleteCharAt(sb.length() - 1);

        }
        
        return result;
    }
}