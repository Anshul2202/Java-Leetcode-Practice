class Solution557 {
    public String reverseWords(String s) {
        
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for(int i = 0; i < words.length; i++){
            sb.setLength(0);
            sb.append(words[i]);
            sb.reverse();
            result.append(sb);
            result.append(" ");
        }

        return result.toString().trim();
    }
}