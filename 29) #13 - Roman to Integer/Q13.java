class Solution13 {
    public int romanToInt(String s) {
        char ch = ' ';
        int val = 0;
        int prev = 0;
        int result = 0;
        int temp = 0;

        for(int i = 0; i < s.length(); i++){

            if(i == 0){
                prev = 0;
            }
            else{
                prev = val;
            }

            ch = s.charAt(i);

            switch(ch){
                case 'I': 
                    val = 1;
                    break;
                case 'V':
                    val = 5;
                    break;
                case 'X':
                    val = 10;
                    break;
                case 'L':
                    val = 50;
                    break;
                case 'C':
                    val = 100;
                    break;
                case 'D':
                    val = 500;
                    break;
                case 'M':
                    val = 1000;
                    break;
            }


            if(val <= prev){
                result += val;
            }
            else if(val > prev){
                temp = val - prev;
                result -= prev;
                result += temp;
            }

        }

        return result;
        
    }
}