class Solution67 {
    public String addBinary(String a, String b) {
        String output = "";
        char ch1 = ' ';
        char ch2 = ' ';
        char carry = ' ';
        int len = 0;

        if(a.length() > b.length()){
            len = a.length();
        }
        else{
            len = b.length();
        }

        for(int i = 0; i <= len; i++){

            if(i == len){

                if(carry == '0'){
                    return output;
                }
            }

            try{
                ch1 = a.charAt(a.length() - 1 - i);
            }
            catch(StringIndexOutOfBoundsException e){
                ch1 = '0';
            }
            
            try{
                ch2 = b.charAt(b.length() - 1 - i);
            }
            catch(StringIndexOutOfBoundsException e){
                ch2 = '0';
            }

            if(ch1 == '1' && ch2 == '1'){
                
                if(carry == '1'){
                    output = "1" + output;
                    carry = '1';
                } 
                else{
                    output = "0" + output;
                    carry = '1';
                }
            }
            else if((ch1 == '1' && ch2 == '0') || (ch1 == '0' && ch2 == '1') ){

                if(carry == '1'){
                    output = "0" + output;
                    carry = '1';
                }
                else{
                    output = "1" + output;
                    carry = '0';
                }
            }
            else if(ch1 == '0' && ch2 == '0'){

                if(carry == '1'){
                    output = "1" + output;
                    carry = '0';
                }
                else{
                    output= "0" + output;
                    carry = '0';
                }
            }

        }

        return output;
        
    }
}