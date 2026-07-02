class Solution434 {
    public int countSegments(String s) {

        if(s.length() == 0){
            return 0;
        }
        
        String[] words = s.split(" ");
        
        int count = 0;

        for(int i = 0; i < words.length; i++){

            if(!words[i].equals("")){
                count++;
            }
        }

        return count;
        
    }
}