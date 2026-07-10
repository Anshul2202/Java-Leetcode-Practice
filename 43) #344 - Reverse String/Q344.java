class Q344 {
    public void reverseString(char[] s) {
        char forwardChar = ' ';
        char backwardChar = ' ';
        
        for(int i = 0; i < s.length/2; i++){
            forwardChar = s[i];
            backwardChar = s[s.length - 1 - i];

            s[i] = backwardChar;
            s[s.length - 1 - i] = forwardChar;
        }
    }
}