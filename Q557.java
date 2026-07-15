class Solution557 {
    public int findLUSlength(String a, String b) {
        
        if(!a.equals(b)){

            if(a.length() > b.length()){
                return a.length();
            }
            else{
                return b.length();
            }
        }
        else{
            return -1;
        }
    }
}