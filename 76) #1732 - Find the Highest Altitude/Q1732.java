class Solution1732 {
    public int largestAltitude(int[] gain) {
        int highestAlt = 0;
        int currentAlt = 0;
        
        for(int i = 0; i < gain.length; i++){
            currentAlt += gain[i];
            
            if(currentAlt > highestAlt) highestAlt = currentAlt;
        }

        return highestAlt;
    }
}