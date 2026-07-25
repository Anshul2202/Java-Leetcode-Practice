class Solution1832 {
    public boolean checkIfPangram(String sentence) {
        
        for(char ch = 'a'; ch <= 'z'; ch++){
            
            if(sentence.indexOf(ch) == -1){
                return false;
            }
        }
        
        return true;
    }
}