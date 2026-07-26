class Solution1672 {
    public int maximumWealth(int[][] accounts) {
        int richestWealth = 0;
        int currentWealth = 0;
        
        for(int i = 0; i < accounts.length; i++){

            currentWealth = 0;

            for(int j = 0; j < accounts[i].length; j++){
                currentWealth += accounts[i][j];
            }

            if(currentWealth > richestWealth){
                richestWealth = currentWealth;
            }
        }

        return richestWealth;
    }
}