class Solution415 {
    public String addStrings(String num1, String num2) {

        int len = 0;

        if(num1.length() > num2.length()){
            len = num1.length();
        }
        else{
            len = num2.length();
        }

        char ch1 = ' ';
        char ch2 = ' ';
        char carry = '0';
        int temp = 0;
        StringBuilder result = new StringBuilder();



        for(int i = 0; i <= len; i++){

            if(i == len){

                if(carry != '0'){
                    result.insert(0 , carry);
                    return result.toString();
                }
                else{
                    continue;
                }
            }

            try{
                ch1 = num1.charAt(num1.length() - 1 - i);
            }
            catch(Exception e){
                ch1 = '0';
            }

            try{
                ch2 = num2.charAt(num2.length() - 1 - i);
            }
            catch(Exception e){
                ch2 = '0';
            }

            if(carry == '0'){
                temp = (((int) ch1 + (int) ch2) - 96);
            }
            else{
                temp = (((int) carry + (int) ch1 + (int) ch2 - 144));
            }

            result.insert(0 , temp % 10);

            carry = (char) ((temp / 10) + 48);

        }

        return result.toString();
    }
}