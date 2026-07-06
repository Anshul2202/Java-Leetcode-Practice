class Solution771 {
    public int numJewelsInStones(String jewels, String stones) {
        char jewelStone = ' ';
        int count = 0;

        for(int i = 0; i < jewels.length(); i++){
            jewelStone = jewels.charAt(i);

            for(int j = 0; j < stones.length(); j++){

                if(stones.charAt(j) == jewelStone){
                    count++;
                }
            }
        }

        return count;
    }
}