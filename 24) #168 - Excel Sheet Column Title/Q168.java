class Solution168 {
    public String convertToTitle(int columnNumber) {
        int val = 0;
        char chr = ' ';
        String result = "";
        
        while(columnNumber > 0){
            columnNumber--;
            val = columnNumber % 26;
            chr = (char)('A' + val);
            columnNumber /= 26;
            result = chr + result;
        }

        return result;
    }
}