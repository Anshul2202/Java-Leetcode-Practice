class Solution1684 {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for(int i = 0; i < words.length; i++){

            if(words[i].matches("[" + allowed + "]+")){
                count++;
            }
        }

        return count;
    }
}