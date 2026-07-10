class Solution551 {
    public boolean checkRecord(String s) {
        
        if(s.matches(".*L{3,}.*")){
            return false;
        }

        int totalAb = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if(ch == 'A'){
                totalAb++;
            }
        }

        if(totalAb > 1){
            return false;
        }

        return true;
    }
}